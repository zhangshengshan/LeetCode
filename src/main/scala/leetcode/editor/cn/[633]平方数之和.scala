//给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。 
//
// 示例1: 
//
// 
//输入: 5
//输出: True
//解释: 1 * 1 + 2 * 2 = 5
// 
//
// 
//
// 示例2: 
//
// 
//输入: 3
//输出: False
// 
// Related Topics 数学


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
    def judgeSquareSum(c: Int): Boolean = {
      var left = 0
      var right = math.sqrt(c).toInt
      while(left <= right){
        println(left, right)
        val tmp = left * left + right * right
        if(tmp == c  ) return true
        else if(tmp < c) left += 1
        else right -= 1
      }
      return false
    }
}
//leetcode submit region end(Prohibit modification and deletion)
