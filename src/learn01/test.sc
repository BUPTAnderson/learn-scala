import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

// 方法
def m1(x : Int, y : Int): Int = {x - y}
// 方法
def m2(x : Int, y : Int) {x + y}
// 函数
val f1 = (x : Int, y : Int) => x * y
f1(1, 2)
// 匿名函数
(x : Int, y : Int) => x * y
//res1(2, 3)
// 方法, 参数为函数(函数返回值是Int)
def m2(f: (Int, Int) => Int) = f(2, 6)
m2(f1)

// 方法
def m3(f: (Int, Int) => Int) = f(4, 6)
// 函数
val f2 = (x : Int, y : Int) => x + y
// 函数
val f3 = (x : Int, y : Int) => x*y
m3(f2)
m3(f3)
// 函数
val f4 = (x : Int) => x * 2
// array
val array = Array(1, 2, 3, 4, 5, 6)
array.map(f4)
array.map((x : Int) => x * 2)
// 将集合中的字符串变成大写
val a = Array("zhangsan", "lisi", "wangwu")
a.map(_.toUpperCase)
// 定义数组
val arr1 = Array(1, 2, 3, 4)
val arr2 = Array(1, 2, 3, "Li")
// 指定类型
val arr3 = Array[Int](1, 2, 3)
// 创建定长数组
val arr4 = new Array[Int](10)
// 对元素赋值
arr4(0) = 1
arr4(0)
// 创建定长数组
val arr5 = new Array[Int](10)
// 创建变长数组
val ab = ArrayBuffer[Int]()
// 添加一个元素
ab += 1
// 添加多个元素
ab += (1, 2, 3, 4)
// 追加一个数组
ab ++= Array[Int](1, 2, 3)
// 在位置为0的地方插入-1, -2
ab.insert(0, -1, -2)
// 在位置为0的地方移除2个元素
ab.remove(0, 2)
// 数组的遍历
val a2 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
for (i <- a2) println(i)
for (i <- 0 until a2.length) println(a2(i))
for (i <- 0 to a2.length - 1) println(a2(i))

val test = for (i <- a2 if (i % 2 == 0)) yield i * 10

a2.filter((x : Int) => x % 2 == 0)
a2.filter(_ % 2 == 0)

var test2 = a2.filter(_ % 2 == 0).map(_ * 10)

// 数组常见的算法
var arr = Array(1, 4, 2, 3)
// 求和
arr.sum
// 排序
arr.sorted
// 自定义排序
arr.sortWith((x, y) => x > y)
arr.sortWith(_ < _)
arr.sortBy((x : Int) => x)
// 按照字典类型排序
arr.sortBy((x : Int) => x + "")

// Map集合操作
// 不可变Map
val scores = Map("tom" -> 55, "Lee" -> 98)
// 可变map
val s= scala.collection.mutable.Map("tom" -> 34)
// 修改tom的值
s("tom") = 35
// 获取tom的值
s("tom")
// 返回Option对象
s.get("tom")
s.get("tom1")
s.getOrElse("tom", 0)

// hashMap
val map1 = new mutable.HashMap[String, Int]()
// 添加元素
map1("spark") = 1
// 添加元素
map1 += (("hadoop", 2))
// 添加元素
map1.put("storm", 3)
// 移除元素
map1.remove("storm")
// 移除元素
map1 -= ("hadoop")

// 元组
val t = ("hadoop", 23, 3.14)
// 访问第一个元素
t._1
// 访问第二个元素
t._2
// 数组中存放元组
val arr6 = Array(("tom", 88), ("jerry", 98))
// 转换成map
arr6.toMap

// 拉链操作
val names = Array("zhangsan", "lisi", "wangwu")
val scores2 = Array(95, 98, 34)
names.zip(scores2)
// 个数不一样也是可以的
val names2 = Array("zhangsan", "lisi", "wangwu", "maliu")
names2.zip(scores2)

// 单词计数
val wordArr = Array("a,b,c", "a,b,d", "a,c,a")
wordArr.map((line : String) => line.split(",")) // 变成Array(Array(a, b, c), Array(a, b, d), Array(a, c, a))
  .flatten // 变成Array(a, b, c, a, b, d, a, c, a)
.map((_, 1)) // 相当于map((word: String) => (word, 1)), 变成Array((a, 1),(b,1),(c,1),(a,1),(b,1),(d,1),(a,1),(c,1),(a,1))
.groupBy( _._1) // 相当于groupBy( tuple => tuple._1), 对元组的第一位进行分组, 变成Map(b -> Array((b,1), (b,1)), d -> Array((d,1)), a -> Array((a,1),(a,1),(a,1),(a,1)), c -> Array((c,1),(c,1)))
.map(tuple => (tuple._1, tuple._2.length)) // 变成Map(b->2, d -> 1, a -> 4, c -> 2)

// flatMap方法
wordArr.flatMap(line => line.split(",")) // 变成:Array(a, b, c, a, b, d, a, c, a)

import scala.io.Source
// 如果文件不存在会报错
val file = Source.fromFile("/tmp/a.txt")
// 加上lazy则不会出错(加上lazy之后这行代码实际没有被执行, 只有在实际使用的时候才会被执行)
lazy val file2 = Source.fromFile("/tmp/a.txt")
// 读取每行对象(这时候实际使用对象的时候代码被执行, 如果文件不存在, 这时候会报错)
for (line <- file.getLines()) println(line)