package learn16

/**
  * Created by anderson on 17-9-3.
  */
class Person(var name : String) {
  def sayHello = println("hello my name is " + name)

  def makeFriedns (p : Person): Unit ={
    sayHello
    p.sayHello
  }
}

class Student(name : String) extends Person(name)
class Dog(val name : String)
class Party[T <% Person](p1 : Person, p2 : Person) {
  p1.makeFriedns(p2)
}

object Test {
  implicit def dog2Person(obj : Object) : Person = {
    if (obj.getClass == classOf[Dog]) {
      val dog = obj.asInstanceOf[Dog]
      new Person(dog.name)
    } else {
      None
    }
  }
  def main(args: Array[String]): Unit = {
    val zhang = new Student("zhangsan")
    val lisi = new Student("lisi")
    val diting = new Dog("diting")
    val p = new Party[Person](zhang, diting)
  }
}