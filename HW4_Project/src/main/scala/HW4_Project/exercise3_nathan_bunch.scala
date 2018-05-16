package HW4_Project

object exercise3_nathan_bunch extends App{
  var myFirstTime = new time(20, 30)
  var mySecondTime = new time(10, 35)
  var myThirdTime = new time(23, 45)

  println("My Times:")
  println("First Time: " + myFirstTime.toString)
  println("My Second Time: " + mySecondTime.toString)
  println("My Third Time: " + myThirdTime.toString)
  println()
  println("Is my first time before my second time? " + myFirstTime.before(mySecondTime))
  println("Is my third time before my second time? " + myThirdTime.before(mySecondTime))
}

class time(private var hour : Int, private var minute : Int){

  if (hour > 23 || hour < 0){throw new Exception}
  if (minute > 59 || minute < 0){throw new Exception}

  def before(earlierTime : time): Boolean ={
    if (earlierTime.hour > this.hour){return true}
    if (earlierTime.minute > this.minute) {return true}
    return false
  }

  override def toString : String = hour.toString + ":" + minute.toString
}
