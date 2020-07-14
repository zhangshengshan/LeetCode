//如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。 
// 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
// 示例 1：
// 输入：[1,1,1,1,1,null,1]
//输出：true
// 示例 2：
// 输入：[2,2,2,5,2]
//输出：false
// 提示：
// 给定树的节点数范围是 [1, 100]。
// 每个节点的值都是整数，范围为 [0, 99] 。 
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
  def dfs(root: TreeNode, target: Int): Boolean = {
    if (root == null) return true
    return root.value == target && dfs(root.left, target) && dfs(root.right, target)
  }

  def isUnivalTree(root: TreeNode): Boolean = {
    if (root == null) return true
    val target = root.value
    dfs(root, target)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
