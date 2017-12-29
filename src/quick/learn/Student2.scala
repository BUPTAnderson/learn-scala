package quick.learn

/**
  * 属性的get和set方法
  * 1. 当定义属性是private时候, scala会自动为其生成对应的get和set方法
        private var stuName: String = "Tom"
        (1) get 方法: stuName   ----> s2.stuName / s2.stuName()
        (2) set 方法: stuName_= , 但是赋值的时候还是直接使用: s2.stuName = "Andy", 只不过该赋值操作会调用stuName_=方法

  * 2. 定义属性: private var money: Int = 1000 希望money只有get方法, 没有set方法??
        办法, 将其定义为常量 private val money: Int = 1000

  * 3. private[this]的用法, 该属性只属于该对象, 就不会生成对应的set和get方法,
        private[this] var stuAge: Int = 20
       就是如果想访问该属性的话, 就需要单独为该属性定义方法来获取或修改该属性的值
  * Created by anderson on 17-12-29.
  */
class Student2 {
  // 定义属性
  private var stuName: String = "Tom"
  private var stuAge: Int = 20
  private val money: Int = 1000
}

// 测试
object Student2 {
  def main(args: Array[String]): Unit = {
    var s2 = new Student2
    println(s2.stuName + "\t" + s2.stuAge)
    s2.stuName = "Andy"
    println(s2.stuName + "\t" + s2.stuAge + "\t" + s2.money)

    // 修改money的值, 会报错
//    s2.money = 2000
  }
}