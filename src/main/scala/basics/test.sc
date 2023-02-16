//class NumberWrapper(var value: Int) {
//  def getValue: Int = {
//    println("returning the value")
//    value
//  }
//}
//
//def increaseByOne(num: NumberWrapper): Unit = {
//  num.value = num.value + 1
//  println("value after update is " + num.value)
//}
//
//val num = new NumberWrapper(10)
//
//println("value is " + num.value)
//increaseByOne(num)
//println("value after update outside function scope is " + num.value)
//
///**
// * value is 10
// * value after update is 11
// * value after update outside function scope is 11
// */


var a = 0
def intGenerator: Int = {
  println("executing intGenerator method")
  a = a + 1
  a
}

def callByValuePrintTwice(num: Int): Unit = {
  println("executing callByValue method")
  println(num)
  println(num)
}

def callByNamePrintTwice(num: => Int): Unit = {
  println("executing callByName method")
  println(num)
  println(num)
}

//callByValuePrintTwice(intGenerator)
println("-----------")
callByNamePrintTwice(intGenerator)


