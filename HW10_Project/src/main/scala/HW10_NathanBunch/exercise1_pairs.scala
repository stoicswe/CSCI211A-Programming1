package HW10_NathanBunch

object exercise1_pairs extends App {

  def values(fun: (Int) => Int, low: Int, high: Int) = for (i <- low to high) yield (i,fun(i))

  var myFunction = (x: Int) => x+4
  var myFunction2 = (x: Int) => x*2

  print(values(myFunction, -5, 5))
  print(values(myFunction2, -5, 5))
}