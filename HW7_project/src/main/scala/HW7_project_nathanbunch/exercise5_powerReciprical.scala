package HW7_project_nathanbunch

import java.io.{File, PrintWriter}
import java.nio.file.{Files, Paths}

import scala.collection.mutable.ArrayBuffer

object exercise5_powerReciprical extends App {
  var filename = "C:\\TestData\\powerRecipricals.txt"
  var generatedNumbers = new ArrayBuffer[Double]()
  val pw = new PrintWriter(new File(filename))

  if (Files.exists(Paths.get(filename))){ //originally written on a windows machine, reprogrammed for Linux
  }else{
    filename = System.getProperty("user.dir") + "/powerRecipricals.txt"//change path for cooperation with Linux
  }

  for (i <- 0 to 20){
    generatedNumbers += Math.pow(0.5, i)
  }

  for (i <- 0 to generatedNumbers.length-1){
    pw.print(generatedNumbers(i) + "\n")
  }

  pw.close
}
