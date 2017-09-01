package learn05

/**
  * Created by anderson on 17-9-1.
  * 伴生对象和伴生类可以互相访问私有属性
  */
// 这个Worker是下面的object Worker的伴生类, 他们两个必须在同一个文件下面
class Worker {

}

// 这个Worker上上面的class Worker的伴生对象
object Worker {
  def main(args: Array[String]): Unit = {
    val p1 = Worker
    val p2 = Worker
    println(p1 + ", " + p2)
  }
}