package HW8_project_nathanBunch

object hw_trait extends App {
  var cereal = new UnitItem2("This is a box of lucky charms.", 1.5, 2)
  var milk = new UnitItem2("This is a gallon of milk", 3.5, .75)
  var eggs = new UnitItem2("This is a carton of eggs", 9.8, .15)
  var icecream = new UnitItem2("This is my icecream", 3.5, .90)
  var crackers = new UnitItem2("This is a box of crackers", 3.5, .05)
  var soda = new UnitItem2("This is a 2-liter bottle of soda", 2, .75)
  var myCart = new ShoppingCart()

  println(myCart.size)
  myCart.addItem(cereal)
  println(myCart.size)
  myCart.addItem(milk)
  println(myCart.size)
  myCart.addItem(eggs)
  println(myCart.size)
  myCart.addItem(icecream)
  println(myCart.size)
  myCart.addItem(crackers)
  println(myCart.size)
  myCart.addItem(soda)
  println()
  myCart.getContents
  println()
  println(myCart.toString)
  println()
  myCart.removeItem(milk)
  println()
  myCart.getContents
  println()
  println(myCart.toString)
}

abstract class StoreItem2(val description: String) extends Ordered[StoreItem]{
  val serialNumber = StoreItem2.newSerial()
  def getPrice: Double
}

object StoreItem2{
  private var lastNumber = 0
  private def newSerial() = {lastNumber += 1; lastNumber}
}

class UnitItem2(description: String, weight: Double, pricePerWeight: Double) extends StoreItem2(description) with Taxable {
  var taxPercent = 15
  override def getPrice: Double = weight*pricePerWeight
  def getDescription: String = description
  override def toString: String = "Item Serial: " + serialNumber.toString + " Item Description: " + getDescription + " Total Price: " + getPrice
  override def getTax: Double = getPrice*taxPercent
  override def compare(that: StoreItem) = this.serialNumber - that.serialNumber
}

trait Taxable {
  var taxPercent: Double
  def getTax: Double
}

class ShoppingCart() {

  private var capacity = 5
  private var cartSlot = 0
  private var cart = new Array[StoreItem2](5)

  def this(capacity: Int){
    this()
    this.capacity = capacity
  }

  def size: Int = cartSlot
  def addItem(item: StoreItem2) {
    if (cartSlot == capacity)
      println("Unfortunately your cart is full.")
    else {
      cart(cartSlot) = item
      cartSlot += 1
    }
  }

  def removeItem(item: StoreItem2): StoreItem2 =  {
    var temp = 0
    for (elem <- cart){
      if (elem == item){
        //cart(temp) = null
        cartSlot -= 1
        for (k <- temp to cart.length-2){
          cart(k) = cart(k+1)
        }
        cart(cart.length-1) = null
        return elem
      } else temp += 1
    }
    return null
  }

  def getContents {
    try {
      for (elem <- cart) {
        println(elem.toString)
      }
    }catch{
      case e => println("-")
    }
  }

  def itemAt(position: Int): StoreItem2 = {
    if (position < cart.length && position > 0)
      return cart(position)
    return null
  }

  override def toString: String = "Your Current Cart | Capacity: " + capacity.toString + " | Number of current items: " + cartSlot.toString
}