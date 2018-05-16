package HW10_NathanBunch

object exercise5_LargestFunction extends App {
  var largest = (fun: (Int) => Int, inputs: Seq[Int]) => inputs.reduceLeft((x, y) => Math.max(x, fun(y)))
  var myFunction = (x: Int) => x*(x*5 + x)
  println(largest(myFunction, 1 to 7)) //should be 294
}
