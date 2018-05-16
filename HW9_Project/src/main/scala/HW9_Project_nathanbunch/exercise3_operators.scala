package HW9_Project_nathanbunch

object exercise3_operators extends App{
  var positiveFraction = new Fraction(8,9)
  var negativeFraction = new Fraction(9,-6)
  println((positiveFraction + negativeFraction).toString)
  println((positiveFraction - negativeFraction).toString)
  println((positiveFraction * negativeFraction).toString)
  println((positiveFraction / negativeFraction).toString)
  println(positiveFraction.toDouble())
}

class Fraction(n: Int, d: Int){
  private val num: Int = if (d==0) 1 else n*sign(d)/gcd(n,d)
  private val den: Int = if (d==0) 0 else d*sign(d)/gcd(n,d)
  override def toString: String = s"$num/$den"
  def toDouble() = (n*1.0)/(d*1.0)
  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  def gcd(a: Int, b: Int): Int = if (b==0) abs(a) else gcd(b, a%b)
  def abs(a: Int) = if (a < 0) -1*a else a
  def +(other: Fraction) = new Fraction(num*other.den + other.num*den, den*other.den)
  def -(other: Fraction) = new Fraction(num*other.den - other.num*den, den*other.den)
  def *(other: Fraction) = new Fraction(num*other.num, den*other.den)
  def /(other: Fraction) = new Fraction(num*other.den, den*other.num)
}
