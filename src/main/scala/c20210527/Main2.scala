package c20210527

object Main2 {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val Array(a, b, ans) = lines.next().split(" ").map(_.toInt)
    val output = (a + b == ans, a - b == ans) match {
      case (true, true) => "?"
      case (true, false) => "+"
      case (false, true) => "-"
      case (false, false) => "!"
    }
    println(output)
  }
}
