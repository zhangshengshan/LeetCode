//编写一个算法来判断一个数是不是“快乐数”。 
//
// 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。
//如果可以变为 1，那么这个数就是快乐数。 
//
// 示例: 
//
// 输入: 19
//输出: true
//解释: 
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1
// 
// Related Topics 哈希表 数学


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
    def isHappy(n: Int): Boolean = {
      import scala.collection.mutable.Map
      var mymap = Map[Int,Int]()
      var num = n 
      import util.control.Breaks._
      breakable {
        while(num!=1){
          var sum = 0 
          while(num>0)
          {
            val tmp = (num % 10 ) * (num % 10)
            sum = sum + tmp
            num = num / 10 
          }
          num = sum
          if(mymap.contains(num)) {break}
          else mymap.put(num,1)
        }
      }

      return if(num==1) true else false
    }
}
//leetcode submit region end(Prohibit modification and deletion)
