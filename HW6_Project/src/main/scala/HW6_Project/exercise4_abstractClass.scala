package HW6_Project

import scala.collection.mutable.ArrayBuffer

object exercise4_abstractClass extends App{
  var myItem1 = new SimpleItem(47000000.0, "This is a quantum laptop, a very powerful item.")
  var myItem2 = new SimpleItem(299.0, "This is a Nintendo Switch, a gaming console")
  var myItem3 = new SimpleItem(250.0, "This is an AtariBox, a new Atari console")
  var myItem4 = new SimpleItem(150.0, "This is a Swatch Sistem51, a new automatic watch")
  var myWishListBundle = new Bundle(0.0, "This is my total wishlist")
  myWishListBundle.addItem(myItem1)
  myWishListBundle.addItem(myItem2)
  myWishListBundle.addItem(myItem3)
  myWishListBundle.addItem(myItem4)
  println(myWishListBundle.getAll)
}

abstract class Item(description: String){
  def getPrice: Double
  def setPrice {}
  def getDescription: String
}

class SimpleItem(itemPrice: Double, itemDescription: String) extends Item(itemDescription){
  private var price = itemPrice
  private var description = itemDescription
  def getPrice = price
  def getDescription = description
  def setPrice(newPrice: Double): Double = {price = newPrice; price}
  override def toString: String = getPrice.toString + " | " + getDescription
}

class Bundle(bundlePrice: Double, bundleDescription: String) extends Item(bundleDescription){
  private var price = bundlePrice
  private var description = bundleDescription
  private var itemsInBundle = new ArrayBuffer[SimpleItem]
  def getPrice = price
  def getDescription = description
  def getAll: String = {
    var returnValue = ""
    var itemCount = 0
    println(description + " | " + price)
    for(elem <- itemsInBundle){
      returnValue += itemCount.toString + " | " + elem.getPrice.toString + " | " + elem.getDescription + "\n"
      itemCount += 1
    }
    returnValue
  }
  private def setPrice(newPrice: Double) = {price = newPrice}
  def addItem(itemToAdd : SimpleItem){itemsInBundle.append(itemToAdd); setPrice(getPrice + itemToAdd.getPrice)}
}
