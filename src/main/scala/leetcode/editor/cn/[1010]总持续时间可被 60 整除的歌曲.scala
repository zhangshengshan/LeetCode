//在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。 
//
// 返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，我们希望索引的数字 i < j 且有 (time[i] + time[j]) % 6
//0 == 0。 
//
// 
//
// 示例 1： 
//
// 输入：[30,20,150,100,40]
//输出：3
//解释：这三对的总持续时间可被 60 整数：
//(time[0] = 30, time[2] = 150): 总持续时间 180
//(time[1] = 20, time[3] = 100): 总持续时间 120
//(time[1] = 20, time[4] = 40): 总持续时间 60
// 
//
// 示例 2： 
//
// 输入：[60,60,60]
//输出：3
//解释：所有三对的总持续时间都是 120，可以被 60 整数。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= time.length <= 60000 
// 1 <= time[i] <= 500 
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def numPairsDivisibleBy60(time: Array[Int]): Int = {
    val mymap = scala.collection.mutable.Map[Int, Int]()
    var num = 0
    for (item <- time) {
      val tmp = item % 60
      if (mymap contains tmp) {
        mymap(tmp) += 1
      } else {
        mymap(tmp) = 1
      }
    }
    println(mymap)
    for (i <- 0 to 30) {
      if (mymap contains i) {
        if (i == 0 || i == 30) {
          num += (mymap(i) * (mymap(i) - 1)) / 2
        } else if (mymap contains 60 - i) {
          num += mymap(i) * mymap(60 - i)
        }
      }
    }
    num
  }
}

//leetcode submit region end(Prohibit modification and deletion)
