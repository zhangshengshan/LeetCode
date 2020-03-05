//给定一个仅包含大小写字母和空格 ' ' 的字符串 s
// ，返回其最后一个单词的长度。
//
// 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
//
// 如果不存在最后一个单词，请返回 0 。
//
// 说明：一个单词是指仅由字母组成、不包含任何空格的 最大子字符串。
//
//
//
// 示例:
//
// 输入: "Hello World"
//输出: 5
//
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
object AAASolution {
  def lengthOfLastWord1(s: String): Int = {
    var i = 0
    var size = 0
    var lastSize = 0
    while (i < s.size) {
      if (s(i) == ' ') {
        if(size!=0) lastSize = size
        size = 0
      }else {
        size = size + 1
      }
      i = i + 1
    }
    return if(size == 0) lastSize else size
  }
  def lengthOfLastWord(s: String): Int = {
    var i = s.size - 1
    var size = 0
    while (i>=0){
      if(s(i)!= ' '){
        size = size + 1
      }
      if(s(i)==' '){
        if(size != 0) i = -1
      }
      i = i - 1
    }
    return size
  }

  def main(args: Array[String]): Unit = {
    println(lengthOfLastWord("a "))
  }
}

//leetcode submit region end(Prohibit modification and deletion)
