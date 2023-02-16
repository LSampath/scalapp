package constructor

class Person(age: Int, name: String) {
  println("primary constructor of Person")

  def this(name: String) = {
    this(0, name)
    println("auxiliary constructor of Person")
  }
}

class Employee(empId: Int, age: Int, name: String) extends Person(name) {
  println("primary constructor for Employee")

  def this(empId: Int, name: String) = {
    this(empId, 0, name)
    println("auxiliary constructor of Employee")
  }
}
