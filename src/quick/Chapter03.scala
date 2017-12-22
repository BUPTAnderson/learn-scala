package quick

import java.awt.datatransfer.SystemFlavorMap

import scala.collection.mutable.ArrayBuffer
import scala.math.random
/**
  * Created by anderson on 17-12-22.
  * 链接: https://www.cnblogs.com/jhcelue/p/7069613.html
  */
object Chapter03 {

  // 1 编写一段代码。将a设置为一个n个随机整数的数组，要求随机数介于0(包括)和n(不包括)之间
  def randomArray(n:Int)={
    for(i <- 0 until n) yield (random * n).toInt
  }

  // 2 编写一个循环，将整数数组中相邻的元素置换。比如,Array(1,2,3,4,5)经过置换后变为Array(2,1,4,3,5)
  def reorderArray(arr:Array[Int]):Array[Int]={
    val t = arr.toBuffer
    for(i <- 1 until (t.length,2);tmp = t(i);j <- i - 1 until i){
      t(i) = t(j)
      t(j) = tmp
    }
    t.toArray
  }

  // 3 反复前一个练习，只是这一次生成一个新的值交换过的数组。用for/yield
  def reorderArray2(arr:Array[Int]):Array[Int]={
    (for(i <- 0 until (arr.length,2)) yield if (i + 1 < arr.length) Array(arr(i + 1),arr(i)) else Array(arr(i))).flatten.toArray
  }

  // 4 给定一个整数数组，产生一个新的数组，包括元数组中的全部正值，以原有顺序排列，之后的元素是全部零或负值。以原有顺序排列
  //使用循环
  def reorderArray3(arr:Array[Int]):Array[Int]={
    val a = ArrayBuffer[Int]()
    val b = ArrayBuffer[Int]()
    arr.foreach(arg => if(arg > 0) a += arg else b += arg)
    a ++= b
    a.toArray
  }
  // 使用数组方法
  def reorderArray4(arr: Array[Int]) = {
    val  b = arr.filter(_ > 0)
    val  c = arr.filter(_ <= 0)
    val newarr = b ++ c
    print(newarr.toBuffer.toString())
  }


  // 5 怎样计算Array[Double]的平均值？
  def aveArray(arr:Array[Double]):Double={
    arr.sum/arr.length
  }

  // 6 怎样又一次组织Array[Int]的元素将他们以反序排列？对于ArrayBuffer[Int]你又会怎么做呢？
  def reverseArray(arr:Array[Int]):Array[Int]={
    arr.reverse
  }

  // 7 编写一段代码，产出数组中的全部值。去掉反复项。
  def distinctArray(arr:Array[Int]):Array[Int]={
    val t = arr.toBuffer
    t.distinct.toArray
  }

  // 8 又一次编写3.4节结尾的演示样例。收集负值元素的下标。反序，去掉最后一个下标。然后对每一个下标调用a.remove(i)。
  def removeArray(array: Array[Int]){
    val t = array.toBuffer
    val index = for (i <- 0 until array.length if array(i) < 0) yield i
    val right = index.reverse.dropRight(1)
    right.foreach(t.remove(_))
    print(t)
  }

  def main(args: Array[String]): Unit = {
//    println(randomArray(10).mkString(","))
//    println(reorderArray(Array(1,2,3,4,5)).mkString(","))
//    println(reorderArray2(Array(1,2,3,4,5)).mkString(","))

    val a = Array(1,3,-3,-5,-7,3,2)
    println(reorderArray3(a).mkString(","))

    // 9 创建一个由java.util.TimeZone.getAvailableIDs返回ide时区集合，推断条件是它们在美洲。去掉"America/"前缀并排序
    val americaTimeZone = java.util.TimeZone.getAvailableIDs
    val americatimezone = java.util.TimeZone.getAvailableIDs.filter(_.take(8)=="America/")
    val sortedamericaTimeZone = americaTimeZone.map(_.drop(8)).sorted
    // 10 引入java.awt.datatransfer.并构建一个类型为SystemFlavorMap类型的对象:
    import java.awt.datatransfer._
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    println(flavors.getNativesForFlavor(DataFlavor.imageFlavor).toArray.toBuffer.mkString(" | "))
  }
}
