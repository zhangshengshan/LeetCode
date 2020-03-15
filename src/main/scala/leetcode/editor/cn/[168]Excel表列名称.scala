//给定一个正整数，返回它在 Excel 表中相对应的列名称。 
//
// 例如， 
//
//     1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB 
//    ...
// 
//
// 示例 1: 
//
// 输入: 1
//输出: "A"
// 
//
// 示例 2: 
//
// 输入: 28
//输出: "AB"
// 
//
// 示例 3: 
//
// 输入: 701
//输出: "ZY"
// 
// Related Topics 数学


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def convertToTitle(n: Int): String = {
    val a = Map[Int, String](0->"Z" ,1 -> "A", 2 -> "B", 3 -> "C", 4 -> "D", 5 -> "E", 6 -> "F", 7 -> "G", 8 -> "H", 9 -> "I", 10 -> "J", 11 -> "K", 12 -> "L", 13 -> "M", 14 -> "N", 15 -> "O", 16 -> "P", 17 -> "Q", 18 -> "R", 19 -> "S", 20 -> "T", 21 -> "U", 22 -> "V", 23 -> "W", 24 -> "X", 25 -> "Y", 26 -> "Z")
    var s = ""
    var x = n
    while (x != 0) {
      var key = x % 26
      if(key==0) {
        key = 26
        x = x - 1
      }

      s = s + a(key)
      x = x / 26
    }
    return s.reverse
  }
}

//leetcode submit region end(Prohibit modification and deletion)
