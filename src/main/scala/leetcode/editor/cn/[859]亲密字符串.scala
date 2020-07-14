//给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
// 示例 1： 
// 输入： A = "ab", B = "ba"
//输出： true
// 示例 2： 
// 输入： A = "ab", B = "ab"
//输出： false
// 示例 3: 
// 输入： A = "aa", B = "aa"
//输出： true
// 示例 4： 
// 输入： A = "aaaaaaabc", B = "aaaaaaacb"
//输出： true
// 示例 5： 
// 输入： A = "", B = "aa"
//输出： false
// 提示： 
// 0 <= A.length <= 20000 
// 0 <= B.length <= 20000 
// A 和 B 仅由小写字母构成。 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def buddyStrings(A: String, B: String): Boolean = {
    if (A.length != B.length) return false
    val mymap = scala.collection.mutable.Map[Int, (Char, Char)]()
    
    for (i <- 0 to A.length - 1) {
        mymap(i) = (A(i), B(i))
    }

    if(my)


    if (mymap.size != 2) return false
    val list: List[(Char, Char)] = mymap.values.toList
    val first = list(0)
    val second = list(1)
    if (first._1 == second._2 && first._2 == second._1) return true else return false
  }
}

//leetcode submit region end(Prohibit modification and deletion)
