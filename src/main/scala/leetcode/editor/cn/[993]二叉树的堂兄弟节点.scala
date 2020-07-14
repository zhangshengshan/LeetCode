
//在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
// 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。 
// 我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。 
// 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。 
//
// 示例 1： 
//
// 输入：root = [1,2,3,4], x = 4, y = 3
//输出：false
//
// 示例 2： 
//
// 输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
//输出：true
//
// 示例 3： 
//
// 输入：root = [1,2,3,null,4], x = 2, y = 3
//输出：false 
//
// 提示： 
// 
// 二叉树的节点数介于 2 到 100 之间。 
// 每个节点的值都是唯一的、范围为 1 到 100 的整数。 
// 
//
// 
// Related Topics 树 广度优先搜索


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 */
 //class TreeNode(var _value: Int) {
 //var value: Int = _value
 //var left: TreeNode = null
 //var right: TreeNode = null
 //}
object Solution {
  def existsCouson(nodes: List[(TreeNode, TreeNode)], x: Int, y: Int): Boolean = {
    val xNode: Option[(TreeNode, TreeNode)] = nodes.find(item => item._2.value == x)
    val yNode: Option[(TreeNode, TreeNode)] = nodes.find(item => item._2.value == y)
    if (xNode.isDefined && yNode.isDefined && xNode.get._1 != yNode.get._1) return true
    else false
  }

  def isCousins(root: TreeNode, x: Int, y: Int): Boolean = {
    import scala.collection.mutable.Queue
    val myqueue = new Queue[(TreeNode, TreeNode)]()
    if (root == null) return false
    myqueue.enqueue((null, root))
    while (myqueue.nonEmpty) {
      val roots = myqueue.dequeueAll(_ => true)
      if (existsCouson(roots.toList, x, y)) return true
      for (elem <- roots) {
        if(elem._2.left != null) myqueue.enqueue((elem._2, elem._2.left))
        if(elem._2.right!= null) myqueue.enqueue((elem._2, elem._2.right))
      }
    }
    return false
  }
}

//leetcode submit region end(Prohibit modification and deletion)
