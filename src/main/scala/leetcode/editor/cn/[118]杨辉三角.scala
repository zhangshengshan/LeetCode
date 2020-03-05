//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def f(m: Int, n: Int): Int = {
    if (n == 1) return 1
    if (m == n) return 1
    return f(m - 1, n) + f(m - 1, n - 1)
  }

  def generate(numRows: Int): List[List[Int]] = {
    val arr = Array.ofDim[Int](numRows, numRows)
    for(i <- 0 until numRows ){
      for(j <- 0 to i){
        if(j==0) arr(i)(j)=1
        else if(i==j) arr(i)(j)=1
        else arr(i)(j)=arr(i-1)(j-1)+arr(i-1)(j)
      }
    }
    (0 until numRows).map(i => {
      arr(i).slice(0, i + 1).toList
    }).toList
  }

  //  def generate(numRows: Int): List[List[Int]] = {
  //    val inclusive = 1 to numRows
  //    inclusive.map( i => {
  //      (1 to i).map( j => f(i,j)).toList
  //    }).toList
  //  }
}

//leetcode submit region end(Prohibit modification and deletion)
