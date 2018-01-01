package quick.learn.class3

/**
  *
  * 类的构造器
  * 1. 主构造器：和类的声明结合在一起；只能有一个主构造器
  *     Student4(val stuName: String, val stuAge: Int)
  *     (1) 定义类的主构造器：两个参数
  *     (2) 声明了两个属性：stuName和stuAge和对应的get和set方法
  *
  * 2. 辅助构造器: 可以有多个辅助构造器
  *     通过关键字this来实现
  *
  */

class Student4(val stuName: String, val stuAge: Int) {

  // 定义辅助构造器
  def this(age: Int) {
    // 调用主构造器
    this("no name", age)
  }
}

object Student4 {
  def main(args: Array[String]): Unit = {
    // 创建Student的一个对象
    var s4 = new Student4("Tom", 20)
    println(s4.stuName + "\t" + s4.stuAge)

    // 创建一个新的student4的对象
    var s42 = new Student4(25)
    println(s42.stuName + "\t" + s42.stuAge)
  }
}