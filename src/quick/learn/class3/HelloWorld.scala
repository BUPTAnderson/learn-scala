package quick.learn.class3

// 使用应用程序对象：可以省略main方法
object HelloWorld extends App {
  println("Hello world")

  // 如何取得命令行的参数
  if(args.length > 0) {
    println(args(0))
  } else {
    println("no argument")
  }
}
