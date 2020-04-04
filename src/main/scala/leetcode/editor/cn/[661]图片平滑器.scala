//包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值
//求平均，如果周围的单元格不足八个，则尽可能多的利用它们。 
//
// 示例 1: 
//
// 
//输入:
//[[1,1,1],
// [1,0,1],
// [1,1,1]]
//输出:
//[[0, 0, 0],
// [0, 0, 0],
// [0, 0, 0]]
//解释:
//对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
//对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
//对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
// 
//
// 注意: 
//
// 
// 给定矩阵中的整数范围为 [0, 255]。 
// 矩阵的长和宽的范围均为 [1, 150]。 
// 
// Related Topics 数组

//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def imageSmoother(M: Array[Array[Int]]): Array[Array[Int]] = {
    if (M.length == 0) return Array[Array[Int]]()
    val rows: Int = M.length
    val cols: Int = M(0).length

    val ret: Array[Array[Int]] = Array.ofDim[Int](rows, cols)
    for (i <- 0 until rows) {
      for (j <- 0 until cols) {
        val min_i: Int = math.max(i - 1, 0)
        val max_i: Int = math.min(i + 1, rows - 1)
        val min_j: Int = math.max(j - 1, 0)
        val max_j: Int = math.min(j + 1, cols - 1)
//        println("min_i:" + min_i + " max_i:" + max_i + " min_j:" + min_j + " max_j:" + max_j)
        var sum = 0
        for (ii <- min_i to max_i) {
          for (jj <- min_j to max_j) {
            sum += M(ii)(jj)
          }
        }
//        println("sum[" + i + ":" + j + "] = " + sum)
//        println(sum / ((max_j - min_j + 1) * (max_i - min_i + 1)).toInt)
        ret(i)(j) = (sum / ((max_j - min_j + 1) * (max_i - min_i + 1))).toInt
      }
//      println("\r")
    }
    return ret
  }
}

//leetcode submit region end(Prohibit modification and deletion)
