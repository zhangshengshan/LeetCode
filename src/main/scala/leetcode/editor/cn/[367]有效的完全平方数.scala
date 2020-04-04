//给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。 
//
// 说明：不要使用任何内置的库函数，如 sqrt。 
//
// 示例 1： 
//
// 输入：16
//输出：True 
//
// 示例 2： 
//
// 输入：14
//输出：False
// 
// Related Topics 数学 二分查找


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def isPerfectSquare(num: Int): Boolean = {
    if (num < 2) return true
    var start = 2
    var end: Int = num / 2
    while (start <= end) {
      val i: Int = start + (end - start) / 2
//      print(start,end,i)
      if (num % i == 0 && i == num / i) return true
      else if (i  > num / i)  {
//        println(">")
        end = i - 1
      } else {
//        println("<")
        start = i + 1
      }
    }
    false
  }
}

//leetcode submit region end(Prohibit modification and deletion)
