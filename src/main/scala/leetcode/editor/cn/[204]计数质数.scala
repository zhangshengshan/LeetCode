//统计所有小于非负整数 n 的质数的数量。 
//
// 示例: 
//
// 输入: 10
//输出: 4
//解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
// 
// Related Topics 哈希表 数学


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def isPrime(in: Int) = {

  }

  def countPrimes(n: Int): Int = {

    if (n <= 2) return 0
    if (n == 3) return 1

    import scala.collection.mutable.Map
    val mymap = Map[Int, Int]()
    mymap(2) = 1
    for (i <- 3 to n - 1) {
      if (i % 2 != 0) {
        if (mymap.forall(x => i % x._1 != 0)) mymap(i) = 1
      }
    }
    return mymap.size
  }
}

//leetcode submit region end(Prohibit modification and deletion)
