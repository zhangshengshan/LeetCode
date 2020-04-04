//给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺
//序）。 
//
// 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。 
//
// 示例: 
//
// 
//输入:
//[[0,0],[1,0],[2,0]]
//
//输出:
//2
//
//解释:
//两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
// 
// Related Topics 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def distance(a: Array[Int], b: Array[Int]): Int = {
    (a zip b).map(x => (x._1 - x._2) * (x._1 - x._2)).sum
  }

  def numberOfBoomerangs(points: Array[Array[Int]]): Int = {
    var num = 0
    val mymap = scala.collection.mutable.Map[Int, Int]()
    for (item <- points) {
      mymap.clear()
      for (item2 <- points) {
        val i: Int = distance(item, item2)
        if (mymap.contains(i)) mymap(i) += 1
        else mymap(i) = 1
      }
      num += mymap.filter(_._2 > 1).map(x => x._2 * (x._2 - 1)).sum
    }
    num
  }
}

//leetcode submit region end(Prohibit modification and deletion)
