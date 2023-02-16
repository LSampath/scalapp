package enumeration

class EnumerationTest {
  val weekDays: WeekDays.ValueSet = WeekDays.values
//  println(weekDays)
  println(WeekDays.values)
  println(WeekDays.ValueSet)
//  println(WeekDays.ValueOrdering)
//  println(WeekDays.WED)
  for(day <- WeekDays.values) print(day.id + ", ")
  println()
//  println(WeekDays.WED.id)
//  println(WeekDays.MON.id)

  println(Months.JAN)
  for(month <- Months.values) print(month + ", ")
//  println(Months.JAN.id)
//  println(Months.values)
//  for(month <- Months.values) println(month.id)
//  println(Months)
//
//  val a, b = "Test_value"
//  println(a)
//  println(b)

  val car = 10
}

object car {
//  val car = 10
  def car(): Unit = {
    println("this is a car")
  }
}

object WeekDays extends Enumeration {
//  type WeedDays = Value
  val MON, TUE, WED, THU, FRI, SAT, SUN = Value
}

object Months extends Enumeration {
  type Month = Value
  val JAN = Value("january")
  val FEB = Value("february")
  val MAR = Value("march")
}

//abstract class Enumeration(initial: Int) {
//  protected var nextId: Int = initial
//
//  protected final def Value: Value                        = Value(nextId)
//  protected final def Value(i: Int): Value                = Value(i, nextNameOrNull)
//  protected final def Value(name: String): Value          = Value(nextId, name)
//  protected final def Value(i: Int, name: String): Value  = new Value(i, name)
//
//  abstract class Value {
//    //---not going to discuss to avoid confusion
//  }
//}

