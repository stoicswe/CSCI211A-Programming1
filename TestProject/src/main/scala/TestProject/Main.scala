package TestProject

import scala.collection.mutable.ArrayBuffer

object Main extends App {

  println("Hello World!")
  println("Lets count some numbers.")

  var counter = 0
  while (counter <= 10){
    println(counter)
    counter+=1
  }

  println()

  println("done!")

  println()

  val s = "This is a string"
  var sum = ""

  for (i <- 0 to s.length -1) {
    println(i)
    sum += s(i)
  }

  println(s)

  for (i <- 1 to 3; j <- 1 to 3){ //basically a nested for loop example
    println(i,j)
  }

  println()

  for (i <- 1 to 3; j <- 1 to 3; if i != j){ //a nested for loop with a condition
    println(i,j)
  }

  var resultString = for (c <- "Hello World"; i <- 0 to 1) yield (c + i).toChar //this is a forloop that returns a value

  println(resultString)

  println()

  def abs(x: Double) = if (x >= 0) x else -x //this is a function

  def abs(x: Int) = if (x >= 0) x else -x //this is another function

  def fact(n : Int) = { //this is the factorial function
    var r = 1
    for (i <- 1 to n) r = r*i
    r
  }

  def add(x: Int, y: Int): Integer ={
    x + y
  }

  println(add(4,7))

  println()

  def sum(args: Int*): Integer = {
    var result = 0
    for (arg <- args){
      result += arg
    }
    return result
  }

  def power(big: BigInt, pwr: Int): BigInt = {
    return big.pow(pwr)
  }

  println(power(45, 2048434))

  println()

  val randomMap = Map("X" -> 11.34, "Y" -> 12, "Z" -> 853.12)

  for ((k, n) <- randomMap) println((k, n))

  val grades = Map("Alice" -> (19, 3.5))

  for ((key, value) <- grades){ println(key)
    println(value)
  }

  for ((key, value) <- grades) {
    println(key + ":")
    println("Age: " + value._1)
    println("GPA: " + value._2)
  }

  class Family(val name: String){
    class child(val name: String)
    class pet(val name: String)

    val children = new ArrayBuffer[child]
    val pets = new ArrayBuffer[pet]
  }

  object ThisIsAProgram { //to make the main method
    def main(args: Array[String]) {
      if (args(0).length > 0) { //if were in file: 'test' then it would be: test NAME, it would print NAME
        println("Hello, " + args(0) + "!")
      }else{println("Hello World!")}
    }
  }



}
