//给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。 
//
// 
//
// 示例： 
//
// 输入：
//
//   1
//    \
//     3
//    /
//   2
//
//输出：
//1
//
//解释：
//最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
// 
//
// 
//
// 提示： 
//
// 
// 树中至少有 2 个节点。 
// 本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/ 
//相同 
// 
// Related Topics 树


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 * var value: Int = _value
 * var left: TreeNode = null
 * var right: TreeNode = null
 * }
 */
object Solution {
  var pre: TreeNode = null
  var min: Int = Int.MaxValue

  def inOrder(root: TreeNode): Int = {
    if (root == null) return Int.MaxValue
    val left_value: Int = inOrder(root.left)
    val root_value: Int = if (pre == null) Int.MaxValue
    else math.abs(root.value - pre.value)
    pre = root
    val right_value: Int = inOrder(root.right)
    List(left_value, root_value, right_value).min
  }

  def getMinimumDifference(root: TreeNode): Int = {
    inOrder(root)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
