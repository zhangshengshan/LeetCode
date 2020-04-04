
//计算给定二叉树的所有左叶子之和。
//
// 示例： 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24 
//
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
  def sumOfLeftLeaves(root: TreeNode): Int = {

    var sum = 0
    import scala.collection.mutable.Queue
    val myqueue = new Queue[(TreeNode, Boolean)]()
    if (root == null) {
      return 0
    }
    myqueue.enqueue((root, false))
    while (myqueue.nonEmpty) {
      val tuples = myqueue.dequeueAll((_: (TreeNode, Boolean)) => true)
      for (elem <- tuples) {
        if (elem._2 == true && elem._1.left == null && elem._1.right == null) {
          sum += elem._1.value
        }
        if (elem._1.left != null) {
          myqueue.enqueue((elem._1.left, true))
        }
        if (elem._1.right != null) {
          myqueue.enqueue((elem._1.right, false))
        }
      }
    }
    return sum
  }
}

//leetcode submit region end(Prohibit modification and deletion)
