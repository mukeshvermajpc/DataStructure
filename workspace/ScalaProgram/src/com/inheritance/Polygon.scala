package com.inheritance

class Polygon {
  def area:Double=0.0
}
object Polygon{
  def main(args:Array[String])
  {
    var poly=new Polygon;
    printArea(poly)
  }
  def printArea(p:Polygon)
  {
    println(p.area)
  }
}