package HW6_Project

object exercise6_abstractClassShape extends App {
  var myCircle = new Circle(5.3, 8.7, 5)
  var myRectangle = new Rectangle(2.3, 1, 4, 8)

  println(myCircle.toString)
  println(myCircle.centerPoint.mkString(","))
  println(myRectangle.toString)
  println(myRectangle.centerPoint.mkString(","))
}

abstract class Shape(){
  def centerPoint: Array[Double]
}

class Circle(centerPointX : Double, centerPointY : Double, circleRadius : Double) extends Shape(){
  var centerX = centerPointX
  var centerY = centerPointY
  var radius = circleRadius
  override def centerPoint: Array[Double] = { Array(centerX, centerY) }
  override def toString: String = "X,Y: (" + centerX + "," + centerY + ") | R: " + radius
}

class Rectangle(centerPointX: Double, centerPointY : Double, rectLength : Double, rectHeight : Double) extends Shape(){
  var centerX = centerPointX
  var centerY = centerPointY
  var length = rectLength
  var height = rectHeight
  override def centerPoint: Array[Double] = { Array(centerX, centerY) }
  override def toString: String = "X,Y: (" + centerX + "," + centerY + ") | L: " + length + " H: " + height
}
