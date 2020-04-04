//给定一个未经排序的整数数组，找到最长且连续的的递增序列。 
//
// 示例 1: 
//
// 
//输入: [1,3,5,4,7]
//输出: 3
//解释: 最长连续递增序列是 [1,3,5], 长度为3。
//尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。 
// 
//
// 示例 2: 
//
// 
//输入: [2,2,2,2,2]
//输出: 1
//解释: 最长连续递增序列是 [2], 长度为1。
// 
//
// 注意：数组长度不会超过10000。 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def findLengthOfLCIS(nums: Array[Int]): Int = {
    // DP 

    if (nums.length <= 1) return nums.length
    val dp = new Array[Int](nums.size)

    dp(0) = 1

    for (i <- 1 to nums.length - 1) {
      if (nums(i) <= nums(i - 1))
        dp(i) = 1
      else
        dp(i) = dp(i - 1) + 1
    }
    return dp.max
  }

  //if (nums.length == 0) return 0
  //var num = 1
  //var max_num = Int.MinValue
  //var i = 0

  //while (i <= nums.length - 1) {
  //var j = i + 1
  //import util.control.Breaks._
  //breakable {
  //while (j < nums.length) {
  //if (nums(j) > nums(j - 1)) {
  //num += 1
  //j += 1
  //}
  //else {
  //max_num = math.max(max_num, num)
  //num = 1
  //break
  //}
  //}
  //}
  //i = j
  //}

  //return math.max(num, max_num)
}

//leetcode submit region end(Prohibit modification and deletion)
