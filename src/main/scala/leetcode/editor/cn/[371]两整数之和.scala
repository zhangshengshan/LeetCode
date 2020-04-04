//不使用运算符 + 和 - ，计算两整数 a 、b 之和。
//
// 示例 1:
//
// 输入: a = 1, b = 2
//输出: 3
//
//
// 示例 2:
//
// 输入: a = -2, b = 3
//输出: 1
// Related Topics 位运算


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def getSum(a: Int, b: Int): Int = {
    if (b == 0) return a
    else getSum(a ^ b, (a & b) << 1)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
