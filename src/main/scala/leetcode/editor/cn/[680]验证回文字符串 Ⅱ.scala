//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 示例 1: 
// 
//输入: "aba"
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: "abca"
//输出: True
//解释: 你可以删除c字符。
// 
//
// 注意: 
//
// 
// 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。 
// 
// Related Topics 字符串






































































































//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
    def dfs(s:String):Boolean = {
      println(s)
      var start = 0 
      var end = s.length - 1
      while(start < end){
        if(s(start) != s(end)) return false
        start += 1
        end -= 1
      }
      return true
    }
    def validPalindrome(s: String): Boolean = {
      if(s.length <= 2) return true
      var start = 0 
      var end = s.length - 1
      while(start<end){
        if(s(start)==s(end)){
          start += 1
          end -= 1
        }else{
          return dfs(s.slice(start + 1, end + 1)) || dfs(s.slice(start, end))
        }
      }
      return true
    }
}
//leetcode submit region end(Prohibit modification and deletion)
