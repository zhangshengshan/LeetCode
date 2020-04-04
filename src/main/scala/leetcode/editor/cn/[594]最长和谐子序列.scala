//和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。 
//
// 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。 
//
// 示例 1: 
//
// 
//输入: [1,3,2,2,5,2,3,7]
//输出: 5
//原因: 最长的和谐数组是：[3,2,2,2,3].
// 
//
// 说明: 输入的数组长度最大不超过20,000. 
// Related Topics 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def findLHS(nums: Array[Int]): Int = {

    val mymap = scala.collection.mutable.Map[Int, Int]()
    var num = 0

    for (item <- nums) {
      if (mymap.contains(item)) {
        mymap(item) += 1
      } else {
        mymap(item) = 1
      }
    }

    for (item <- mymap) {
      if (mymap.contains(item._1 + 1)) {
        num = math.max(num, mymap(item._1) + mymap(item._1 + 1))
      } else if (mymap.contains(item._1 - 1)) {
        num = math.max(num, mymap(item._1) + mymap(item._1 - 1))
      }
    }
    return num
  }
}

//leetcode submit region end(Prohibit modification and deletion)
