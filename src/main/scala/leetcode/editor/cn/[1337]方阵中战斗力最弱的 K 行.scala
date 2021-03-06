//给你一个大小为 m * n 的方阵 mat，方阵由若干军人和平民组成，分别用 1 和 0 表示。 
// 请你返回方阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。 
// 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。 
// 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。 
<<<<<<< HEAD
// 示例 1： 
=======
//
// 示例 1： 
//
>>>>>>> 2392a866852869394739dc4fd756a8e270293df8
// 输入：mat = 
//[[1,1,0,0,0],
// [1,1,1,1,0],
// [1,0,0,0,0],
// [1,1,0,0,0],
// [1,1,1,1,1]], 
//k = 3
//输出：[2,0,3]
//解释：
//每行中的军人数目：
//行 0 -> 2 
//行 1 -> 4 
//行 2 -> 1 
//行 3 -> 2 
//行 4 -> 5 
//从最弱到最强对这些行排序后得到 [2,0,3,1,4]
// 
<<<<<<< HEAD
// 示例 2： 
=======
//
// 示例 2： 
//
>>>>>>> 2392a866852869394739dc4fd756a8e270293df8
// 输入：mat = 
//[[1,0,0,0],
// [1,1,1,1],
// [1,0,0,0],
// [1,0,0,0]], 
//k = 2
//输出：[0,2]
//解释： 
//每行中的军人数目：
//行 0 -> 1 
//行 1 -> 4 
//行 2 -> 1 
//行 3 -> 1 
//从最弱到最强对这些行排序后得到 [0,2,3,1]
<<<<<<< HEAD
//
// 提示： 
//
=======
// 
//
// 
//
// 提示： 
//
// 
>>>>>>> 2392a866852869394739dc4fd756a8e270293df8
// m == mat.length 
// n == mat[i].length 
// 2 <= n, m <= 100 
// 1 <= k <= m 
// matrix[i][j] 不是 0 就是 1 
// 
<<<<<<< HEAD
// Related Topics 数组 二分查找 
// 👍 24 👎 0

object Solution {

  def searchZero(l:Array[Int]):Int = {

    var left = 0
    var right = l.size - 1

    while(left < right){

      val mid = (left + right) >> 1

      if( l(mid) == 0  ){
        right = mid
      }else {
        left = mid + 1
      }
    }
    if( l(left) == 0 ) return left else l.size 
  }

  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    mat.map(searchZero).zipWithIndex.sortBy(_._1).take(k).map(_._2)
  }

=======
// Related Topics 数组 二分查找





































































































object Solution {
    def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
        val tmp =  mat.map(_.filter(_ == 1).length)
        tmp.zipWithIndex.sortBy(_._1).take(k).map(_._2).toArray
    }
>>>>>>> 2392a866852869394739dc4fd756a8e270293df8
}
