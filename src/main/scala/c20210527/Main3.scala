package c20210527

object Main3 {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val values = lines.next().map(_.toString.toInt).toList
    val currentRemainder = values.map(_.toInt).sum % 3
    val remainder1size = values.count(v => v % 3 == 1)
    val remainder2size = values.count(v => v % 3 == 2)

    if (currentRemainder == 1) {
      if(remainder1size >= 1 && values.length != remainder1size) {
        println(1)
      } else if (remainder2size >= 2 && values.length != remainder2size) {
        println(2)
      } else {
        println("-1")
      }
    } else if (currentRemainder == 2) {
      if(remainder2size >= 1 && values.length != remainder2size) {
        println(1)
      } else if (remainder1size >= 2 && values.length != remainder1size) {
        println(2)
      } else {
        println("-1")
      }
    } else {
      println(0)
    }
  }
}
