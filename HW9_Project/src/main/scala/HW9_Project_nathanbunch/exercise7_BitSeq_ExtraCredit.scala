package HW9_Project_nathanbunch

object exercise7_BitSeq_ExtraCredit extends App{
  var myBits = new BitSequence("110101110101111101010101110111011101010111010111010101010101110")
  print(myBits.toString)
}

class BitSequence(s: String) {
  var longValue = java.lang.Long.parseLong(s, 2)

  def apply(i: Int) = longValue & (1<<i)

  def update(i: Int, v: Boolean) {
    longValue = v match {
      case true => longValue | (1<<i)
      case false => longValue ^ (1<<i)
    }
  }
  override def toString = longValue.toString
}
