package future

object FutureTest {

  def sleep(millis: Long): Unit = {
    Thread.sleep(millis)
  }

  def doWork(index: Int): Int = {
    sleep((Math.random() * 1000).toLong)
    index
  }

//  (1 to 5) foreach()
}
