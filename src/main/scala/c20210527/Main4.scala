package c20210527

import scala.collection.mutable.ListBuffer

object Main4 {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val _ = lines.next()
    val values = lines.next().split(" ").map(_.toInt)
    val countArray = (0 until 9).map(_ => 0).toArray
    values.foreach(v => countArray(Math.min(v / 400, 8)) += 1)
    val eachColorCount = countArray.filter(_ != 0).toList
    val min = Math.min(countArray.init.count(_ != 0), 1)
    val max = eachColorCount.length + Math.max(countArray.last - 1, 0)
    println(min + " " + max)
  }
}
