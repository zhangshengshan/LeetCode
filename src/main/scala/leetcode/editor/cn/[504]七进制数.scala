//给定一个整数，将其转化为7进制，并以字符串形式输出。 
//
// 示例 1: 
//
// 
//输入: 100
//输出: "202"
// 
//
// 示例 2: 
//
// 
//输入: -7
//输出: "-10"
// 
//
// 注意: 输入范围是 [-1e7, 1e7] 。 
//


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def convertToBase7(num: Int): String = {
//    if (num == 0) return "0"
    var list = List[Int]()
    val flag = if (num < 0) false else true

    var n = math.abs(num)
    do {
      list = n % 7 :: list
      n /= 7
    } while (n != 0)
    if (!flag) "-" + list.map(_.toString).mkString
    else list.map(_.toString).mkString
  }
}

//leetcode submit region end(Prohibit modification and deletion)
