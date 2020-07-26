//给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。 
// 示例: 
// 输入:
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//
//输出:  [1,2,4,7,5,3,6,8,9]
//
//解释:
// 说明: 
// 给定矩阵中的元素总数不会超过 100000 。 
// 👍 112 👎 0

object Solution {
  def findDiagonalOrder(matrix: Array[Array[Int]]): Array[Int] = {
    import scala.collection.mutable.ArrayBuffer
    val buffer = new ArrayBuffer[Int]()
    val rows = matrix.length
    val cols = matrix(0).length
    var direction = 0
    var (lx, ly) = (0, 0)
    var (rx, ry) = (0, 0)
    while (lx < rows && ly < cols) {
      if(direction == 0){
        var ( a,b ) = (lx,ly)
        while( a >= rx && b <= ry){
          buffer.append(matrixa)(b))
          a -= 1 
          b += 1
        }
        direction = 1
      }else {
        var ( a,b ) = (rx,ry)
        while( a <= lx && b >= ly ){
          buffer.append(matrix(a)(b))
          a += 1
          b -= 1
        }
        direction = 0
      }
      if (lx + 1 < rows) lx += 1
      else ly += 1
      if (ry + 1 < cols) ry += 1
      else rx += 1
    }
    buffer.toArray
  }
}
