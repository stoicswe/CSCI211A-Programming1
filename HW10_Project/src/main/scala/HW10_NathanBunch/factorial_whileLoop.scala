package HW10_NathanBunch

object factorial_whileLoop extends App {
  var factorial = (x: Int) => {
    var y = x
    var l = 1
    if (y < 1)
      1
    else
    while(y > 1){
      l = l*y
      y -= 1
    }
    l
  }

  print(factorial(7))
}
