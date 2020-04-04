//给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。 
// 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，总满足 array[i] <= array[i + 1]。 
// 示例 1: 
// 输入: nums = [4,2,3]
//输出: true
//解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
// 示例 2: 
// 输入: nums = [4,2,1]
//输出: false
//解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
// 说明： 
//
// 1 <= n <= 10 ^ 4 
// - 10 ^ 5 <= nums[i] <= 10 ^ 5 
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)


object Solution {
  def checkPossibility(nums: Array[Int]): Boolean = {
    if (nums.length <= 2) return true
    import util.control.Breaks._
    var num = 0 
    breakable {
      for (i <- 1 until nums.length) {
        if (nums(i) < nums(i-1)) {
          if(i == 1) {
            nums(i-1) = nums(i)
          } else if ( i == nums.size - 1 ) {
            nums(i) = nums(i - 1)
          } else {
            if(nums(i) < nums(i-2)) {
              nums(i) = nums(i-1)
            } else {
              nums(i-1) = nums(i)
            }
          }
          break
        }

      }

    }
    for (i <- 1 to nums.length - 1) {
      if (nums(i) < nums(i - 1)) return false
    }
    return true
  }
}

//leetcode submit region end(Prohibit modification and deletion)
