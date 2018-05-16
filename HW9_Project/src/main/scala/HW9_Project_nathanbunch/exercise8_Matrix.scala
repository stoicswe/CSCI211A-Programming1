package HW9_Project_nathanbunch

object exercise8_Matrix extends App {
  val random = scala.util.Random
  var myMatrix0 = new Matrix(4,4)
  var myMatrix1 = new Matrix(4,4)
  var myMatrix2 = new Matrix(4,7)

  for (i <- 0 to myMatrix0.columns-1; j <- 0 to myMatrix0.rows-1){
    myMatrix0.unapply(i,j,10*random.nextDouble())
    myMatrix1.unapply(i,j,10*random.nextDouble())
  }
  for (i <- 0 to myMatrix2.columns-1; j <- 0 to myMatrix2.rows-1){
    myMatrix2.unapply(i,j,10*random.nextDouble())
  }
  println(myMatrix0.toString)
  println()
  println(myMatrix1.toString)
  println()
  println(myMatrix2.toString)
  println()
  println((myMatrix0 + myMatrix1).toString)
  println()
  println((myMatrix0 * myMatrix1).toString)
  println()
  println((myMatrix2 * 3).toString)
}

class Matrix(m: Int, n: Int){
  private val size = m
  private val size0 = n
  private var data = Array.ofDim[Double](m,n)

  def this(ar: Array[Array[Double]]){
    this(ar.length, ar(0).length)
    this.data = ar
  }
  def apply(x: Int, y: Int) = data(x)(y)
  def unapply(x: Int, y: Int, v: Double) = { data(x)(y) = v }
  def rows = size0
  def columns = size
  def +(other: Matrix) = new Matrix(compute(other, (a,b) => a+b))
  def *(other: Matrix) = new Matrix(compute(other, (a,b) => a*b))
  private def compute(other: Matrix, f:(Double,Double) => Double): Array[Array[Double]] = {
    if (other.dimensions != dimensions) throw new Exception("Can only add matrix with same size")
    (for (i <- data.indices) yield data(i).zip(other.data(i)).map(v => f(v._1, v._2))).toArray
  }

  def *(s: Double) = {
    new Matrix(
      ( for (i <- data.indices)
        yield data(i).map(_*s) ).toArray
    )
  }

  def dimensions = (rows, columns)

  override def toString: String = {
    var str = "["
    for (i <- 0 to data.length-1){
      str += "["
      for (j <- 0 to data(0).length-1){
        if (j != data(0).length-1)
          str += data(i)(j).toString + ","
        else
          str += data(i)(j).toString
      }
      if (i != data.length-1)
        str += "]\n"
      else
        str += "]"
    }
    str += "]"
    str
  }
}
