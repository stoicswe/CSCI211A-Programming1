package HW9_Project_nathanbunch

object exercise4_Money extends App {
  var myMoney0 = new Money(3,75)
  var myMoney1 = new Money(6,23)
  var myMoney2 = new Money(3,75)
  println((myMoney0 + myMoney2).toString)
  println((myMoney2 - myMoney1).toString)
  println((myMoney0 < myMoney1))
  println((myMoney1 < myMoney0))
  println((myMoney0 < myMoney2))
}

class Money(var d: Int, var c: Int) {
  private val dollar: Int = if (c >= 100) {c -= 100; d+1} else if (c<0) {c+=100; d-1} else d
  private val cent: Int = c
  def +(other: Money) = new Money(dollar+other.dollar, cent+other.cent)
  def -(other: Money) = new Money(dollar-other.dollar, cent-other.cent)
  def ==(other: Money) = if (dollar == other.dollar && cent == other.cent) true else false
  def <(other: Money) = if (dollar < other.dollar) true else if(cent < other.cent) true else false
  override def toString: String = "$" + dollar.toString + "." + cent.toString
}