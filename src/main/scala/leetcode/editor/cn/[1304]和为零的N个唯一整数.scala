//给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。 
// 示例 1： 
// 输入：n = 5
//输出：[-7,-1,1,3,4]
//解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
// 示例 2： 
// 输入：n = 3
//输出：[-1,0,1]
// 示例 3： 
// 输入：n = 1
//输出：[0]
// 提示： 
// 1 <= n <= 1000 
// 
// Related Topics 数组






































































































object Solution {
    def sumZero(n: Int): Array[Int] = {
      import scala.collection.mutable.ArrayBuffer 
      val myBuffer = new ArrayBuffer[Int]()
      if ( n % 2 == 1 ) myBuffer.append(0)
      for(i <-  1 to n / 2 ){
        myBuffer.append(i)
        myBuffer.append(-1 * i)
      }
      myBuffer.toArray
    }
}
