//给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。 
// 注意：两个节点之间的路径长度由它们之间的边数表示。 
// 示例 1: 
// 输入: 
//
//              5
//             / \
//            4   5
//           / \   \
//          1   1   5
//
// 输出: 
//2
// 示例 2: 
// 输入: 
// 
//              1
//             / \
//            4   5
//           / \   \
//          4   4   5
// 
//
// 输出: 
//2
//
// 注意: 给定的二叉树不超过10000个结点。 树的高度不超过1000。 
// Related Topics 树 递归


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
  def dfs(root: TreeNode): (Int, Int) = {
    if (root == null) return (0, 0)
    val left = dfs(root.left)
    val right = dfs(root.right)
    val a = if (root.left != null && root.left.value == root.value) left._2 + 1 else 0
    val b = if (root.right != null && root.right.value == root.value) right._2 + 1 else 0
    (a + b, math.max(a, b))
  }

  def longestUnivaluePath(root: TreeNode): Int = {
    if (root == null) return 0
    List(dfs(root)._1, longestUnivaluePath(root.left), longestUnivaluePath(root.right)).max
  }
}

//leetcode submit region end(Prohibit modification and deletion)
