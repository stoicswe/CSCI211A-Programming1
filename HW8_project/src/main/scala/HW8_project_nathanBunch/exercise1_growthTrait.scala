package HW8_project_nathanBunch

object exercise1_growthTrait extends App{

  trait RectangleLike {
    this: java.awt.geom.Ellipse2D =>
    def translate(x: Double, y: Double) {
      setFrame(getX + x, getY + y, getWidth, getHeight)
    }

    def grow(w: Double, h: Double) {
      setFrame(getX, getY, getWidth + w, getHeight + h)
    }

    override def toString: String = "Ellipse Dimensions: Center: "+ this.getX.toString + ", " + this.getY.toString + " Width: " + this.getWidth.toString + " Height: " + this.getHeight.toString
  }

  val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike

  println("Starting egg:")
  println(egg.toString)

  egg.translate(10.5, 10.5)

  println("After translate:")
  println(egg.toString)

  egg.grow(10.67, 20.89)

  println("After grow:")
  println(egg.toString)
}
