package c20210527

object Main5 {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val size = lines.next().toInt
    val buf = (0 until size).map(_ => 0).toArray
    lines.next().split(" ").foreach(value => buf(value.toInt) += 1)

    if (size % 2 == 0) {
      (0 until buf.length / 2).foreach { i =>
        if (buf(2 * i) != 0 || buf(2 * i + 1) != 2){
          println(0)
          return;
        }
      }
      println(calculatePow(size))
    } else {
      if (buf(0) != 1){
        println(0)
        return;
      }
      (1 until size / 2).foreach { i =>
        if (buf(2 * i - 1) != 0 || buf(2 * i) != 2){
          println(0)
          return;
        }
      }
      println(calculatePow(size - 1))
    }
  }

  def calculatePow(size: Int): Long = {
    (0 until size / 2).foldLeft(1L) { case (current, _) => (current * 2) % 1000000007L }
  }
}
