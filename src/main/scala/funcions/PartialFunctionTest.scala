package funcions

class PartialFunctionTest {
  val pf1: PartialFunction[Any,String] = {
    case s: String => "This is a string"
  }

  val pf2: PartialFunction[Any,String] = {
    case d: Double => "This is double"
    case i: Int => "This is an integer"
    case b: Boolean => "This is boolean"
  }

  val pf = pf1 orElse pf2

  def describePF(x: Any, f: PartialFunction[Any,String]): String = f.isDefinedAt(x).toString

  def tryPF(x:Any, f:PartialFunction[Any,String]): String = {
    try {
      f(x)
    } catch {
      case _:MatchError => "Oops.. There is a match error"
    }
  }

  println(describePF(10, pf))
  println(describePF("10", pf))
  println(describePF(10.5, pf))
  println(describePF(None, pf))

  println(tryPF(10, pf))
  println(tryPF("10.4", pf))
  println(tryPF(true, pf))
  println(tryPF(None, pf))

}
