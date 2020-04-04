// 给定一个二叉树，计算整个树的坡度。
// 一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。 
// 整个树的坡度就是其所有节点的坡度之和。 
// 示例: 
//输入: 
//         1
//       /   \
//      2     3
//输出: 1
//解释: 
//结点的坡度 2 : 0
//结点的坡度 3 : 0
//结点的坡度 1 : |2-3| = 1
//树的坡度 : 0 + 0 + 1 = 1
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
  def sum(root:TreeNode): Int = {
    if(root == null) return 0 
    else root.value + sum(root.left) + sum(root.right)
  }
  def findTilt(root: TreeNode): Int = {
    if(root==null) return 0
    findTilt(root.left) + findTilt(root.right) + math.abs(sum(root.left) - sum(root.right))
  } 
}

//leetcode submit region end(Prohibit modification and deletion)
