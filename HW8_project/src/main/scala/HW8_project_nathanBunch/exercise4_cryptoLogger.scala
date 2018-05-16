package HW8_project_nathanBunch

object exercise4_cryptoLogger extends App{
  val myPersonel = new Person("Nathan Bunch")
  val myToy = new Toy("Baby Guitar", "A guitar made for your kids! They will love learning how to play!")
  val myToy2 = new Toy("Nintendo Switch", "A great videogame console for light gamers.")

  println(myPersonel.getSecretName)
  println(myToy.getSecretName)
  println(myToy.getDescription)
}

class Person(val userName: String) extends {override val key=9} with CryptoLogger {
  def getSecretName = {log(userName); userName}
}

class Toy(val name: String, val description: String) extends{override  val key= -7} with CryptoLogger{
  def getSecretName = {log(name); name}
  def getDescription = {log(description); description}
}

trait Logger {
  def log(msg: String) {}
}

trait PrinterLogger extends Logger {
  override def log(msg: String) {
    println(msg)
  }
}

trait CryptoLogger extends Logger {
  val key = 3
  //please note: the cypher char array also includes some symbols, because they too needed to be encoded.
  val alphabet = Array('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '!', ',', '.', '?')

  private def encode(toEncode: String, key: Int): String ={
    var tempStr = ""
    var toEncodeUpper = toEncode.toUpperCase.toCharArray
    var notALetter = false

    for (i <- 0 to toEncodeUpper.length-1) {
      for (j <- 0 to alphabet.length - 1) {
        if (toEncodeUpper(i).equals(alphabet(j))) {
          if (j == 0 && key < 0){
            tempStr += alphabet(alphabet.length-1+key).toString
          } else if (j == alphabet.length-1 && key > 0){
            tempStr += alphabet(key).toString
          } else if (alphabet.length-1-j < key){
            tempStr += alphabet(key - (alphabet.length-1-j))
          } else if (j < -1*key){
            tempStr += alphabet(alphabet.length-1 + (key + j))
          } else {
            tempStr += alphabet(j + key).toString
          }
        }
      }
    }
    return tempStr
  }

  override def log(msg: String): Unit ={
    println(encode(msg, key))
  }
}