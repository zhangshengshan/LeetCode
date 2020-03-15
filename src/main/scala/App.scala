package example
object App {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.Queue
    val myqueue = Queue[Int]()
    myqueue.front
  }
}
