package learn05

import scala.collection.mutable.ArrayBuffer

/**
  * Created by anderson on 17-9-1.
  */
object SingletonDemo {
  def main(args: Array[String]): Unit = {
    def session = SessionFactory.getSession()
    println(session)
  }
}

object SessionFactory {
  // 该部分相当于java中的静态块
  var counts = 5
  val sessions = new ArrayBuffer[Session]()
  while (counts > 0) {
    sessions += new Session
    counts -= 1
  }

  // 在object中的方法相当于java中的静态方法
  def getSession() : Session = {
    sessions.remove(0)
  }
}

class Session {
}