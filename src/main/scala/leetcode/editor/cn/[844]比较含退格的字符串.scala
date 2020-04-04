//给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。 
// 示例 1： 
// 输入：S = "ab#c", T = "ad#c"
//输出：true
//解释：S 和 T 都会变成 “ac”。
// 示例 2： 
// 输入：S = "ab##", T = "c#d#"
//输出：true
//解释：S 和 T 都会变成 “”。
// 示例 3： 
// 输入：S = "a##c", T = "#a#c"
//输出：true
//解释：S 和 T 都会变成 “c”。
// 示例 4： 
// 输入：S = "a#c", T = "b"
//输出：false
//解释：S 会变成 “c”，但 T 仍然是 “b”。 
// 提示： 
// 1 <= S.length <= 200 
// 1 <= T.length <= 200 
// S 和 T 只含有小写字母以及字符 '#'。 
// Related Topics 栈 双指针


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def backspaceCompare(S: String, T: String): Boolean = {
    var i = S.length - 1
    var j = T.length - 1
    var numS = 0
    var numT = 0
    while (i >= 0 && j >= 0) {
      import util.control.Breaks._

      breakable {
        while (i >= 0) {
          if (S(i) == '#') {
            numS += 1
          } else if (numS > 0) {
            i -= 1
            numS -= 1
          }
          i -= 1
        }
      }
      breakable {
        while (j >= 0) {
          if (T(j) == '#') {
            numT += 1
          } else if (numT > 0) {
            numT -= 1
            j -= 1
          }
          j -= 1
        }
      }
      if (i >= 0 && j >= 0) if (S(i) != T(j)) return false
      if ((i >= 0) != (j >= 0)) {
        return false
      }
      i -= 1
      j -= 1
    }
    return true
  }
}

//leetcode submit region end(Prohibit modification and deletion)
