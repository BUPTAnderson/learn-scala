package learn07

/**
  * Created by anderson on 17-9-1.
  */
object ApplyTest {
  /**
    * apply方法一般是用来帮我们初始化对象的
    */
  def apply() : Unit = {
    println("apply method")
  }
  def main(args: Array[String]): Unit = {
    val a = ApplyTest()
    // 声明了一个数组, 这个数组里面存放了1, 2, 3, 4, 由于没有使用new, 实际调用的是Array的apply方法
//    val arr = Array(1, 2, 3, 4)
//    // 声明了一个数组, 这个数组长度为4, 默认值都是0
//    val arr2 = new Array[Int](4)
  }
}
