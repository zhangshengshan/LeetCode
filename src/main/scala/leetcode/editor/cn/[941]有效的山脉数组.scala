//给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。 
// 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组： 
// 
// A.length >= 3 
// 在 0 < i < A.length - 1 条件下，存在 i 使得：
// A[0] < A[1] < ... A[i-1] < A[i] 
// A[i] > A[i+1] > ... > A[A.length - 1] 
//
// 示例 1： 
//
// 输入：[2,1]
//输出：false
// 
//
// 示例 2： 
//
// 输入：[3,5,5]
//输出：false
// 
//
// 示例 3： 
//
// 输入：[0,3,2,1]
//输出：true 
//
// 
//
// 提示： 
//
// 
// 0 <= A.length <= 10000 
// 0 <= A[i] <= 10000 
// 
//
// 
//
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)


object Solution {
  def validMountainArray(A: Array[Int]): Boolean = {

    if (A.length <= 2) return false

    var left = 0
    var right = A.length - 1

    while (left < A.length - 1 && A(left + 1) > A(left)) {
      left += 1
    }
    while (right >= 1 && A(right) < A(right - 1)) {
      right -= 1
    }
    right == left && left != 0 && left != A.length - 1
  }
}

//leetcode submit region end(Prohibit modification and deletion)
