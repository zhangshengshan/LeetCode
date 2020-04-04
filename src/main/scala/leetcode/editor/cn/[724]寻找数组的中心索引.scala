//给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。 
//
// 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。 
//
// 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。 
//
// 示例 1: 
//
// 
//
// 示例 2: 
//
// 
//输入: 
//nums = [1, 2, 3]
//输出: -1
//解释: 
//数组中不存在满足此条件的中心索引。 
//
// 说明: 
//
// 
// nums 的长度范围为 [0, 10000]。 
// 任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数。 
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def pivotIndex(nums: Array[Int]): Int = {
    val total = nums.sum
    var sum = 0
    for (i <- nums.indices) {
      if( sum + nums(i) + sum == total ) return i
      sum += nums(i)
    }
    return -1
  }
}

//leetcode submit region end(Prohibit modification and deletion)
