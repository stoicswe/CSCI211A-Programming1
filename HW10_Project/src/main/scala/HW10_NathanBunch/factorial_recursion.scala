package HW10_NathanBunch

object factorial_recursion extends App {
  def factorial(x: Int): Int = {
    if (x < 1)
      1
    else
      x * factorial(x-1)
  }

  print(factorial(7))
}
