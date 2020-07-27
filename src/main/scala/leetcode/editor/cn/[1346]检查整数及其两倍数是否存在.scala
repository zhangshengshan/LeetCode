//给你一个整数数组 arr，请你检查是否存在两个整数 N 和 M，满足 N 是 M 的两倍（即，N = 2 * M）。 
// 更正式地，检查是否存在两个下标 i 和 j 满足： 
// 
// i != j 
// 0 <= i, j < arr.length 
// arr[i] == 2 * arr[j] 
//
// 示例 1： 
// 输入：arr = [10,2,5,3]
//输出：true
//解释：N = 10 是 M = 5 的两倍，即 10 = 2 * 5 。
//
// 示例 2： 
// 输入：arr = [7,1,14,11]
//输出：true
//解释：N = 14 是 M = 7 的两倍，即 14 = 2 * 7 。
//
// 示例 3： 
// 输入：arr = [3,1,7,11]
//输出：false
//解释：在该情况下不存在 N 和 M 满足 N = 2 * M 。
//
// 提示： 
// 2 <= arr.length <= 500 
// -10^3 <= arr[i] <= 10^3 
// 
// Related Topics 数组 
// 👍 20 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {

  def checkIfExist(arr: Array[Int]): Boolean = {

    val mymap = scala.collection.mutable.Map[Int, Int]()

    for (item <- arr) {
      if(mymap.contains(item)) mymap(item) += 1
      else mymap(item) = 1
    }

    mymap.foreach(println)

    for ( item <- arr ) {
      if( item == 0 ){
        if ( mymap(0) >= 2 ) {
          println("mymap(0)", mymap(0))
          return true
        }
      } else if (mymap.contains(item * 2)) {
        println("item => ", item )
        println("mymap(item * 2) =>", mymap(item * 2))
        return true
      }
    }
    return false

  }

}

//leetcode submit region end(Prohibit modification and deletion)
