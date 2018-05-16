package HW7_project_nathanbunch

import scala.io._
import java.nio.file.{Paths, Files}

object exercise3_printWordsTwelveAboveChars extends App {
  var filename = "C:\\TestData\\example_test1.txt"

  if (Files.exists(Paths.get(filename))){ //If not on Windows, change file path for linux
  }else{
    filename = System.getProperty("user.dir") + "/example_test1.txt"
  }

  for (line <- Source.fromFile(filename).getLines) {
    var words = line.split(" ")
    for (i <- 0 to words.length-1) {
      if (words(i).length > 12)
        println(words(i))
    }
  }
}
