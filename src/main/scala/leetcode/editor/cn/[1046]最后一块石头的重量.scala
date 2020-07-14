//有一堆石头，每块石头的重量都是正整数。 
// 每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下： 
// 如果 x == y，那么两块石头都会被完全粉碎； 
// 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。 
// 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。 
// 提示： 
// 1 <= stones.length <= 30 
// 1 <= stones[i] <= 1000 
// 
// Related Topics 堆 贪心算法


object Solution{
  def lastStoneWeight(stones: Array[Int]): Int = {
    //implicit val smallOrdering = Ordering[Int].reverse
    implicit val smallOrdering = Ordering[Int]
    val heap = scala.collection.mutable.PriorityQueue[Int]()  
    for (item <- stones) {
      heap.enqueue(item)
    }
    while(heap.size >= 2){
      val max = heap.dequeue
      val secondMax = heap.dequeue
      println("max:" + max + " secondMax:" + secondMax)
      if(max - secondMax > 0) heap.enqueue(max- secondMax)
    }

    if(heap.size == 1) heap.dequeue else 0
  }
}
