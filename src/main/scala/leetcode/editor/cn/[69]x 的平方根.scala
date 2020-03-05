//实现 int sqrt(int x) 函数。 
//
// 计算并返回 x 的平方根，其中 x 是非负整数。 
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。 
//
// 示例 1: 
//
// 输入: 4
//输出: 2
// 
//
// 示例 2: 
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842..., 
//     由于返回类型是整数，小数部分将被舍去。
// 
// Related Topics 数学 二分查找


//leetcode submit region begin(Prohibit modification and deletion)

object Solution {
  def mySqrt(x: Int): Int = {
    var _Xn = x / 2.0
    var _Xn_1 = 0.0
    while (math.abs(_Xn - _Xn_1) >= 0.01) {
      _Xn_1 = _Xn
      _Xn = (_Xn_1 + x / _Xn_1) / 2.0
    }
    _Xn.toInt
  }

  // 下面这种方法可能会整数溢出， 而且效率可能不够高
  def mySqrt1(x: Int): Int = {
    import util.control.Breaks._
    if (x <= 0) return 0
    var tmp: Int = 0
    breakable(
      for (i <- 1 to x) {
        if (i <= x / i && i + 1 > x / (i + 1)) {
          tmp = i
          break()
        }
      }
    )
    tmp
  }

  def main(args: Array[String]): Unit = {

    mySqrt(8)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
