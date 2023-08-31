object Q1 {

  def main(args: Array[String]): Unit = {
    val temperatures = List(0.0, 10.0, 20.0, 30.0)
    println(s"Average Fahrenheit Temperature: ${calculateAverage(temperatures)}")
  }

  def calculateAverage(temperatures: List[Double]): Double = {
    temperatures.map(CtoF).reduce(calcTemp) / temperatures.length
  }

  val CtoF: Double => Double = celsius => (celsius * 9 / 5) + 32

  val calcTemp: (Double, Double) => Double = (a, b) => a + b

}
//59 enne hendagen ahanna(68.0 enna oona)