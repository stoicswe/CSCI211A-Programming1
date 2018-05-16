package HW10_NathanBunch

object exercise4_fixedExercise3FoldLeft extends App {
  var factorialFunction_version2 = (x: Int) => (x to 1 by -1).foldLeft(1)(_ * _)

  print(factorialFunction_version2(7))
}
