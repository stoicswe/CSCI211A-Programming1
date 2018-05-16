package HW4_Project

/*
 * I think out of the versions of constructors, I prefer the explicit
  * fields becuase with the explicit fields, there is less confusion as
  * to what is gping on. Also, it makes it easier to make auxiliary constructors
 */


object exercise10_nathan_bunch extends App{
  var nyWorker = new Employee("Matt Bredly", 56342.0)

  println(nyWorker.toString)
}

class Employee(employeeName: String, employeeSalary: Double) {
  private val name = employeeName
  private var salary = employeeSalary

  override def toString : String = name + " | " + salary

}
