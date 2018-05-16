package HW2_Project

import scala.io._
import scala.util._

object HW2_Project extends App{

  //exercise 1
  var randomArrayVar = randomArray(10)
  var secondArrayVar = randomArray(10)
  var negativeArray = Array(-1, -1, -2, 4, -6, 7, -8, -8, 9, -10)

  //exercise 2
  println(randomArrayVar.deep.mkString(","))
  println()
  println(swapArray(randomArrayVar).deep.mkString(","))


  //exercise 3
  println()
  println(secondArrayVar.deep.mkString(","))
  println()
  secondArrayVar = swapArrayYield(secondArrayVar)
  println(secondArrayVar.deep.mkString(","))


  //exercise 4
  println()
  println(negativeArray.deep.mkString(","))
  println()
  negativeArray = absArray(negativeArray)
  println(negativeArray.deep.mkString(","))


  //exercise 5
  println()
  println(averageDoubleArray(randomArrayVar))
  println()


  //exercise 7
  negativeArray = removeArrayDuplicates(negativeArray)
  println(negativeArray.deep.mkString(","))
  println()

  println("done.")


  //exercise 1, page 44
  def randomArray(size: Int): Array[Int] ={
    var generatedArray = Seq.fill(size)(Random.nextInt(size))
    return generatedArray.toArray
  }

  //exercise 2, page 44
  def swapArray(arrayToSwap: Array[Int]) = {
    arrayToSwap.grouped(2).map {
      case Array(x, y) => Array(y, x)
      case Array(x) => Array(x)
    }.flatten.toArray
  }

  //exercise 3, page 44
  def swapArrayYield(arrayToSwap: Array[Int]): Array[Int] = {
    (for {i <- arrayToSwap.sliding(2,2)
      j <- i.reverse
    } yield j).toArray
  }

  //exercise 4, page 44
  def absArray(arrayToAbs: Array[Int]): Array[Int] = {
    for (i <- arrayToAbs) yield Math.abs(i)
  }

  //exercise 5, page 44
  def averageDoubleArray(arrayToAverage: Array[Int]): Double ={
    var temp = 0;
    for (i <- arrayToAverage){temp += i}
    return temp / (arrayToAverage.length * 1.0)
  }

  //exercise 7, page 44
  def removeArrayDuplicates(arrayToModify: Array[Int]): Array[Int] ={
    arrayToModify.toSet.toArray
  }
}
