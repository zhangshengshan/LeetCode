//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 示例 1: 
//
// 
//输入: "Let's take LeetCode contest"
//输出: "s'teL ekat edoCteeL tsetnoc" 
// 
//
// 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def reverseWords(s: String): String = {
    //println("size =>", s.size)
    val arr = s.toArray
    var start = 0
    while (start < arr.size) {

      if (arr(start) != ' ') {
          var end = start

          while (end < arr.size && arr(end) != ' ') {
            end += 1
          }

          var left = start
          var right = end - 1
          println("left is ", left, " right is ", right)

          while (left < right) {
            val tmp = arr(left)
            arr(left) = arr(right)
            arr(right) = tmp
            left += 1
            right -= 1
          }
          start = end + 1
        }else{
          start += 1
        }
    }
    arr.mkString
  }
}

//leetcode submit region end(Prohibit modification and deletion)
