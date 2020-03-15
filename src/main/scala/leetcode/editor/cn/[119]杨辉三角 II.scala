//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。 
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
// 示例: 
// 输入: 3
//输出: [1,3,3,1]
// 进阶： 
// 你可以优化你的算法到 O(k) 空间复杂度吗？ 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def getRow(rowIndex: Int): List[Int] = {
    val arr = Array.ofDim[Int](rowIndex + 1)
    for (i <- 0 to rowIndex) {
      for (j <- (0 to i).reverse) {
        if (i == j) arr(j) = 1
        else if (j == 0) arr(j) = 1
        else arr(j) = arr(j) + arr(j - 1)
      }
    }
    return arr.toList
  }
}

//leetcode submit region end(Prohibit modification and deletion)
