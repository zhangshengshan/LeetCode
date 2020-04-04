//给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。 
//
// 例如， 
//
// 
//给定二叉搜索树:
//
//        4
//       / \
//      2   7
//     / \
//    1   3
//
//和值: 2
// 
//
// 你应该返回如下子树: 
//
// 
//      2     
//     / \   
//    1   3
// 
//
// 在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。 
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
  def searchBST(root: TreeNode, `val`: Int): TreeNode = {
    if (root == null) return null
    if (root.value == `val`) return root
    val left = searchBST(root.left, `val`)
    val right = searchBST(root.right, `val`)

    if (left == null) right else left
    //    import scala.collection.mutable.Stack
    //    val mystack = new Stack[TreeNode]()
    //    if (root == null) return null
    //    mystack.push(root)
    //    while (mystack.nonEmpty) {
    //      val top = mystack.pop
    //      if (top.value == `val`) {
    //        return top
    //      }
    //      if (top.left != null) {
    //        mystack.push(top.left)
    //      }
    //      if (top.right != null) {
    //        mystack.push(top.right)
    //      }
    //    }
    //
    //    return null
  }
}

//leetcode submit region end(Prohibit modification and deletion)
