
//给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。
// 
//
// 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。 
//
// 示例 1: 
//
// 
//输入: 
//    2
//   / \
//  2   5
//     / \
//    5   7
//
//输出: 5
//说明: 最小的值是 2 ，第二小的值是 5 。
// 
//
// 示例 2: 
//
// 
//输入: 
//    2
//   / \
//  2   2
//
//输出: -1
//说明: 最小的值是 2, 但是不存在第二小的值。
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
  def findSecondMinimumValue(root: TreeNode): Int = {
    var min = root.value
    var secondMin = -1

    import scala.collection.mutable.Queue
    val myqueue = new Queue[TreeNode]()
    myqueue.enqueue(root)
    while (myqueue.nonEmpty) {
      val nodes = myqueue.dequeueAll(_ => true)
      if (nodes.exists(x => x.value != min)) {
        val min1: Int = nodes.map(_.value).filter(_ != min).min
        if (secondMin == -1) secondMin = min1
        else secondMin = math.min(secondMin, min1)
      }
      nodes.foreach(x => {
        if (x.left != null) myqueue.enqueue(x.left)
        if (x.right != null) myqueue.enqueue(x.right)
      })
    }
    secondMin
  }
}

//leetcode submit region end(Prohibit modification and deletion)
