//给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 
//
// 请你统计并返回 grid 中 负数 的数目。 
//
// 
//
// 示例 1： 
//
// 输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//输出：8
//解释：矩阵中共有 8 个负数。
// 
//
// 示例 2： 
//
// 输入：grid = [[3,2],[1,0]]
//输出：0
// 
//
// 示例 3： 
//
// 输入：grid = [[1,-1],[-1,-1]]
//输出：3
// 
//
// 示例 4： 
//
// 输入：grid = [[-1]]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 100 
// -100 <= grid[i][j] <= 100 
// 
// Related Topics 数组 二分查找


object Solution {
  val a = Array(Array(4, 3, 2, -1), Array(3, 2, 1, -1), Array(1, 1, -1, -2), Array(-1, -1, -2, -3))

  /**
   * method 1
   */
  def findFirstNegtive(array: Array[Int]): Int = {

    var left = 0
    var right = array.size - 1

    while (left < right) {

      val mid = (left + right) >> 1
      if (array(mid) < 0) {
        right = mid
      } else {
        left = mid + 1
      }
    }
    if (array(left) >= 0) return 0 else array.length - left
  }

  def countNegatives(grid: Array[Array[Int]]): Int = {
    val nRows = grid.length
    val nCols = grid(0).length
    var i = nRows - 1
    var j = 0
    var sum = 0
    while (i >= 0 && j < nCols) {
      if (grid(i)(j) >= 0) {
        j += 1
      } else {
        sum += nCols - j
        i -= 1
      }
    }
    return sum
  }
}
