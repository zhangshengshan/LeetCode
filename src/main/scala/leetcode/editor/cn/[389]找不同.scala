//给定两个字符串 s 和 t，它们只包含小写字母。 
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。 
//
// 请找出在 t 中被添加的字母。 
//
// 
//
// 示例: 
//
// 输入：
//s = "abcd"
//t = "abcde"
//
//输出：
//e
//
//解释：
//'e' 是那个被添加的字母。
// 
// Related Topics 位运算 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
    def findTheDifference(s: String, t: String): Char = {
      var sum:Int = 0
      for (item <- s) {
        sum ^= item
      }
      for (item <- t) {
        sum ^= item
      }
      return sum.toChar
    }
}
//leetcode submit region end(Prohibit modification and deletion)
