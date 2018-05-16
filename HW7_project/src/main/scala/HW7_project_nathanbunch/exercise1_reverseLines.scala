package HW7_project_nathanbunch

import scala.io._
import java.io._
import java.nio.file.{Files, Paths}

object exercise1_reverseLines extends App{

  var filename = "C:\\TestData\\example_test1.txt"
  var second_filename = "C:\\TestData\\example_test1_reversed.txt"

  if (Files.exists(Paths.get(filename))){ //originally written on a windows machine, reprogrammed for Linux
  }else{
    filename = System.getProperty("user.dir") + "/example_test1.txt" //change path for cooperation with Linux
    second_filename = System.getProperty("user.dir") + "/example_test1_reversed.txt"
  }

  var fileLines = Source.fromFile(filename).getLines.toArray
  val pw = new PrintWriter(new File(second_filename))

  for (line <- fileLines){
    println(line)
  }

  for (i <- fileLines.length-1 to 0 by -1){
    println(fileLines(i))
    pw.print(fileLines(i) + "\n")
  }

  pw.close()
}
