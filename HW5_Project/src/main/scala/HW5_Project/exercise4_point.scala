package HW5_Project

class exercise4_point extends App {
  var myPoint = Point(5, 7)
  println(myPoint.toString)
}

class Point(var px: Double, var py: Double){
  override def toString: String = "(" + px + ", " + py + ")"
}

object Point{
  def apply(x: Double, y: Double) = new Point(x, y)
}
