package learn19

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.Socket

import learn15.HeartBeat

/**
  * Created by anderson on 17-9-3.
  */
object MyClient {
  def main(args: Array[String]): Unit = {
    val socket : Socket = new Socket("127.0.0.1", 4444)
    val oos = new ObjectOutputStream(socket.getOutputStream)
    val ois = new ObjectInputStream(socket.getInputStream)

    oos.writeObject(RegisterMsg("zhangsan", "123456"))
    oos.flush()

    val resultMsg = ois.readObject()
    println(resultMsg)

    oos.writeObject(Heartbeat("spark", "alive"))
    oos.flush()

    val heartbeatMsg = ois.readObject()
    println(heartbeatMsg)

    ois.close()
    oos.close()
    socket.close()
  }
}
