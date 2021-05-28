package c20210527

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}
import java.nio.charset.StandardCharsets

class Main1Spec extends AnyFlatSpec with should.Matchers {

  "1st code" should "get actual result" in {
    val input = "2\n-3 6\n4 2"
    val answer = "Yes"
    System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)))

    Main1.main(Array.empty)

    val outPutStream = new ByteArrayOutputStream()
    val out: PrintStream = new PrintStream(outPutStream)
    System.setOut(out)

    val resultOutput = outPutStream.toString("utf8")
    resultOutput should be (answer)
  }

}
