package learn19

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.{ServerSocket, Socket}

/**
  * Created by anderson on 17-9-3.
  */
object MyServer {
  def handlerRegister(name : String, passwd : String): ResultMsg = {
    println("客户端注册服务端, 注册成功!")
    ResultMsg(1, "注册成功")
  }

  def handleHeatBeat(id : String, context : String) : ResultMsg = {
    println("心跳发送成功!")
    ResultMsg(2, "心跳成功")
  }

  def main(args: Array[String]): Unit = {
    val server : ServerSocket = new ServerSocket(4444)
    val clientSocket : Socket = server.accept()

    // 获取对象的输入流
    val stream : ObjectInputStream = new ObjectInputStream(clientSocket.getInputStream)
    // 对象的输出流
    val oos : ObjectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream)

    while (true) {
      // 这里不用担心, 如果客户端没发过来东西, 会一致阻塞在这里
      val clientMsg = stream.readObject()

      val result = clientMsg match {
        case RegisterMsg(name, password) => {
          handlerRegister(name, password)
        }
        case Heartbeat(id, context) => {
          handleHeatBeat(id, context)
        }
      }

      oos.writeObject(result)
      oos.flush()
    }
  }
}
