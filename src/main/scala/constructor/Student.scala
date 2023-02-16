package constructor

class Student(val id: Int, name: String) {
  println("primary constructor - id: " + id + ", name: " + name)

  def this(name: String) {
    this(0, name)
    println("auxiliary constructor - name: " + name)
  }

  def describe(): Unit = {
    println("describe student - id: " + id + " name: " + name)
  }
}
