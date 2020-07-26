//编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。 
//
// 
//
// 示例 1： 
//
// 输入：
//[
//  [1,1,1],
//  [1,0,1],
//  [1,1,1]
//]
//输出：
//[
//  [1,0,1],
//  [0,0,0],
//  [1,0,1]
//]
// 
//
// 示例 2： 
//
// 输入：
//[
//  [0,1,2,0],
//  [3,4,5,2],
//  [1,3,1,5]
//]
//输出：
//[
//  [0,0,0,0],
//  [0,4,5,0],
//  [0,3,1,0]
//]
// 
// Related Topics 数组 
// 👍 11 👎 0


object Solution {
  def setZeroes(matrix: Array[Array[Int]]): Unit = {
    val rows = matrix.length
    val cols = matrix(0).length

    import scala.collection.mutable.ListBuffer
    val cache = new ListBuffer[(Int, Int)]()

    for (i <- 0 until rows; j <- 0 until cols) {
      if (matrix(i)(j) == 0) {
        cache.append((i, j))
      }
    }

    val distinctX: ListBuffer[Int] = cache.map(_._1).distinct
    val distincty: ListBuffer[Int] = cache.map(_._2).distinct

    for (elem <- distinctX) {
      for (i <- 0 until cols) {
        matrix(elem)(i) = 0
      }
    }
    for (elem <- distincty) {
      for (i <- 0 until rows) {
        matrix(i)(elem) = 0
      }
    }
  }
}
