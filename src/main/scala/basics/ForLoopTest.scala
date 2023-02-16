package basics

object ForLoopTest {
//  val names = Seq("chris", "ed", "maurine")
//  val nums = Seq(1, 2, 3, 4)

  //simple for loops
//  for(n <- names) println(n)
//  for(n <- names) {
//    println(n.capitalize)
//  }

  // multiple generators are equals to nested loops
//  val perm: Seq[(String, Int)] = for {
//    n <- names
//    m <- nums
//  } yield (n, m)

//  val perm2 = for (n <- names; m <- nums) yield (n,m)
//  println(perm2)

//
//  println(perm)
//
//  val nameSeqs = for (n <- nums) yield n * 2
//  println(nameSeqs)
//
//  val nameSeq2 = for (n <- nums) yield {
//    val m = n * n
//    println(m)
//    m
//  }
//  println(nameSeq2)

  // guards/filters
//  for (n <- nums if n%2 == 0 ) println(n)
//  for (n <- nums if n%2 == 0 if n == 4) println(n)
//  for {
//    n <- nums if n%2 == 0
//  } println(n)
//  for {
//    n <- nums if n%2 == 0
//    m <- names
//  } println(n, m)

//  println((2 to 2).toList)

//  val set = for {
//    i <- 0 to 2
//    j <- i to 2
//  } yield {
//    // some code here
//    // what happen when we dont yield anything
//    (i,j)
//  }
//  println(set)
//
//  for {
//    i <- 0 to 2
//    j <- i to 2
//  } {
//    println(i,j)
//  }

//  ======================
//  simple and complex
//  val numList = Seq(1, 2, 3, 4)
//  val nameList = Seq("John", "Shane", "Mark", "Sara")

//  for(n <- numList) println(n)    //------------ a simple for expression

//  val combinationList = for {     //------------ a complex for expression
//    num <- numList
//    if num%2 == 0
//    name <- nameList
//    firstChar = name.charAt(0)
//    if firstChar == 'S'
//  } yield {
//    // some logic here
//    println(firstChar)
//    (num, name)
//  }
//  println(combinationList)

//  for { n <- numList; m <- nameList } println(n,m)

//  val numList = Seq(1, 2, 3, 4)
//  val numList2 = List(10,20,40)
//
//  for (n <- numList) print(n + " ")   //------------ single generator
//  // > 1 2 3 4
//
//  for (n <- numList; m <- numList2) print((n,m) + " ")      //----- multiple generator
//  // > (1,10) (1,20) (1,40) (2,10) (2,20) (2,40) (3,10) (3,20) (3,40) (4,10) (4,20) (4,40)
//
//  for {                                                    //----- multiple generators
//    n <- numList
//    m <- numList2
//  } print((n,m) + " ")
//  // > (1,10) (1,20) (1,40) (2,10) (2,20) (2,40) (3,10) (3,20) (3,40) (4,10) (4,20) (4,40)

//  val tourists = List(("Sara", 25), ("John", 45), ("Mark", 23), ("Lisa", 35), ("Jean", 50), ("Shakya", 12))
//  for {
//    (name, age) <- tourists
//    if age < 40
//    if name.startsWith("S") && name.endsWith("a")
//  } {
//    // something to do with tourists younger than 40 years,
//    // and name starts with 'S' and ends with 'a'
//  }

  val names = List("Shawn", "Mark", "Lisa", "Shoker", "Linda", "Ben")
  val filteredNames: Seq[String] = for {
    name <- names
    firstChar = name.charAt(0)
    if firstChar == 'S'
  } yield {
    // firstChar = 'K'  // final variable. cannot reassign
    name
  }

}
