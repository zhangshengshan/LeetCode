//给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节
//点值之和。 
//
// 
//
// 例如： 
//
// 输入: 原始二叉搜索树:
//              5
//            /   \
//           2     13
//
//输出: 转换为累加树:
//             18
//            /   \
//          20     13
// 
//
// 
//
// 注意：本题和 1038: https://leetcode-cn.com/problems/binary-search-tree-to-greater-s
//um-tree/ 相同 
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
  def convertBST(root: TreeNode): TreeNode = {

    if (root == null) return null
    var preSum = 0

    import scala.collection.mutable.Stack
    val mystack = new Stack[TreeNode]()

    var head = root

    while (mystack.nonEmpty || head != null) {

      while (head != null) {
        mystack.push(head)
        head = head.right
      }

      val curRoot = mystack.pop
      curRoot.value += preSum
      preSum = curRoot.value
      head = curRoot.left
    }

    return root
  }
}

//leetcode submit region end(Prohibit modification and deletion)
