
//给定一个二叉树，找出其最小深度。
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最小深度 2. 
// Related Topics 树 深度优先搜索 广度优先搜索


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
  def minDepth(root: TreeNode): Int = {
    if (root == null) return 0

    import scala.collection.mutable.Queue
    val myqueue = new Queue[(TreeNode, Int)]()
    myqueue.enqueue((root, 1))

    while (myqueue.nonEmpty) {
      val listNodes = myqueue.dequeueAll(_ => true)
      for (elem <- listNodes) {
        val node = elem._1
        val depth = elem._2
        if (node.left == null && node.right == null) {
          // BREAK OUT 
          return depth
        } else {
          if (node.left != null) {
            myqueue.enqueue((node.left, depth + 1))
          }
          if (node.right != null) {
            myqueue.enqueue((node.right, depth + 1))
          }
        }
      }

    }
    return Int.MaxValue
  }
}

//leetcode submit region end(Prohibit modification and deletion)
