//给定一个字符串 S 和一个字符 C。
//返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。 
// 示例 1: 
//输入: S = "loveleetcode", C = 'e'
//输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
// 说明: 
// 字符串 S 的长度范围为 [1, 10000]。 
// C 是一个单字符，且保证是字符串 S 里的字符。 
// S 和 C 中的所有字母均为小写字母。 


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def shortestToChar(S: String, C: Char): Array[Int] = {
    val idxList = S.zipWithIndex.filter(_._1 == C).map(_._2).toList
    S.zipWithIndex.map(x => idxList.map(xx => math.abs(xx - x._2)).min).toArray
  }
}

//leetcode submit region end(Prohibit modification and deletion)
