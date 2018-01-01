package quick.learn.class4

/**
  * Scala中的trait
  * 1. trait就是抽象类
  * 2. 与抽象类的区别：trait支持多重继承
  */

// 第一个trait
trait Human {
  // 抽象的字段
  val id: Int
  val name: String

  // 方法
  def sayHello():String = "Hello" + name
}

// 第二个trait
trait Actions {
  // 抽象的方法
  def getActionName(): String
}

// 子类
class Student(val id: Int, val name: String) extends Human with Actions {

  override def getActionName() = "Action is running"
}

object Demo2 {
  // 测试程序
  def main(args: Array[String]): Unit = {
    var s1 = new Student(1, "Tom")
    println(s1.sayHello())
    println(s1.getActionName())
  }
}
