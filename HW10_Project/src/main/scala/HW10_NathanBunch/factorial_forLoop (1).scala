package HW10_NathanBunch

object factorial_forLoop extends App {
  var factorial = (x: Int) => {
    var l = 1
    if (x < 1)
      1
    else
    for (i <- x to 1 by -1)
      l = i * l
    l
  }

  print(factorial(7))
}
