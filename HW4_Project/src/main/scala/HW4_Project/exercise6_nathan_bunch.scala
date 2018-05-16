package HW4_Project

object exercise6_nathan_bunch extends App{
  var person1 = new Person("Matt", 19)
  var person2 = new Person("Richard", -7)

  println(person1.toString)
  println(person2.toString)
}

class Person(val name : String, private var age : Int){
  if (age < 0) {age = 0}
  def getName : String = name
  def getAge : Int = age
  override def toString : String = "Info card for: " + name + ", age: " + age
}
