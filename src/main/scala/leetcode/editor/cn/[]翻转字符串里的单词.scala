//给定一个字符串，逐个翻转字符串中的每个单词。 
//
// 
//
// 示例 1： 
//
// 输入: "the sky is blue"
//输出: "blue is sky the"
// ̑
//
// 示例 2： 
//
// 输入: "  hello world!  "
//输出: "world! hello"
//解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
// 
//
// 示例 3： 
//
// 输入: "a good   example"
//输出: "example good a"
//解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
// 
//
// 
//
// 说明： 
//
// 
// 无空格字符构成一个单词。 
// 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。 
// 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。 
// 
//
// 
//
// 进阶： 
//
// 请选用 C 语言的用户尝试使用 O(1) 额外空间复杂度的原地解法。 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def reverseWords(s: String): String = {
    import scala.collection.mutable.ArrayBuffer
    val myArrayBuffer = new ArrayBuffer[Char]()
    var i = s.length - 1
    var isFirst = true
    while (i >= 0) {
      if (s(i) == ' ') {
        i -= 1
      } else {
        var j = i
        while (j - 1 >= 0 && s(j - 1) != ' ') {
          j -= 1
        }
        if (isFirst == true) {
          isFirst = false
        } else {
          myArrayBuffer.append(' ')
        }
        for (idx <- j to i) {
          myArrayBuffer.append(s(idx))
        }
        println(i, j)
        i = j
        i -= 1
      }
    }
    myArrayBuffer.mkString
  }
}

//leetcode submit region end(Prohibit modification and deletion)
