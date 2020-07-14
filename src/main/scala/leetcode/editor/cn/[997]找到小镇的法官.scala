//在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。 
// 如果小镇的法官真的存在，那么：
// 小镇的法官不相信任何人。
// 每个人（除了小镇法官外）都信任小镇的法官。 
// 只有一个人同时满足属性 1 和属性 2 。 
// 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。
// 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。
// 示例 1：
// 输入：N = 2, trust = [[1,2]]
//输出：2
// 示例 2：
// 输入：N = 3, trust = [[1,3],[2,3]]
//输出：3
// 示例 3：
// 输入：N = 3, trust = [[1,3],[2,3],[3,1]]
//输出：-1
// 示例 4：
// 输入：N = 3, trust = [[1,2],[2,3]]
//输出：-1
// 示例 5：
// 输入：N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
//输出：3 
// 提示：
// 1 <= N <= 1000
// trust.length <= 10000 
// trust[i] 是完全不同的 
// trust[i][0] != trust[i][1] 
// 1 <= trust[i][0], trust[i][1] <= N 
// Related Topics 图
//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def findJudge(N: Int, trust: Array[Array[Int]]): Int = {

    if (N == 1 && trust.length == 0) return 1

    val outMap = scala.collection.mutable.Map[Int, Int]()
    val inMap = scala.collection.mutable.Map[Int, Int]()

    for (item <- trust) {
      val out = item(0)
      val in = item(1)
      outMap(out) = 1

      if (inMap.contains(in)) {
        inMap(in) += 1
      } else {
        inMap(in) = 1
      }
    }
    val tmp = inMap.find(x => x._2 == N - 1)
    println(tmp)
    if (tmp.isDefined && !outMap.keys.toList.contains(tmp.get._1)) {
      return tmp.get._1
    }
    else {
      return -1
    }

  }

  //if (N == 1 && trust.length == 0) return 1
  //val tuples: Array[(Int, Int)] = trust.map(x => (x(0), x(1)))
  //val keys = tuples.groupBy(_._1).keys
  //val intToInt = tuples.groupBy(_._2).mapValues(_.size).filter(x => x._2 == N - 1)
  //val maybeTuple: Option[(Int, Int)] = intToInt.find(x => !keys.toList.contains(x._1))
  //if (maybeTuple.isDefined) maybeTuple.get._1 else -1
}

//leetcode submit region end(Prohibit modification and deletion)
