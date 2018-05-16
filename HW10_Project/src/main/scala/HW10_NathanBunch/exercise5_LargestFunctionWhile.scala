package HW10_NathanBunch

import scala.collection.mutable.ArrayBuffer

object exercise5_LargestFunctionWhile extends App {
  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    var start = inputs(0)
    var tempArray = ArrayBuffer.empty[Int]
    while(start != inputs.last){
      tempArray += fun(start)
      if (start > inputs.last)
        start -= 1
      else
        start += 1
    }
    tempArray += fun(start)
    tempArray.reduceLeft(_ max _)
  }
  var myFunction = (x: Int) => x*(x*5 + x)
  println(largest(myFunction, 1 to 7)) //should be 294
}
