//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    0 to nums.length -1 foreach { i =>
      if (nums.contains(target - nums(i))) return Array(i, nums.indexOf(target-nums(i)))
    }
    null
  }

  def main(args: Array[String]): Unit = {
    val ints: Array[Int] = twoSum(Array(1, 2, 3), 9)
    ints.foreach(println)
  }
}
//leetcode submit region end(Prohibit modification and deletion)
