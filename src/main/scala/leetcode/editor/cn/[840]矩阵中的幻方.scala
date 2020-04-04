
//3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。
//
// 给定一个由整数组成的 grid，其中有多少个 3 × 3 的 “幻方” 子矩阵？（每个子矩阵都是连续的）。 
//
// 
//
// 示例： 
//
// 输入: [[4,3,8,4],
//      [9,5,1,9],
//      [2,7,6,2]]
//输出: 1
//解释: 
//下面的子矩阵是一个 3 x 3 的幻方：
//438
//951
//276
//
//而这一个不是：
//384
//519
//762
//
//总的来说，在本示例所给定的矩阵中只有一个 3 x 3 的幻方子矩阵。
// 
//
// 提示: 
//
// 
// 1 <= grid.length <= 10 
// 1 <= grid[0].length <= 10 
// 0 <= grid[i][j] <= 15 
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def isHuanFang(arr: Array[Array[Int]]): Boolean = {
    val flatten = arr.flatten 
    if (flatten.min != 1 || flatten.max != 9 || flatten.length != 9) return false
    val sum: Int = arr(0).sum
    (0 to 2).forall(i => (arr(i).sum == sum) && arr(0)(i) + arr(1)(i) + arr(2)(i) == sum) &&
      arr(0)(0) + arr(1)(1) + arr(2)(2) == sum &&
      arr(0)(2) + arr(1)(1) + arr(2)(0) == sum
  }

  def numMagicSquaresInside(grid: Array[Array[Int]]): Int = {
    val subArrays: scala.collection.immutable.Seq[Array[Array[Int]]] = for (i <- 0 to grid.length - 3; j <- 0 to grid(0).length - 3) yield grid.slice(i, i + 3).map(x => x.slice(j, j + 3))
    subArrays.count(isHuanFang)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
