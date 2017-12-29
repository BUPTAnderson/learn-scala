package quick.learn

/**
  * Scala中类的定义
  * Created by anderson on 17-12-29.
  */
class Student1 {
  // 定义属性
  private var stuName: String = "Tom"
  private var stuAge: Int = 20

  // 成员方法
  def getStuName(): String = stuName
  def setStuName(newName: String) = this.stuName = newName

  def getStuAge(): Int = stuAge
  def setStuAge(newAge: Int) = this.stuAge = newAge
}

// 创建Student1的伴生对象
object Student1 {
  def main(args: Array[String]): Unit = {
    // 测试Student1
    var s1 = new Student1

    // 第一次输出
    println(s1.getStuName() + "\t" + s1.getStuAge())

    // 调用set方法
    s1.setStuName("Mary")
    s1.setStuAge(25)

    // 第二次输出
    println(s1.getStuName() + "\t" + s1.getStuAge())

    // 第三次输出
    println(s1.stuName + "\t" + s1.stuAge)

    var s2 = new Student2
    // 私有属性无法访问
//    s2.stuName
    var person = new Person("Tom", 12)
    println(person.name + "\t" + person.age)
  }
}