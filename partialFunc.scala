//Example with partial function

object partial {
  
  val pval: PartialFunction[(Int, Int ),  Int] = { //partial function declaration
     case (x, y) => 3 + x + y //code to add 2 numbers with a constant number
   }
  
  def square(a: Int): Int = {
         return(a * a)  //code to find square of a number
}
  def main(args: Array[String])
  {
      println(square({pval(5, 4)})) //passing partial function as parameter
      println(square({pval(2, 4)})) 
  }
}