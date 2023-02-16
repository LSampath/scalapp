package funcions

class ApplyMethod {
  val func: () => Unit = () => println("function A called")
  func            // false
  func()          // true

  val func1: () => Unit = func        // false
  func1           // false
  func1()         // true

  val func2: Unit = func()    // true
  func2             // nothing

  def methodA(): Unit = println("method A called")

  def methodB()(b: Int): Unit = println("method B called with - " + b)
  def methodC(a: Int)(): Unit = println("method C called with - " + a)

  methodA
  methodA()

  methodB()(3)
//  methodB(3)

  methodC(3)()
//  methodC(3)


  val a: Int = {
    println("a is a function??")
    10
  }

  println(a)
}
