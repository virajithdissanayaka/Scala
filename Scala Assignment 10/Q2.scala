object Q2 {
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    println(s"Total count of letter occurrences: ${countLetterOccurrences(words)}")
  }

  def countLetterOccurrences(words: List[String]): Int = {
    words.map(Count).reduce(calcTot)
  }

  val Count: String => Int = word => word.length

  val calcTot: (Int, Int) => Int = (a, b) => a + b
}
