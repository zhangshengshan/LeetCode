//在 N * N 的网格上，我们放置一些 1 * 1 * 1 的立方体。 
//
// 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。 
//
// 请你返回最终形体的表面积。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：[[2]]
//输出：10
// 
//
// 示例 2： 
//
// 输入：[[1,2],[3,4]]
//输出：34
// 
//
// 示例 3： 
//
// 输入：[[1,0],[0,2]]
//输出：16
// 
//
// 示例 4： 
//
// 输入：[[1,1,1],[1,0,1],[1,1,1]]
//输出：32
// 
//
// 示例 5： 
//
// 输入：[[2,2,2],[2,1,2],[2,2,2]]
//输出：46
// 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 50 
// 0 <= grid[i][j] <= 50 
// 
// Related Topics 几何 数学


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def surfaceArea(grid: Array[Array[Int]]): Int = {
    var sum = 0
    for (i <- grid.indices) {
      for (j <- grid(0).indices) {
        if (grid(i)(j) > 0) {
          sum += 2 + 4 * grid(i)(j)
          if (i >= 1) sum -= math.min(grid(i - 1)(j), grid(i)(j)) * 2
          if (j >= 1) sum -= math.min(grid(i)(j - 1), grid(i)(j)) * 2
        }
      }
    }
    return sum
  }
}

//leetcode submit region end(Prohibit modification and deletion)
