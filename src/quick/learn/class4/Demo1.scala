package quick.learn.class4

/**
  * Scala中的抽象字段：就是没有初始值的字段
  */

// 抽象的父类
abstract class Person {
  // 第一个抽象的字段， 并且只有get方法
  val id: Int

  // 另一个抽象的字段， 并且有get和set方法
  var name: String
}

// 子类：应该提供抽象字段的初始值， 否则该子类也应该是抽象的
abstract class Employee1 extends Person {
  //val id: Int = 1
  var name: String = "No Name"
}

// 通过主构造器初始化父类的抽象属性，属性名一定要相同, 当然也可以在类内部初始化抽象属性
class Employee2(val id: Int) extends Person {
  // 只提供了name的初始值
  var name: String = "No Name"
}
object Demo1 {

}
