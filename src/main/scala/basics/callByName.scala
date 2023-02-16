package basics

import scala.util.Try

object callByName {
  private var a:Int = 0
  private def intGenerator: Int = {
    println("executing intGenerator method")
    a = a + 1
    a
  }

  private def callByValuePrintTwice(num: Int): Unit = {
    println("executing callByValue method")
    println(num)
    println(num)
  }

  private def callByNamePrintTwice(num: => Int): Unit = {
    println("executing callByName method")
    println(num)
    println(num)
  }

  callByValuePrintTwice(intGenerator)
  println("-----------")
  callByNamePrintTwice(intGenerator)

  val attempt = Try(throw new Exception)


//  val num = new NumberWrapper(10)
//
//  private def increaseByOne(num: NumberWrapper): Unit = {
//    num.value = num.value + 1
//  }
//
//  println("value is " + num.value)
//  increaseByOne(num)
//  println("value after update is " + num.value)
}

//class NumberWrapper(var value: Int)
