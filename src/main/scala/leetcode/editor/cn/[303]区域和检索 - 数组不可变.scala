//给定一个整数数组 nums，求出数组从索引 i 到 j (i ≤ j) 范围内元素的总和，包含 i, j 两点。 
//
// 示例： 
//
// 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
//
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3 
//
// 说明: 
//
// 
// 你可以假设数组不可变。 
// 会多次调用 sumRange 方法。 
// 
// Related Topics 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
class NumArray(_nums: Array[Int]) {
  val sum = new Array[Int](_nums.size)
  for (i <- 0 until _nums.size; j <- 0 to i) {
    sum(i) += _nums(j)
  }

  def sumRange(i: Int, j: Int): Int = {

//    sumRange[i,j] = sum(j) - sum(i) + _nums(i)
    sum(j) - sum(i) + _nums(i)
  }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = new NumArray(nums)
 * var param_1 = obj.sumRange(i,j)
 */
//leetcode submit region end(Prohibit modification and deletion)
