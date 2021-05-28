package c20210527

object Main1 {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val _ = lines.next()
    val vecA = lines.next().split(" ").map(_.toInt)
    val vecB = lines.next().split(" ").map(_.toInt)
    val ans = vecA.zip(vecB).map { case (a, b) => a * b }.sum
    println(if(ans == 0) "Yes" else "No")
  }
}
