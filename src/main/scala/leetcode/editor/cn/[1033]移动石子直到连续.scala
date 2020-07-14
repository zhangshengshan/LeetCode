//三枚石子放置在数轴上，位置分别为 a，b，c。 
//
// 每一回合，我们假设这三枚石子当前分别位于位置 x, y, z 且 x < y < z。从位置 x 或者是位置 z 拿起一枚石子，并将该石子移动到某一整数位
//置 k 处，其中 x < k < z 且 k != y。 
//
// 当你无法进行任何移动时，即，这些石子的位置连续时，游戏结束。 
//
// 要使游戏结束，你可以执行的最小和最大移动次数分别是多少？ 以长度为 2 的数组形式返回答案：answer = [minimum_moves, maximu
//m_moves] 
//
// 
//
// 示例 1： 
//
// 输入：a = 1, b = 2, c = 5
//输出：[1, 2]
//解释：将石子从 5 移动到 4 再移动到 3，或者我们可以直接将石子移动到 3。
// 
//
// 示例 2： 
//
// 输入：a = 4, b = 3, c = 2
//输出：[0, 0]
//解释：我们无法进行任何移动。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= a <= 100 
// 1 <= b <= 100 
// 1 <= c <= 100 
// a != b, b != c, c != a 
// 
// Related Topics 脑筋急转弯


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def numMovesStones(a: Int, b: Int, c: Int): Array[Int] = {
    val sorted: List[Int] = List(a, b, c).sorted
    val max: Int = sorted(2) - sorted.head - 2

    val min: Int = if (sorted(2) - sorted(0) == 2) {
      0
    } else if (sorted(2) - sorted(1) == 1 || sorted(1) - sorted(0) == 1) {
      1
    } else if (sorted(2) - sorted(1) == 2 ||
      sorted(1) - sorted(0) == 2) {
      1
    } else {
      2
    }

    Array(min, max)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
