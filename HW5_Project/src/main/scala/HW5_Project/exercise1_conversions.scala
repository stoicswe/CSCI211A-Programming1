package HW5_Project

object exercise1_conversions extends App {
  println(Conversions.inchesToCentimeters(8))
  println(Conversions.gallonsToLiters(3))
  println(Conversions.milesToKilometers(5))
}

object Conversions {
  def inchesToCentimeters(inches: Double) = inches*2.54
  def gallonsToLiters(gallons: Double) = gallons*3.785411784
  def milesToKilometers(miles: Double) = miles*1.61
}
