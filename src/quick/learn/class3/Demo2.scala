package quick.learn.class3

/**
  * Scala中的抽象类
  */

// 父类：抽象类
abstract class Vehicle {
  // 定义抽象方法
  def checkType(): String
}

// 子类
class Car extends Vehicle {
  // 实现checkType方法
  def checkType() = {"I am a car"}
}

class Bysical extends Vehicle {
  // 实现checkType方法
  def checkType(): String = {"I am a bike"}
}

object Demo2 {
  def main(args: Array[String]): Unit = {
    // 定义两个交通工具
    var v1: Vehicle = new Car
    println(v1.checkType())

    var v2: Vehicle = new Bysical
    println(v2.checkType())
  }
}
