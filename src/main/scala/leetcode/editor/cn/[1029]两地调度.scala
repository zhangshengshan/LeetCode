//公司计划面试 2N 人。第 i 人飞往 A 市的费用为 costs[i][0]，飞往 B 市的费用为 costs[i][1]。 
// 返回将每个人都飞到某座城市的最低费用，要求每个城市都有 N 人抵达。 
// 示例： 
// 输入：[[10,20],[30,200],[400,50],[30,20]]
//输出：110
//解释：
//第一个人去 A 市，费用为 10。
//第二个人去 A 市，费用为 30。
//第三个人去 B 市，费用为 50。
//第四个人去 B 市，费用为 20。
//最低总费用为 10 + 30 + 50 + 20 = 110，每个城市都有一半的人在面试。
//
// 提示： 
// 1 <= costs.length <= 100 
// costs.length 为偶数 
// 1 <= costs[i][0], costs[i][1] <= 1000 
// Related Topics 贪心算法


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def twoCitySchedCost(costs: Array[Array[Int]]): Int = {
    val array: Array[Array[Int]] = costs.sortBy(x => (x(0) - x(1)))
    val tuple: (Array[Array[Int]], Array[Array[Int]]) = array.splitAt(array.length / 2)
    tuple._1.foldLeft(0)((x, y) => x + y(0)) + tuple._2.foldLeft(0)((x, y) => x + y(1))
  }
}

//Array(Array(259,770),Array(448,54),Array(926,667),Array(184,139),Array(840,118),Array(577,469))
//leetcode submit region end(Prohibit modification and deletion)
