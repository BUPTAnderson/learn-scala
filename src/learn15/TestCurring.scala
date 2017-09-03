package learn15

/**
  * Created by anderson on 17-9-3.
  */
object TestCurring {
  // implicit 隐式参数 这里是全局的
  implicit var aaa : Int = 100
//  implicit var hh : Int = 1000
  def k1(x : Int) (y : Int) : Int = x + y

  // implicit 隐式参数 这里是局部的, 会先查找全局的, 如果找到了, 就用全局的, 没找到就用局部的, 不是根据名字找的, 是根据类型查找的, 这里是Int, 只要找到了全局的Int类型的隐式参数就可以
  def k2(x : Int) (implicit y : Int = 10) = x + y
  def main(args: Array[String]): Unit = {
    val result = k1(1)(2)
    println(result)
    val result2 = k2(1)
    println(result2)
  }
}
