object Euler006 {

  implicit class SquareableInt(val self: Int) extends AnyVal {
    def ** = {
      x:Int => 1.until(x).foldLeft(self)({(x:Int,y:Int) => (x * self)})
    }
  }
  def main(args: Array[String]) {
    var numbers = (1 to 100)
    var squares = numbers.map(x => (x**2))
    println((numbers.sum**2) - squares.sum)
  }

}
