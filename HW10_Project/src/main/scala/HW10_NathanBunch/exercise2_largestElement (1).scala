package HW10_NathanBunch

object exercise2_largestElement extends App {
  var myArray = Array(-4, 7, 2, 6, 10, 67, 3, 8, 9)
  print(myArray.reduceLeft(_ max _))
}
