//给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L) 。你可能需要改变树的根节点，所以
//结果应当返回修剪好的二叉搜索树的新的根节点。 
// 示例 1: 
//
//输入: 
//    1
//   / \
//  0   2
//  L = 1
//  R = 2
//
//输出: 
//    1
//      \
//       2
// 示例 2: 
//
//输入: 
//    3
//   / \
//  0   4
//   \
//    2
//   /
//  1
//
//  L = 1
//  R = 3
//
//输出: 
//      3
//     / 
//   2   
//  /
// 1
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
  def prt(root: TreeNode): Unit = {
    if (root == null) return
    print("value is " + root.value)
    prt(root.left)
    prt(root.right)
  }

  def trimBST(root: TreeNode, L: Int, R: Int): TreeNode = {
    var tmpRoot = root
    if (tmpRoot == null) return null
    if (tmpRoot.value < L || tmpRoot.value > R) {
      if (tmpRoot.value < L) return trimBST(root.right, L, R)
      else return trimBST(root.left, L, R)
    } else {
      tmpRoot.left = trimBST(tmpRoot.left, L, R)
      tmpRoot.right = trimBST(tmpRoot.right, L, R)
      return tmpRoot
    }

  }
}

//leetcode submit region end(Prohibit modification and deletion)
