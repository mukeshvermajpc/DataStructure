package com.basic

object IfExample {
  def main(args:Array[String])
  {
    println("Conditional Statement Example")
    IfTest()
    IfElseTest()
    ifElseLadder()
  }
  def IfTest()
  {
    var age:Int=20;
    if(age>18)
    {
      println("You are eligible for Vote")
    }
  }
  def IfElseTest()
  {
    var age:Int=20;
    if(age>18)
    {
      println("You are eligible for vote")
    }
    else{
      println("You are not eligile for vote")
    }
  }
  def ifElseLadder()
  {
    var number:Int=75
    if(number>=0 && number<50)
    {
      println("Fail")
    }
    else if(number>50 && number<60)
    {
      println("D Grade")
    }
    else if(number>=60 && number <70)
    {
      println("C Grade")
    }
    else if(number>=70 && number<80)
    {
      println("B Grade")
    }
    else if(number>80)
    {
      println("A Grade")
    }
    else 
    {
      println("Invalid")
    }
  }
}