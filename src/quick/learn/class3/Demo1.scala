package quick.learn.class3

/**
  * 演示Scala的继承
  */

// 父类
class Person(val name: String, val age: Int) {
  // 定义方法
  def sayHello(): String = "Hello " + name + " and the age is " + age
}

// 子类
class Employee (override val name: String, override val age: Int, val salary: Int) extends Person(name, age) {
  // 重写父类中的sayHello方法
  override def sayHello(): String = "子类中的sayHello方法"
}

object Demo1 {
  // 测试程序
  def main(args: Array[String]): Unit = {
    // 创建一个Person的对象
    var p1 = new Person("Tom", 20)
    println(p1.sayHello())

    // 创建一个Employee的对象
    var p2: Person = new Employee("Mike", 25, 1000)
    println(p2.sayHello())
  }

  // 使用匿名子类来创建新的Person对象
  var p3: Person = new Person("Jerry", 26) {
    override def sayHello(): String = "匿名子类中的sayHello方法"
  }

  println(p3.sayHello())
}
