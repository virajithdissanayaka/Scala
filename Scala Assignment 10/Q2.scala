object Q2 {
  def main(args: Array[String]): Unit = {
    var fruit = List("apple", "banana", "cherry", "date")
    println("Total count of letter occurrences:" + countletters(fruit))
  }

  def countletters(value: List[String]) = {
    var lengths = value.map(num => num.length)
    lengths.reduce((x, y) => x + y)
  }
}
