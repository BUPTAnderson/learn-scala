package learn01

/**
  * Created by anderson on 17-8-31.
  */
object VariableTest {
  def main(args: Array[String]): Unit = {
    // 使用val定义的变量值是不可变的, 相当于java里用final修饰的变量
    val i = 1
    // 使用var定义的变量是可变的, 在Scala中鼓励使用val
    var s = "hello"
    s = "Haha"
    // scala编译器会自动推断变量的类型, 必要的时候可以指定类型
    // 变量名在前, 类型在后
    var str: String = "world"
  }
}
