//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。 
//
// 请注意，你可以假定字符串里不包括任何不可打印的字符。 
//
// 示例: 
//
// 输入: "Hello, my name is John"
//输出: 5
// 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def countSegments(s: String): Int = {

    var num = 0
    var i = 0
    while (i < s.length) {
      if (s(i) != ' ') {
        num += 1
        do {
          i += 1
        } while (i < s.length && s(i) != ' ')
      }
      i += 1
    }
    return num
  }
}

//leetcode submit region end(Prohibit modification and deletion)
