package HW8_project_nathanBunch

import java.awt.Point

object exercise2_orderedPoint extends App{
  var myPoint1 = new OrderedPoint(10, 5)
  var myPoint2 = new OrderedPoint(7, 2)
  var myPoint3 = new OrderedPoint(10, 5)

  try {
    assert(myPoint1 < myPoint2)
  }catch {
    case e => println("One is less than the other.")
  }
  try {
    assert(myPoint2 < myPoint1)
  }catch{
    case e => println("One is less than the other.")
  }
  try {
    assert(myPoint3 < myPoint1)//causes error
  }catch {
    case e => println("Both are the same, no difference.")
  }
  //println(myPoint1.compare(myPoint2))
  //println(myPoint2.compare(myPoint1))
}

/**
  * Define a class OrderedPoint by mixing scala.math.Ordered[Point] into java.awt.Point .
  *
  * Use lexicographic ordering, i.e. ( x , y ) < ( x ’, y ’) if x < x’ or x = x’ and y < y ’.
  */

class OrderedPoint(x: Int, y: Int) extends Point(x, y) with scala.math.Ordered[Point] {
  def compare(that: Point): Int ={
    if ((this.x - that.x) < 0){
      println("this x, y > that x, y")
      return -1
    }else if ((this.x - that.x) == 0 && (this.y - that.y) == 0){
      println("equal")
      return 0 //when this state is triggered, it causes exception
    }else {
      println("this x, y < that x, y")
      return 1
    }
  }
}
