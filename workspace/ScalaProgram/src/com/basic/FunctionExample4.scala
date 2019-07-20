package com.basic
import java.util.Date;
object FunctionExample4 {
  def log(data:Date,message:String)={
    println(data+"  "+message)
  }
  def main(args:Array[String])
  {
    val sum=(a:Int,b:Int,c:Int)=>a+b+c
    val f=sum(10,_:Int,_:Int)
    println(f(100,200))
    val date=new Date;
   
    val newLog=log(date,_:String);
    newLog("The message 1");
    newLog("The message 2");
    newLog("The message 3")
  }
}