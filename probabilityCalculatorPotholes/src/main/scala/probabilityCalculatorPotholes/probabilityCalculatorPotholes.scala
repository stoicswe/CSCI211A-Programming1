package probabilityCalculatorPotholes

import scala.util.Random

object probabilityCalculatorPotholes extends App{

  var randomGenerator = new Random()

  def experiment: Integer = {
    var outliers = 3
    var totalBalls = 68
    var temp = 0

    for (i <- 1 to 34){
      temp = 1 + randomGenerator.nextInt(totalBalls)

      if (temp <= outliers)
        outliers -= 1

      totalBalls -= 1

      if (outliers < 3)
        return 1
      return 0
    }
    return 0
  }

  var sum = 0

  var steps = 1000

  for(j <- 1 to steps) sum += experiment

  var finalValue = sum/steps

  println(finalValue.toString)

}