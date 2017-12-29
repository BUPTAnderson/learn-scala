package quick

/**
  * Created by anderson on 17-12-29.
  */

// 5.1 改进5.1节的Counter类,让它不要在Int.MaxValue时变成负数
class Count{
  private var value = Int.MaxValue
  def increment(){if(value < Int.MaxValue) value + 1 else value }
  def current = value
}

// 5.2 编写一个BankAccount类，加入deposit和withdraw方法，和一个只读的balance属性
class BankAccount(val balance: Int = 0) {
  def deposit() {}
  def withdraw() {}
}

// 5.3 编写一个Time类，加入只读属性hours和minutes，和一个检查某一时刻是否早于另一时刻的方法before(other:Time):Boolean。Time对象应该以new Time(hrs,min)方式构建。其中hrs以军用时间格式呈现(介于0和23之间)
class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }

  override def toString: String = {
    hours + " : " + minutes
  }
}

// 5.4 重新实现前一个类中的Time类，将内部呈现改成午夜起的分钟数(介于0到24*60-1之间)。不要改变公有接口。也就是说，客户端代码不应因你的修改而受影响
class Time2(val hours:Int,val minutes:Int){

  def before(other:Time):Boolean={
    hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }

  override def toString():String = {
    hours * 60 + minutes + ""
  }
}

// 5.5 创建一个Student类，加入可读写的JavaBeans属性name(类型为String)和id(类型为Long)。有哪些方法被生产？(用javap查看。)你可以在Scala中调用JavaBeans的getter和setter方法吗？应该这样做吗？
// 生成了name(),name_=(),id(),id_=(),setName(),getName(),setId(),getId() 编写代码如下
import scala.beans.BeanProperty
class Student {
  @BeanProperty var name: String = _
  @BeanProperty var id: Long = _
}

// 5.6 在5.2节的Person类中提供一个主构造器,将负年龄转换为0
class Person(var age: Int) {
  age = if (age < 0) 0 else age
}

// 5.7 编写一个Person类，其主构造器接受一个字符串，该字符串包含名字，空格和姓，如new Person("Fred Smith")。提供只读属性firstName和lastName。主构造器参数应该是var,val还是普通参数？为什么？
// 必须为val。如果为var，则对应的此字符串有get和set方法，而Person中的firstName和lastName为只读的,所以不能重复赋值。如果为var则会重复赋值而报错

// 5.8 创建一个Car类，以只读属性对应制造商，型号名称，型号年份以及一个可读写的属性用于车牌。提供四组构造器。每个构造器fc都要求制造商和型号为必填。型号年份和车牌可选，如果未填，则型号年份为-1，车牌为空串。你会选择哪一个作为你的主构造器？为什么？
//这个没太明白题意。。。
class Car(val maker:String,val typeName:String,val year:Int = -1,var carLice:String = ""){
}

// 5.9 在Java,C#或C++重做前一个练习。Scala相比之下精简多少？

// 5.10 考虑如下的类
//class Employ(val name:String,var salary:Double){
//  def this(){this("John Q. Public",0.0)}
//}
// 重写该类,使用显示的字段定义，和一个缺省主构造器。你更倾向于使用哪种形式？为什么？
class Employ{
  val name:String = "John Q. Public"
  var salary:Double = 0.0
}

object Chapter05 {
}
