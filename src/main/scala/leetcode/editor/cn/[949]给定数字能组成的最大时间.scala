//给定一个由 4 位数字组成的数组，返回可以设置的符合 24 小时制的最大时间。 
//
// 最小的 24 小时制时间是 00:00，而最大的是 23:59。从 00:00 （午夜）开始算起，过得越久，时间越大。 
//
// 以长度为 5 的字符串返回答案。如果不能确定有效时间，则返回空字符串。 
//
// 
//
// 示例 1： 
//
// 输入：[1,2,3,4]
//输出："23:41"
// 
//
// 示例 2： 
//
// 输入：[5,5,5,5]
//输出：""
// 
//
// 
//
// 提示： 
//
// 
// A.length == 4 
// 0 <= A[i] <= 9 
// 
// Related Topics 数学


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def largestTimeFromDigits(A: Array[Int]): String = {

  }

  //  val list: List[Array[Int]] = A.permutations.toList
  //  val filter = list.filter(x => x(0) * 10 + x(1) <= 23 && x(2) * 10 + x(3) <= 59)
  //  if (filter.isEmpty) return ""
  //  val ints: Array[Int] = filter.maxBy(x => {
  //    (x(0) * 10 + x(1)) * 60 + x(2) * 10 + x(3)
  //  })
  //  ints(0).toString + ints(1).toString + ":" + ints(2).toString + ints(3).toString
}

//leetcode submit region end(Prohibit modification and deletion)
