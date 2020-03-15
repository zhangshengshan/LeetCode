//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 示例 1: 
//
// 输入: [3,2,3]
//输出: 3 
//
// 示例 2: 
//
// 输入: [2,2,1,1,1,2,2]
//输出: 2
// 
// Related Topics 位运算 数组 分治算法


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def majorityElement(nums: Array[Int]): Int = {
    import scala.collection.mutable.Map
    var map = Map[Int, Int]()
    for (item <- nums) {
      if (map.contains(item))
        map(item) = map(item) + 1
      else
        map(item) = 1
    }
    val tuple: (Int, Int) = map.reduce((x1, x2) => if (x2._2 > x1._2) x2 else x1)
    tuple._1

  }
}

//leetcode submit region end(Prohibit modification and deletion)
