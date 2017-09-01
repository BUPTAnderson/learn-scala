package learn09

/**
  * Created by anderson on 17-9-1.
  * 如果在父类中, 有某些方法无法立即实现, 而需要依赖不同的子类来覆盖, 重写实现自己不同的方法实现.
  * 此时可以将父类中的这些方法不给出具体的实现, 只有方法签名, 这种方法就是抽象方法.
  * 而一个类中如果有一个抽象方法, 那么类就必须用abstract来声明为抽象类, 此时抽象类是不可以实例化的
  * 在子类中覆盖抽象类的抽象方法, 不需要使用override关键字
  */
abstract class Person (val name : String) {
  // 定义抽象方法
  def sayHello : Unit
  // 可以定义非抽象方法
  def sayHello(name: String): Unit = println("Hello, " + name)
}

class Student (name : String) extends Person (name) {
  // 实现父类方法, 可以不加override
  override def sayHello: Unit = println("Hello, " + name)
}
