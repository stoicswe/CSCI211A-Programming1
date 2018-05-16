package HW6_Project

object exercise2_savingsAccount extends App{

  var mySavingsAccount = new SavingsAccount(5780)
  println(mySavingsAccount.deposit(500))
  println(mySavingsAccount.withdraw(3500))
  println(mySavingsAccount.deposit(4500))
  println(mySavingsAccount.withdraw(3200))
  println(mySavingsAccount.earnMonthlyInterest)
  println(mySavingsAccount.withdraw(3200))
  println("Done.")

}

class BankAccount2(initialBalance : Double){
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

class SavingsAccount(initialBalance : Double) extends BankAccount2(initialBalance){
  private var transactionLimit = 3
  private var transactionCount = 0
  private var interestRate = .05

  override def deposit(amount : Double) = {
    if (transactionCount < transactionLimit){
      transactionCount += 1
      super.deposit(amount)
    } else {
      println("Used all transactions this month!")
      super.currentBalance
    }
  }

  override def withdraw(amount: Double) = {
    if (super.currentBalance >= amount && transactionCount < transactionLimit){
      transactionCount += 1
      super.withdraw(amount)
    }else{
      println("Insufficinet funds or used all transactions this month!")
      super.currentBalance
    }
  }

  def earnMonthlyInterest ={
    transactionCount = 0
    super.deposit(super.currentBalance * interestRate)
  }
}