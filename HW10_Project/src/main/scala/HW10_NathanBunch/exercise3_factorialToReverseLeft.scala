package HW10_NathanBunch

object exercise3_factorialToReverseLeft extends App {
  var myArray = Array(7, 2, 6)
  //var factorialFunction = (x: Int) => if (x == 1) 1 else x * factorialFunction(x-1)

  var factorialFunction = (x: Int) => if (x < 1) 1 else (x to 1 by -1).reduceLeft(_ * _)

  //print(myArray.reduceLeft(factorialFunction))

  print(factorialFunction(7))

}
