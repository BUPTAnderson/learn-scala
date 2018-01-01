import java.io.{File, FileInputStream, PrintWriter}
// 读取行
//val source = scala.io.Source.fromFile("/Users/anderson/IdeaProjects/a.txt")
// 1. 将整个文件作为一个字符串
//println(source.mkString)
// 2. 将文件中的每一行读入
//val lines = source.getLines()
//for(line <- lines) println(line.toString())

// 读取字符
//val source = scala.io.Source.fromFile("/Users/anderson/IdeaProjects/a.txt")
//for(character <- source) println(character)

// 从URL或其它源读取： http://www.baidu.com
//val source = scala.io.Source.fromURL("http://www.baidu.com", "UTF-8")
//println(source.mkString)

// 读取二进制文件， Scala并不支持读取二进制文件
//val file = new File("/Users/anderson/资料/工作文档.zip")
//// 构造一个InputStream
//val in = new FileInputStream(file)
//// 构造一个buffer
//val buffer = new Array[Byte](file.length().toInt)
//// 读取
//in.read(buffer)
//// 关闭
//in.close()

// 写入文本文件
val out = new PrintWriter("/Users/anderson/IdeaProjects/x.txt")
for(i <- 1 to 10) out.println(i)
out.close()