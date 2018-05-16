package HW7_project_nathanbunch

import java.nio.file.{Files, Paths}

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object exercise4_readFloatingPoints extends App{
  var filename = "C:\\TestData\\example_test2_floatingPoint.txt"
  var floatingPoints = new ArrayBuffer[Double]()
  var sum = 0.0
  var average = 0.0
  var maximum = 0.0
  var minimum = 0.0

  if (Files.exists(Paths.get(filename))){ //originally written on a windows machine, reprogrammed for Linux
  }else{
    filename = System.getProperty("user.dir") + "/example_test2_floatingPoint.txt" //change path for cooperation with Linux
  }

  var fileLines = Source.fromFile(filename).getLines.toArray

  for (line <- fileLines){
    var temp = line.split(" ")
    for (i <- 0 to temp.length) { //parse through the file and grab the floating points
      try {
        floatingPoints += temp(i).toDouble
      } catch {
        case e: Exception => print("") //if no floating point found, do nothing
      }
    }
  }

  for (num <- floatingPoints){ //get sum, average, max, and min
    sum += num
    average += num

    if (maximum < num){ maximum = num }
    if (minimum > num){ minimum = num }else{ minimum = maximum }
  }

  average = average / (floatingPoints.length * 1.0)

  println("Sum: " + sum)
  println("Average: " + average)
  println("Maximum: " + maximum)
  println("Minimum: " + minimum)
}
