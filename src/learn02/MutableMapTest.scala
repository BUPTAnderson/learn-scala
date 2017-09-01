package learn02
import scala.collection.mutable.HashMap
/**
  * Created by anderson on 17-9-1.
  */
object MutableMapTest extends App {
  val map1 = new HashMap[String, Int]()
  // 向map中添加数据
  map1("spark") = 1
  map1 += (("hadoop", 1))
  map1("spark") = 1
  map1 += (("hadoop", 2))
  map1.put("storm", 3)
  println(map1)

  // 从map中移除元素
  map1 -= "spark"
  map1.remove("hadoop")
  println(map1)
}
