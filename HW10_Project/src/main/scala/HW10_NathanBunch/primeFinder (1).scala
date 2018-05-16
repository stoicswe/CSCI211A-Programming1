package HW10_NathanBunch

object primeFinder extends App {
  var findPrime = (x: Int) => {
    var b = 2
    var a = x
    var m = 0
    while (a > 1) {
      while (a % b == 0) {
        m = b
        a = a / b
      }
      if (b > 2) b += 2 else b += 3
    }
    m
  }

  println(findPrime(25))
  println(findPrime(256))
  println(findPrime(23))
  println(findPrime(55))
}
