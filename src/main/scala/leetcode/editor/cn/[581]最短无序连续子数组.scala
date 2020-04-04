//给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。 
//
// 你找到的子数组应是最短的，请输出它的长度。 
//
// 示例 1: 
//
// 
//输入: [2, 6, 4, 8, 10, 9, 15]
//输出: 5
//解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
// 
//
// 说明 : 
//
// 
// 输入的数组长度范围在 [1, 10,000]。 
// 输入的数组可能包含重复元素 ，所以升序的意思是<=。 
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def findUnsortedSubarray(nums: Array[Int]): Int = {

    var start = 0
    var end = nums.length - 1
    import util.control.Breaks._
    breakable {
      while (start < end) {
        val start_change = nums.slice(start, end + 1).forall(x => x >= nums(start))
        val end_change = nums.slice(start, end + 1).forall(x => x <= nums(end))
        if (start_change) start += 1
        if (end_change) end -= 1
        if (!start_change && !end_change) break
      }
    }

    if (end == start) return 0 else end - start + 1
  }
}

//leetcode submit region end(Prohibit modification and deletion)
