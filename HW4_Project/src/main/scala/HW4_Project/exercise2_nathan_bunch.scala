package HW4_Project

object exercise2_nathan_bunch extends App{
  var myBankAccount = new ScalaBankAccount()
  myBankAccount.deposit(500.0)
  myBankAccount.withdraw(45.3)
  myBankAccount.deposit(56.5)
  myBankAccount.withdraw(345.7)
  myBankAccount.deposit(5768.9)
  println("Your account balance is: " + myBankAccount.balance)
}

class ScalaBankAccount{
  private var scalaBucksBalance = 0.0
  def balance: Double = scalaBucksBalance
  def deposit(amount : Double){
    scalaBucksBalance += amount
    println("Deposit of " + amount + " completed.")
    println("Your new balance is: " + scalaBucksBalance)
    println()
  }
  def withdraw(amount : Double){
    if (amount <= scalaBucksBalance){
      scalaBucksBalance -= amount
      println("Withdraw of " + amount + " completed.")
      println("Your new balance is: " + scalaBucksBalance)
      println()
    } else { println("Error. Not enough funds.")}
  }

  override def toString: String = scalaBucksBalance.toString
}
