package HW10_NathanBunch

object exercise5_LargestFunctionForLoop extends App {
  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    var vals = for (i <- inputs) yield fun(i)
    vals.reduceLeft(_ max _)
  }
  var myFunction = (x: Int) => x*(x*5 + x)
  println(largest(myFunction, 1 to 7)) //should be 294
}
