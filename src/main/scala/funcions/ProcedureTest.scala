package funcions

class ProcedureTest {

//  https://alvinalexander.com/scala/iterating-scala-lists-foreach-for-comprehension/

  private var value = 1
  def test(): Unit = {
    value += 2;
    println(value)
  }
  def test2(): Int = value



  println(value)
  test()
  println(value)
  println(test())
  println(test2())
}
