
//在给定的网格中，每个单元格可以有以下三个值之一：
//
// 
// 值 0 代表空单元格； 
// 值 1 代表新鲜橘子； 
// 值 2 代表腐烂的橘子。 
// 
//
// 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。 
//
// 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：[[2,1,1],[1,1,0],[0,1,1]]
//输出：4
// 
//
// 示例 2： 
//
// 输入：[[2,1,1],[0,1,1],[1,0,1]]
//输出：-1
//解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。
// 
//
// 示例 3： 
//
// 输入：[[0,2]]
//输出：0
//解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= grid.length <= 10 
// 1 <= grid[0].length <= 10 
// grid[i][j] 仅为 0、1 或 2 
// 
// Related Topics 广度优先搜索


object Solution {
  def orangesRotting(grid: Array[Array[Int]]): Int = {

    val xDir = List(-1, 0, 1, 0)
    val yDir = List(0, -1, 0, 1)

    import scala.collection.mutable.Queue
    var num = 0
    val myqueue = new Queue[((Int, Int), Int)]()

    val rows = grid.length
    val cols = grid(0).length
    val seeds = for (i <- 0 to rows - 1; j <- 0 to cols - 1 if grid(i)(j) == 2) yield (i, j)
    for (elem <- seeds) {
      myqueue.enqueue((elem, 0))
    }
    while (myqueue.nonEmpty) {
      val tuple: ((Int, Int), Int) = myqueue.dequeue()
      val x = tuple._1._1
      val y = tuple._1._2
      val layer = tuple._2
      num = layer
      for (i <- 0 to 3) {
        val nx = x + xDir(i)
        val ny = y + yDir(i)
        if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && grid(nx)(ny) == 1) {
          grid(nx)(ny) = 2
          myqueue.enqueue(((nx, ny), layer + 1))
          num = layer + 1
        }
      }
    }
    if (grid.forall(_.forall(_ != 1))) return num
    else -1
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(Array(2, 1, 0), Array(1, 1, 0), Array(0, 1, 1))
    orangesRotting(arr)
  }
}


