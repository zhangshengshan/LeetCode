//给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于
// 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。 
//
// 示例: 
//
// 
//输入: s = "abcdefg", k = 2
//输出: "bacdfeg"
// 
//
// 要求: 
//
// 
// 该字符串只包含小写的英文字母。 
// 给定字符串的长度和 k 在[1, 10000]范围内。 
// 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def reverseStr(s: String, k: Int): String = {

    var left = 0
    val sArray: Array[Char] = s.toArray

    var flag = true

    while (left <= s.length - 1) {
      var start = left
      var end = if (left + k - 1 < s.length) left + k - 1 else s.length - 1
      if (flag) {
        while (start < end) {
          val tmp = sArray(start)
          sArray(start) = sArray(end)
          sArray(end) = tmp
          start += 1
          end -= 1
        }
      }
      flag = !flag
      left += k
    }
    sArray.mkString
  }
}

//leetcode submit region end(Prohibit modification and deletion)
