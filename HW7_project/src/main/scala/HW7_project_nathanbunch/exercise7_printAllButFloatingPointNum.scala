package HW7_project_nathanbunch

import java.nio.file.{Files, Paths}

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object exercise7_printAllButFloatingPointNum extends App {
  var filename = "C:\\TestData\\example_test3_printAllNoNumbers.txt"
  var stringsFromFile = new ArrayBuffer[String]()

  if (Files.exists(Paths.get(filename))){ //originally written on a windows machine, reprogrammed for Linux
  }else{
    filename = System.getProperty("user.dir") + "/example_test3_printAllNoNumbers.txt" //change path for cooperation with Linux
  }

  val sourceData = Source.fromFile(filename)
  val tokens = sourceData.mkString.split("\\s+")

  for (token <- tokens){
    try {
      token.toDouble //do nothing if token is a number
    } catch {
      case e: Exception => print(token + " ")//if no floating point found, print the value
    }
  }

}
