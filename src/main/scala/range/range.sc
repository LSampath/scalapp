import scala.math.BigDecimal.double2bigDecimal

val a = 0 to 10
println(a)
println(a.toList)

val b = 0 until 10
println(b)
println(b.toList)

val c = 10 to 0
println(c)
println(c.toList)

val d = 0 to 10 by 2
println(d)
println(d.toList)

val e = 0 to 10 by -1
println(e)
println(e.toList)

val i = 1 to 10 by 2
println(i)
println(i.toList)

val j = 1 until 10 by 2
println(j)
println(j.toList)

val k = 1 until 12 by 2
println(k)
println(k.toList)

val l = 1 until 11 by 2
println(l)
println(l.toList)

val m = 1 until 13 by 2
println(m)
println(m.toList)

val f1 = 0.1
val f = 0.1 to 10.1 by 0.5
println(f)
println(f.toList)

val f2 = 0.5 until 10.0 by 0.5
println(f2)
println(f2.toList)

val g = 'a' to 'g' by 2
println(g)
println(g.toList)

val h = 10L until 20L by 3
println(h)
println(h.toList)
