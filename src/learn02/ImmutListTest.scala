package learn02

/**
  * Created by anderson on 17-9-1.
  */
object ImmutListTest {
  def main(args: Array[String]): Unit = {
    // 创建一个不可变的集合
    val lst1 = List(1, 2, 3)
    // 将0插入到lst1的签名生成一个新的List, 原有的lst1是不可变的
    val lst2 = 0 :: lst1
    // 将0插入到lst1的签名生成一个新的List, 原有的lst1是不可变的
    val lst3 = lst1. :: (0)
    // 将0插入到lst1的签名生成一个新的List, 原有的lst1是不可变的
    val lst4 = 0 +: lst1
    // 将0插入到lst1的签名生成一个新的List, 原有的lst1是不可变的
    val lst5 = lst1.+:(0)

    // 将一个元素添加到lst1的后面产生一个新的集合
    val lst6 = lst1 :+ 3

    val lst0 = List(4, 5, 6)
    // 将2个list合并成一个新的List
    val lst7 = lst1 ++ lst0
    // 将lst0插入到lst1前面生成一个新的集合
    val lst8 = lst1 ++: lst0

    // 将lst0插入到lst1前面生成一个新的集合
    val lst9 = lst1.:::(lst0)

    // 方法
    // 求和
    println(lst1.sum)
    // 获取第一个元素
    println(lst1.head)
    // 获取第一个元素后面的元素, 还是一个list并即
    println(lst1.tail)
    println(lst1.reduce((x : Int, y : Int) => x + y))
    // 上面的等价于
    println(lst1.reduce((_ + _)))

    val lista = List(5, 6, 7)
    val listb = List(6, 7, 8)
    // 并集
    val listc = lista.union(listb)
    // 交集
    val listd = lista.intersect(listb)
    // 差集
    val liste = lista.diff(listb)
  }
}
