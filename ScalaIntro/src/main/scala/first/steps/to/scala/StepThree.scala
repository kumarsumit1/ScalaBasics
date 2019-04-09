package first.steps.to.scala

object StepThree {
  def main(args: Array[String]): Unit = {
    var maxim = max(5,8)
    print(maxim)
  }

  def max(x: Int, y: Int): Int = if (x < y) y else x
}
