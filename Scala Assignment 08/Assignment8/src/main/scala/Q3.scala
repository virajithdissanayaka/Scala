object Q3 {
  def main(args: Array[String]) = {
    var input_1 = "Benny"
    var input_2 = "Niroshan"
    var input_3 = "Saman"
    var input_4 = "Kumara"

    println(formatNames(input_1, toUpper))
    println(formatNames(input_2, mixFormat))
    println(formatNames(input_3, toLower))
    println(formatNames(input_4, first_last_format))

  }

  val toUpper:String => String = (name:String) =>
    name.toUpperCase()

  val toLower:String => String = (name:String) =>
    name.toLowerCase()

  val mixFormat:String => String = (name:String) =>
    name.substring(0,2).toUpperCase() + name.substring(2,name.length).toLowerCase()

  val first_last_format:String => String = (name:String)=>
    name.substring(0,1).toUpperCase() + name.substring(1,name.length-1).toLowerCase()+name.substring(name.length-1,name.length).toUpperCase()

  val formatNames : (String , String=>String) => String = (name:String , formatFn:String=>String) =>{
    formatFn(name)
  }
}
