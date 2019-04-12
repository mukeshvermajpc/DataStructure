package com.obj

class Programmer extends Employee1 {
   var bonus:Int=5000
   println("Salary = "+salary)
   println("Bonus = "+bonus)
}
object ProgrammerObject{
  def main(args:Array[String])
  {
    new Programmer()
  }
}