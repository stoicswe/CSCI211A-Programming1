package HW6_Project

object exercise11_longPoint extends App {
  var myPoint = new Point2(4,5)
  println(myPoint.toString)
}

class Point2(x: Int, y: Int){
  private var pointX: Long = x
  private var pointY: Long = y
  override def toString: String = pointX.toInt.toString + ", " + pointY.toInt.toString
}
