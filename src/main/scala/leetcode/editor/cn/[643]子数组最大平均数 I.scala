//给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。 
//
// 示例 1: 
//
// 输入: [1,12,-5,-6,50,3], k = 4
//输出: 12.75
//解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
// 
//
// 
//
// 注意: 
//
// 
// 1 <= k <= n <= 30,000。 
// 所给数据范围 [-10,000，10,000]。 
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def findMaxAverage(nums: Array[Int], k: Int): Double = {
    if (nums.length < k) return 0.0
    var maxSum = 0.0
    for (i <- 1 until nums.size) {
      nums(i) = nums(i) + nums(i - 1)
    }
    nums.foreach(x => print(" ", x))
    println("")
    maxSum = nums(k - 1)
    println(maxSum)
    for (i <- k until nums.length) {
      println(nums(i) + " - " + nums(i - k))
      maxSum = math.max(maxSum, nums(i) - nums(i - k))
    }

    maxSum / k
  }
}

//leetcode submit region end(Prohibit modification and deletion)
