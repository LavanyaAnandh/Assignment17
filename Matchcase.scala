//Example using match to print few statements

object Matchcase {
  
  def printCourse(course : Int) = {
  course match {
  	case 1 => println(f"Android App Development - 14,999 INR")
  	case 2 => println("Data Science - 49,999 INR")
  	case 3 => println("Data Hadoop & Spark Developer – 24,999 INR")
  	case 4 => println("Blockchain Certification – 49,999 INR")
 		case _ =>println("Different course chosen")
  }  
  }
 def main(args: Array[String]){
   for(x <- 1 to 5)
   {
     printCourse(x)
   }
  }
}