//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最
//大为 k。 
//
// 示例 1: 
//
// 输入: nums = [1,2,3,1], k = 3
//输出: true 
//
// 示例 2: 
//
// 输入: nums = [1,0,1,1], k = 1
//输出: true 
//
// 示例 3: 
//
// 输入: nums = [1,2,3,1,2,3], k = 2
//输出: false 
// Related Topics 数组 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
    val mymap = scala.collection.mutable.Map[Int, Int]()
    for (i <- 0 until nums.size) {
      if(mymap.contains(nums(i)) && i-mymap(nums(i))<=k) return true
      else{
        mymap(nums(i)) = i 
      }
    }
    return false
  }
}

//leetcode submit region end(Prohibit modification and deletion)
