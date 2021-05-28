package c20210527

object SampleInput0527_32 {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val values = lines.next().map(_.toString.toInt).toList
    val current = values.map(_.toInt).sum % 3
    val num2 = values.filter(v => v == 2 || v == 5 || v == 8)
    val num1 = values.filter(v => v == 1 || v == 4 || v == 7)
  }
}
