package HW1_Project

import scala.math._

object HW1_Project extends App{

  //exercise 6, page 15
  var theBigNumber:BigInt = 2
  theBigNumber = theBigNumber.pow(1024)
  println(theBigNumber)

  println()

  //exercise 1, page 31
  val aNegativeNumber = -45
  val aPositiveNumber = 37
  val aZero = 0
  println(signum(aNegativeNumber))
  println(signum(aPositiveNumber))
  println(signum(aZero))

  def signum(number: Int) = {
    if (number == 0) 0
    else if (number < 0) -1*(number / number)
    else if (number > 0) number / number
  }

  println()

  //exercise 5, page 32
  val aBiggerNumber = 20
  val aSmallerNumber = 7
  countdown(aBiggerNumber)
  countdown(aSmallerNumber)

  def countdown(counter : Int) = {
    var temp = counter
    while(temp != 0){
      printf("%d ", temp)
      temp -= 1
    }
    println()
  }

  println()

  //exercise 10, page 32...extra credit points


}
