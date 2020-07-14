//对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。 
// 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
//
//
// 示例 1： 
//
// 输入：A = [1,2,0,0], K = 34
//输出：[1,2,3,4]
//解释：1200 + 34 = 1234
// 
//
// 示例 2： 
//
// 输入：A = [2,7,4], K = 181
//输出：[4,5,5]
//解释：274 + 181 = 455
// 
//
// 示例 3： 
//
// 输入：A = [2,1,5], K = 806
//输出：[1,0,2,1]
//解释：215 + 806 = 1021
// 
//
// 示例 4： 
//
// 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
//输出：[1,0,0,0,0,0,0,0,0,0,0]
//解释：9999999999 + 1 = 10000000000
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 10000 
// 0 <= A[i] <= 9 
// 0 <= K <= 10000 
// 如果 A.length > 1，那么 A[0] != 0 
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)


object Solution {
  def IntToArray(K: Int): Array[Int] = {
    import scala.collection.mutable.ArrayBuffer
    val myArrayBuffer = new ArrayBuffer[Int]()
    var k = K
    while (k > 0) {
      myArrayBuffer += k % 10
      k = k / 10
    }
    myArrayBuffer.toArray.reverse
  }

  def addToArrayForm(A: Array[Int], K: Int): List[Int] = {
    import scala.collection.mutable.ArrayBuffer
    val myArrayBuffer = new ArrayBuffer[Int]()
    val kArray = IntToArray(K)
    var carry = 0
    for (i <- 0 to math.max(A.length - 1, kArray.length - 1)) {
      var sum = 0

      val aIdx = A.length - 1 - i
      val kIdx = kArray.length - 1 - i

      if (aIdx >= 0) sum += A(aIdx)
      if (kIdx >= 0) sum += kArray(kIdx)
      sum += carry

      myArrayBuffer += sum % 10
      carry = sum / 10

    }
    if (carry == 1) myArrayBuffer += 1
    myArrayBuffer.reverse.toList
  }
}

//leetcode submit region end(Prohibit modification and deletion)
