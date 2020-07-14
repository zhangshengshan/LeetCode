//如果数组是单调递增或单调递减的，那么它是单调的。 
//
// 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是
//单调递减的。 
//
// 当给定的数组 A 是单调数组时返回 true，否则返回 false。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：[1,2,2,3]
//输出：true
// 
//
// 示例 2： 
//
// 输入：[6,5,4,4]
//输出：true
// 
//
// 示例 3： 
//
// 输入：[1,3,2]
//输出：false
// 
//
// 示例 4： 
//
// 输入：[1,2,4,5]
//输出：true
// 
//
// 示例 5： 
//
// 输入：[1,1,1]
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 50000 
// -100000 <= A[i] <= 100000 
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def isMonotonic(A: Array[Int]): Boolean = {
    if (A.length <= 2) return true
    val list: List[Array[Int]] = A.sliding(2, 1).toList
    list.forall(x => x(0) <= x(1)) || list.forall(x => x(1) <= x(0))
    //    if (A.length == 2) return true
    //    var i = 1
    //    while (i < A.length && A(i) == A(i - 1)) {
    //      i += 1
    //    }
    //    if (i == A.length) return true
    //    val flag = A(i) - A(i - 1)
    //    while (i < A.length) {
    //      if (flag > 0 && A(i) < A(i - 1)) return false
    //      if (flag < 0 && A(i) > A(i - 1)) return false
    //      i += 1
    //    }
    //    return true
  }
}

//leetcode submit region end(Prohibit modification and deletion)
//if (A.size <= 2) return true
//if (A.forall(_ == A.head)) return true
//val flag = A.last - A.head
//for (i <- 1 until A.length) {
//if (flag > 0) {
//if (A(i) < A(i - 1)) return false
//} else {
//if (A(i) > A(i - 1)) return false
//}
//}
//return true
