//给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。 
//
// 请你找到并返回这个整数 
//
// 
//
// 示例： 
//
// 
//输入：arr = [1,2,2,6,6,6,6,7,10]
//输出：6
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^4 
// 0 <= arr[i] <= 10^5
// 
// Related Topics 数组


object Solution {
  def findSpecialInteger(arr: Array[Int]): Int = {
    val len = arr.length
    if(len==1) return arr(0)
    var num = 0
    var pre = -1
    for (item <- arr) {
      if (item != pre) {
        num = 1
      } else {
        num += 1
        if (num >= len / 4 + 1) return item
      }
      pre = item
    }
    return -1
  }
}
