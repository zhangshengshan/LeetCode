//给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。 
//
// 
//示例:
//输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
//输出: 2
//解释: 
//这五个点如下图所示。组成的橙色三角形是最大的，面积为2。
// 
//
// 
//
// 注意: 
//
// 
// 3 <= points.length <= 50. 
// 不存在重复的点。 
// -50 <= points[i][j] <= 50. 
// 结果误差值在 10^-6 以内都认为是正确答案。 
// 
// Related Topics 数学


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {

  def distance(x: Array[Int], y: Array[Int]): Double = {
    math.sqrt(math.pow(x(0) - y(0), 2) + math.pow(x(1) - y(1), 2))
  }

  def area(x: Array[Int], y: Array[Int], z: Array[Int]): Double = {
    val a = distance(x, y)
    val b = distance(x, z)
    val c = distance(y, z)
    val p = (a + b + c) / 2
    val tmp  = math.sqrt(p * (p - a) * (p - b) * (p - c))
    if(tmp.isNaN) (x,y,z)
  }

  def largestTriangleArea(points: Array[Array[Int]]): Double = {
    var point = Array[Array[Int]]()
    val len = points.length - 1
    var maxArea = Double.MinValue
    for (i <- 0 to len; j <- i + 1 to len; k <- j + 1 to len) {
      val (x, y, z) = (points(i), points(j), points(k))
      val tmp: Double = area(x, y, z)
      if (!tmp.isNaN) maxArea = math.max(maxArea, tmp)
    }
    return maxArea
  }
}

//leetcode submit region end(Prohibit modification and deletion)
