//给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符： 
//
// 
// 'A' : Absent，缺勤 
// 'L' : Late，迟到 
// 'P' : Present，到场 
// 
//
// 如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。 
//
// 你需要根据这个学生的出勤记录判断他是否会被奖赏。 
//
// 示例 1: 
//
// 输入: "PPALLP"
//输出: True
// 
//
// 示例 2: 
//
// 输入: "PPALLL"
//输出: False
// 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
    def checkRecord(s: String): Boolean = {
      var A_num = 0 
      var L_num = 0 
      import util.control.Breaks._
      for (item <- s) {
        if ( item != 'L' ){
          if (item == 'A') {
            A_num += 1
            if(A_num >= 2) return false
          }
          L_num = 0 
        }else{
          L_num += 1
          if(L_num>= 3) return false
        }
      }
      return true
    }
}
//leetcode submit region end(Prohibit modification and deletion)
