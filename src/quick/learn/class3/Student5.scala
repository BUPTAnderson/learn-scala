package quick.learn.class3

/**
  * 遇到如下形式的表达式时，apply方法就会调用
  * Object(参数1, 参数2, ... , 参数N)
  * 通常， 这样一个apply方法返回的是伴生类的对象；其作用是为了省略new关键字
  */

// ojbect的apply方法
class Student5 (val stuName: String) {

}

object Student5 {
  // 定义自己的apply方法
  def apply(stuName: String) = {

    println("*********** Apply in Object *****************")
    new Student5(stuName)
  }

  def main(args: Array[String]): Unit = {
    // 创建Student5的一个对象
    var s51 = new Student5("Tom")
    println(s51.stuName)

    // 创建Student5的一个对象
    var s52 = Student5("Marry")
    println(s52.stuName)
  }
}