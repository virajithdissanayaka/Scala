import scala.io.StdIn

object Q2 {
  def main(args: Array[String]) = {
    println("Enter the num: ")
    val num = StdIn.readInt()

    println("--->" + patternMatching(num))
  }

  val patternMatching:Int => String = (number:Int) =>
    if(number <= 0) "Negative number / Zero"
    else if (number%2 == 0 ) "Even Number"
    else "Odd Number"

}