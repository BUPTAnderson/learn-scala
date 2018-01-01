package quick.learn.class3

import scala.collection.mutable.ArrayBuffer

/**
  * 嵌套类：内部类
  */
class Student3 {

  // 定义一个内部类：记录学生选修的课程信息
  class Course(val courseName: String, val credit: Int) {
    // 定义其他方法
  }

  // 属性
  private var stdName: String = "Tom"
  private var stuAge: Int = 20

  // 定义一个ArrayBuffer记录该学生选修的所有课程
  private var courseList = new ArrayBuffer[Course]()

  // 定义方法往学生信息中添加新的课程
  def addNewCourse(cname: String, credit: Int): Unit = {
    // 创建新的课程
    var c = new Course(cname, credit)
    // 将课程加入list
    courseList += c
  }
}

object Student3 {
  def main(args: Array[String]): Unit = {
    // 创建学生对象
    var s3 = new Student3

    // 给学生添加新的课程
    s3.addNewCourse("Chinese", 2)
    s3.addNewCourse("Englist", 3)
    s3.addNewCourse("Math", 4)

    // 输出
    println(s3.stdName + "\t" + s3.stuAge)
    println("*************选修的课程***********")
    for(s <- s3.courseList) println(s.courseName + "\t" + s.credit)
  }
}