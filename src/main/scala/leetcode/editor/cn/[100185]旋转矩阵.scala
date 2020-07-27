//给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。 
//
// 不占用额外内存空间能否做到？ 
//
// 
//
// 示例 1: 
//
// 给定 matrix = 
//[
//  [1,2,3],
//  [4,5,6],
//  [7,8,9]
//],
//
//原地旋转输入矩阵，使其变为:
//[
//  [7,4,1],
//  [8,5,2],
//  [9,6,3]
//]
// 
//
// 示例 2: 
//
// 给定 matrix =
//[
//  [ 5, 1, 9,11],
//  [ 2, 4, 8,10],
//  [13, 3, 6, 7],
//  [15,14,12,16]
//], 
//
//原地旋转输入矩阵，使其变为:
//[
//  [15,13, 2, 5],
//  [14, 3, 4, 1],
//  [12, 6, 8, 9],
//  [16, 7,10,11]
//]
// 
// Related Topics 数组 
// 👍 106 👎 0

//[tR,tC]  ---- [tR, tC+i] ---- [tR,dC]
//|                              |
//|                              |
//[dR-i,tC]                    [tR+i,dC]
//|                              |
//|                              |
//[dR,tC]  ---- [dR, dC-i] ---- [dR,dC]

//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  val a = Array( Array(1,2,3,4),Array(5,6,7,8),Array(9,10,11,12),Array(13,14,15,16) )
  def rotate(matrix: Array[Array[Int]]): Unit = {
    val n = matrix.length

    var tR = 0
    var tC = 0
    var dR = n - 1
    var dC = n - 1

    while(tR < dR) {

      println(tR, dR)

      val times = dR - tR 

      for(i<-0 until times) {

        val tmp = matrix(tR)(tC+i) 

        matrix(tR)(tC+i) = matrix(dR-i)(tC)
        matrix(dR-i)(tC) = matrix(dR)(dC-i)
        matrix(dR)(dC-i) = matrix(tR+i)(dC) 
        matrix(tR+i)(dC) = tmp 

        println(s"(${tR} ,${tC+i}) -> (${dR-i} ,${tC}) -> (${dR} ,${dC-i}) -> (${tR+i} ,${dC})")
      }

      tR += 1 
      tC += 1 
      dR -= 1
      dC -= 1
    }
  }
}

//leetcode submit region end(Prohibit modification and deletion)
