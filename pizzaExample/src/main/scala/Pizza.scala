class Pizza (val size :Int, val numberOfToppings : Int, val price :Double) {
  final override def equals(other: Any) = {
    other.isInstanceOf[Pizza] && {
      val that = other.asInstanceOf[Pizza]
      size == that.size && price == that.price && numberOfToppings == that.numberOfToppings
    }
  }
}

class Pizza2 (val size: Int) extends Ordered[Pizza2]{
  def compare(that: Pizza2): Int ={
    if (size == that.size) 0
    if (size > that.size) 1
    else -1
  }
}

object Pizza2 {
  def apply(size: Int) = new Pizza2(size)
}