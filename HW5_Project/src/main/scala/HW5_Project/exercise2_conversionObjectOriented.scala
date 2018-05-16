package HW5_Project

class exercise2_conversionObjectOriented extends App {
  println(InchesToCentimeters.convert(4))
  println(GallonsToLiters.convert(56))
  println(MilesToKilometers.convert(8))
}

abstract class UnitConversion {
  def convert {}
}

class InchesToCentimeters extends UnitConversion{ def convert(inches: Double): Double = inches*2.54 }
class GallonsToLiters extends UnitConversion { def convert(gallons: Double): Double = gallons*3.785411784 }
class MilesToKilometers extends UnitConversion { def convert(miles: Double): Double = miles*1.61 }

object InchesToCentimeters {
  def convert(inches: Double): Double = {
    return inches*2.54
  }
}

object GallonsToLiters {
  def convert(gallons: Double): Double = {
    return gallons*3.785411784
  }
}

object MilesToKilometers {
  def convert(miles: Double): Double = {
    return miles*1.61
  }
}
