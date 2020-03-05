
//给定两个二叉树，编写一个函数来检验它们是否相同。
//
// 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。 
//
// 示例 1: 
//
// 输入:       1         1
//          / \       / \
//         2   3     2   3
//
//        [1,2,3],   [1,2,3]
//
//输出: true 
//
// 示例 2: 
//
// 输入:      1          1
//          /           \
//         2             2
//
//        [1,2],     [1,null,2]
//
//输出: false
// 
//
// 示例 3: 
//
// 输入:       1         1
//          / \       / \
//         2   1     1   2
//
//        [1,2,1],   [1,1,2]
//
//输出: false
// 
// Related Topics 树 深度优先搜索


//leetcode submit region begin(Prohibit modification and deletion)
//  Definition for a binary tree node.
class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Solution {

  import scala.collection.mutable.Queue

  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    val myQueue = new Queue[(TreeNode, TreeNode)]()
    myQueue.enqueue((p, q))
    while (myQueue.nonEmpty) {
      val (t1, t2) = myQueue.dequeue()
      if (t1 == null && t2 != null) return false
      if (t2 != null && t2 == null) return false
      else if (t1 != null && t2 != null && t1.value != t2.value) return false
      myQueue.enqueue((p.left, q.left))
      myQueue.enqueue((p.right, q.right))
    }
    return true
    //        if(p == null && q == null) return true
    //        if(p==null && q != null) return false
    //        if(p!=null && q == null) return false
    //        return p.value==q.value && isSameTree(p.left,q.left) && isSameTree(p.right, q.right)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
