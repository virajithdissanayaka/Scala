object Q1{
  def main(args: Array[String]): Unit = {
    class rational(x:Int,y:Int){
      def numer = x;
      def denom = y;

      def neg = new rational(-this.numer,this.denom);
      override def toString(): String =s"${this.numer}/${this.denom}"
    }

    val rational = new rational(4,7)
    println(rational.neg)
  }
}