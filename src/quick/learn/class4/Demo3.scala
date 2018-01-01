package quick.learn.class4

/**
  * Scala中的包对象：常量，变量， 方法， 类， 对象， trait（特质）
  */

// 定义一个包对象
package object MyPackageObject {
  // 常量
  val x: Int = 0

  // 变量
  var y: String = "Hello World"

  // 方法
  def sayHelloWorld() : String = "Hello World"

  // 类
  class MyTestClass {

  }

  // 对象object
  object MyTestObject {

  }

  // trait(特质)
  trait MyTestTrait {

  }
}
object Demo3 {
  // 测试
  def method1() = {
    // 导入需要的包对象
    import quick.learn.class4.MyPackageObject._
    // 定义MyTestClass的一个对象
    var a = new MyTestClass
  }
}
