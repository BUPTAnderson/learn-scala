package learn15

/**
  * Created by anderson on 17-9-3.
  */
class SpecialPerson(val name : String) {
}

class Student(val name : String) {}

class Older(val name : String) {}

class Worker(val name : String) {}

class TicketHouse {
  var ticketNumber = 1;
  def buySpecialTicket(p : SpecialPerson) = {
    ticketNumber += 1
    println("T = " + ticketNumber)
  }
}

object Test2 {
  /**
    * 学生和老人是特殊人群
    * @param obj
    * @return
    */
  implicit def object2SpecialPerson(obj : Object) : SpecialPerson = {
    if (obj.getClass == classOf[Student]) {
      val student = obj.asInstanceOf[Student]
      new SpecialPerson(student.name)
    } else if (obj.getClass == classOf[Older]) {
      val older = obj.asInstanceOf[Older]
      new SpecialPerson(older.name)
    } else {
      None
    }
  }
  def main(args: Array[String]): Unit = {
    val th = new TicketHouse
    val student = new Student("zhangsan")
    th.buySpecialTicket(student)

    val older = new Older("laoren")
    th.buySpecialTicket(older)

    val worker = new Worker("worker")
    th.buySpecialTicket(worker)
  }
}