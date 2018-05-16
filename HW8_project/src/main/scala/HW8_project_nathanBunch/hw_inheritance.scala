package HW8_project_nathanBunch

object hw_inheritance extends App{
  var myItem0 = new UnitItem("this is a bag of quantum bits", 300.5, 150)
  var myItem1 = new UnitItem("this is a crate of eggs", 550, 1.5)
  var myItem2 = new UnitItem("this is a crate of crapbooks (macbooks)", 850, 3200)
  var myItem3 = new UnitItem("this is a bok of chalk sticks", 50, .15)

  var listOfItems = Array(myItem0, myItem1, myItem2, myItem3)

  for (elem <- listOfItems) println(elem.toString)
}

abstract class StoreItem(val description: String){
  val serialNumber = StoreItem.newSerial()
  def getPrice: Double
}

object StoreItem{
  private var lastNumber = 0
  private def newSerial () = {lastNumber += 1; lastNumber}
}

class UnitItem(description: String, weight: Double, pricePerWeight: Double) extends StoreItem(description){
  override def getPrice: Double = weight*pricePerWeight
  def getDescription: String = description
  override def toString: String = "Item Serial: " + serialNumber.toString + " Item Description: " + getDescription + " Total Price: " + getPrice
}