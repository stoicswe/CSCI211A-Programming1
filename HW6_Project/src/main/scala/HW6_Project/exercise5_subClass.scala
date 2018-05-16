package HW6_Project

class exercise5_subClass extends App {
  var myPoint = new Point(5, 8)
  var myLabel = new LabelPoint("My Label", 7, 2)
  println(myPoint.x + ", " + myPoint.y)
  println(myLabel.label + " | " + myLabel.labelX + ", " + myLabel.labelY)
}

class Point(val x: Double, val y: Double){
  def getX = x
  def getY = y
}

class LabelPoint(var label: String, val labelX: Double, val labelY: Double) extends Point(labelX, labelY){
}
