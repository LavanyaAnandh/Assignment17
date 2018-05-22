//Inheritance Example 
class name{
var fname: String ="Lavanya"  //variable in base class
var lname: String ="Selvaraj" //variable in base class
println("base class variables are" + ", " + fname + " " + lname  )
}

class contact extends name{ //Derived class extending base class name.
  var profession : String = "Developer";
  println("derived class variables is"  + " " + profession  )
  //The below line of code calls the base variables as it was inherited
  println("After Adding base + derived class variables " + " " +fname +  " " +  lname + " " + "is a" + " " + profession) //Using base class variables in derived class without error.
}

object Inheritance {
  def main(args: Array[String]) 
  {
    val Obj = new contact(); //Instantiating the Object of derived class.
  }
}