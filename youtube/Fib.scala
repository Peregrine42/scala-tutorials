object Euler002 {
  def main(args: Array[String]){
    def fib(a:Int=1, b:Int=2):Stream[Int] =
      Stream.cons(a, fib(b, a+b))
    println(fib()
      .filter(_%2==0)
      .takeWhile(_<4000000).sum)
  }
}
