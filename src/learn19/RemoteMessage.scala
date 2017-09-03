package learn19

/**
  * Created by anderson on 17-9-3.
  */
trait RemoteMessage extends Serializable {}
// 注册消息
case class RegisterMsg(username : String, password : String) extends RemoteMessage
// 心跳信息
case class Heartbeat(id : String, context : String) extends RemoteMessage
// 结果信息
case class ResultMsg(id : Int, context : String) extends RemoteMessage