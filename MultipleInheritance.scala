//Multiple Inheritance example using traits
abstract class profession{ //abstarct base class
  def workat :String
}

trait doctor extends profession{
  override def  workat = "Doctor works at hospital"  //overriding base variable workat
  def wears = "Doctor wears white court" 
 }

trait Engineer extends profession{
  override def workat = "Engineer works at Office"  //overriding base variable workat
  def workswith = "Engineer works with Computer" 
 }

class Farmers extends doctor with Engineer { //This will call overriden engineer class variable instead of doctor
 
 println(super[doctor].workat)  //This will call the very first base class.
}


object MultipleInheritance {
def main(args: Array[String])
{
  val Obj = new Farmers() //This will call  workat variable of doctor class.
  println(Obj.workat) //This will call  workat variable of Engineer class.
  println(Obj.workswith) //This will call  workswith variable of Engineer class.
  println(Obj.wears) //This will call  wears variable of Engineer class.
  

}
}