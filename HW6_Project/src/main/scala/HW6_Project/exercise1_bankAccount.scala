package HW6_Project

object exercise1_bankAccount extends App {

  var myCheckingAccount = new CheckingAccount(500.0)
  println(myCheckingAccount.currentBalance)
  println(myCheckingAccount.deposit(1300))
  println(myCheckingAccount.withdraw(1000))
  println(myCheckingAccount.withdraw(900.0))
  println("Done.")

}

class BankAccount(initialBalance : Double){
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double)= {balance += amount; balance}
  def withdraw(amount: Double) = {
    if (balance > amount){
      balance -= amount
      balance
    } else {
      println("Insufficient funds!")
      balance
    }
  }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def withdraw(amount: Double) = {
    if (amount < super.currentBalance){
      super.withdraw(amount)
      super.withdraw(1)
      super.currentBalance
    } else {
      println("Insufficient funds!")
      super.currentBalance
    }
  }
}
