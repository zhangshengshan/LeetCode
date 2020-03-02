
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1: 
//
// 输入: 121
//输出: true
// 
//
// 示例 2: 
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3: 
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 进阶: 
//
// 你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def isPalindrome(x: Int): Boolean = {
    if (x < 0) return false
    import scala.collection.mutable
    val a = new mutable.Stack[Int]()
    val b = new mutable.Queue[Int]()
    var _x: Int = x
    while (_x != 0) {
      a.push(_x % 10)
      b.enqueue(_x % 10)
      _x = _x / 10
    }
    _x = x
    while (!a.isEmpty ) {
//      if (a.pop() != _x % 10) return false
//      _x = _x / 10
      if(a.pop() != b.dequeue()) return false

    }
    return true
  }

  def isPalindrome1(x: Int): Boolean = {
    if (x < 0) false else {
      x.toString.reverse == x.toString
    }
  }

  def main(args: Array[String]): Unit = {
    println(isPalindrome(123232321))
  }
}

//leetcode submit region end(Prohibit modification and deletion)
