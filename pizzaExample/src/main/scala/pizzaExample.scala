object pizzaExample extends App{
  var myPizza1 = new Pizza2(5)
  var myPizza2 = new Pizza2(5)
  var myPizza3 = new Pizza2(10)

  assert(myPizza1 == myPizza2)
  assert(myPizza1 > myPizza3)
  assert(myPizza3 > myPizza1)
}
