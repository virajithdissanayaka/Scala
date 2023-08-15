import scala.io.StdIn

object Q1 {
  def main(args: Array[String]) = {
    println("Enter deposit income: ")
    var income = StdIn.readInt()

    println("Annual interest is : " + interest(income))

  }

  val interest: Double => Double = (amount: Double) =>
    if (amount <= 0) 0
    else if (amount <= 20000) 0.02 * amount
    else if (amount <= 200000) 0.04 * amount
    else if (amount <= 2000000) 0.035 * amount
    else 0.065 * amount

}