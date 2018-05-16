package HW6_Project

object exercise7_squareConstruct extends App {
  var myCustomSquare = new Square(7, 2, 5)
  var mySemiCustomSquare = new Square(5, 5)
  var myDefaultSquare = new Square()
  println(myCustomSquare.toString)
  println(mySemiCustomSquare.toString)
  println(myDefaultSquare.toString)
}

class Square(centerX: Double, centerY: Double) extends java.awt.Rectangle(){
  private var squareX : Double = centerX
  private var squareY : Double = centerY
  private var squareWidth : Double = 0.0

  def this(centerX: Double, centerY: Double, width: Double){
    this(centerX, centerY)
    this.squareWidth = width
  }
  def this(width: Double){
    this(width / 2, width / 2, width)
    this.squareWidth = width
  }
  def this(){
    this(0, 0, 0)
  }

  override def toString: String = "Square: " + squareX.toString + ", " + squareY.toString + " width: " + squareWidth.toString
}
