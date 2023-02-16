package alias

import scala.math.BigDecimal.double2bigDecimal

//import scala.math.BigDecimal.double2bigDecimal

class TypeAliasTest {
  val doubleItString: (Int) => (String) = (a: Int) => { (a * 2).toString }: String

  println(doubleItString(10))

  type DoubleItFunction = (Int) => (String)

  val func: DoubleItFunction = doubleItString;

  println(func(2))

  val reduceFunc = (intList: List[Int], strategy: (Int, Int) => Int) => {
    var total = intList(0)
    for (i <- List.range(1, intList.size)) {
      total = strategy(total, intList(i))
    }
    "Reduced amount is :" + total.toString
  }

  type IntListToString = (List[Int], (Int, Int) => Int) => String
  val newFunc: IntListToString = reduceFunc
  println(newFunc(List(1, 2, 3, 4, 5), (t:Int, x:Int) => t + x))

  val e = 1 to 10
  val f = 0.1 to 10.1
}
