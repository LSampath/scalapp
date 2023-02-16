package constructor

class Dog(var name: String, age: Int) {
  println("dog - name: " + name + ", age: " + age)

  def this(name: String) = {
    this(name, 0)
  }

  def this(name: String, kind: String) = {
    this(name, 0)
    println("this is from " + kind + " kind.")
  }

  def method(): Unit = {
    println()
  }
}
