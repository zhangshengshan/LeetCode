//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val mymap = scala.collection.mutable.Map[Int, Boolean]()
    for (item <- nums1) {
      mymap(item) = false
    }
    for (item <- nums2) {
      if (mymap.contains(item)) {
        mymap(item) = true
      }
    }
    mymap.filter(x => x._2 == true).map(_._1).toArray
  }:e
}

//leetcode submit region end(Prohibit modification and deletion)
