object Q1 {

  def main(args: Array[String]): Unit = {
    var cel = List(0, 10, 20, 30)
    celtofar(cel)

  }

  def celtofar(cel: List[Int]) = {
    //creating a Farenheit temperature list
    var far = cel.map(temp => (temp * 9 / 5) + 32)
    println("Average Fahrenheit temperature: " + average(far))
  }

  def average(far: List[Int]): Double = {
    //the reduce method sums up the elements in the List
    far.reduce((x, y) => x + y) / far.length
  }

}
