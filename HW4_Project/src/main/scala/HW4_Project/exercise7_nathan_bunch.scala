package HW4_Project

/*
 * The reasion I have the first and last name variables as mutable
 * rather than immutable is because I have to initialize them as
 * empty strings so I can re-assign the user-input values after the fact.
 * (by splitting the spaced name that is being entered). Also, the reason I
 * have the person class here named the "personV2" is becuase I built all these
 * projects in one main project, so the IDE thought that I was refering to the
 * previous "person" class from the previous exercise.
 */

object exercise7_nathan_bunch extends App{
  var person1 = new PersonV2("Matt Brand", 19)
  var person2 = new PersonV2("Richard Rogers", -7)
  var person3 = new PersonV2("Leroy Jenkins", 19)
  var person4 = new PersonV2("Ryan", -45)

  println(person1.getFirstName)
  println(person1.getLastName)
  println(person2.getLastName + ", " + person2.getFirstName)
  println(person3.toString)
  println(person4.getName)
}

class PersonV2(val nameFirstLast : String, private var age : Int){
  if (age < 0) {age = 0}
  private val firstLastName = nameFirstLast.split(" ")
  private var firstName = ""
  private var lastName = ""
  if (firstLastName.length > 1){ firstName = firstLastName(0); lastName = firstLastName(1)} else {firstName = firstLastName(0)}
  def getName : String = firstName + " " + lastName
  def getFirstName : String = firstName
  def getLastName : String = lastName
  def getAge : Int = age
  override def toString : String = "Info card for: " + getName + ", age: " + age
}
