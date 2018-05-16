package HW4_Project

object exercise8_nathan_bunch extends App{
  var firstCar = new Car("Jeep", "Liberty")
  var secondCar = new Car("Jeep", "Liberty", 2004)
  var thirdCar = new Car("Jepp", "Liberty", 2004, "FAX1TT")
  var fourthCar = new Car("Jeep", "Liberty", "FAX1TT")

  println(firstCar.toString)
  println(secondCar.toString)
  println(thirdCar.toString)
  println(fourthCar.toString)
}

class Car(carManufacturer : String, carModel : String){
  val manufacturer = carManufacturer
  val model = carModel
  private var year = -1
  var licensePlate = ""

  def this(carManufacturer : String, carModel : String, carYear : Int){
    this(carManufacturer, carModel)
    this.year = carYear
  }

  def this(carManufacturer : String, carModel : String, carYear : Int, carLicense : String){
    this(carManufacturer, carModel)
    this.year = carYear
    this.licensePlate = carLicense
  }

  def this(carManufacturer : String, carModel : String, carLicense : String){
    this(carManufacturer, carModel)
    this.licensePlate = carLicense
  }

  def getManufacturer : String = manufacturer
  def getModel : String = model
  def getYear : Int = year
  def getLicensePlate : String = licensePlate
  def setYear(year : Int){ this.year = year}
  def setLicensePlate(licensePlate : String) { this.licensePlate = licensePlate}

  override def toString: String = "Car info: " + manufacturer + " | " + model + " | " + year + " | " + getLicensePlate
}
