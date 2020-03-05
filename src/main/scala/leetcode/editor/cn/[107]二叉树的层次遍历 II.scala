import scala.collection.mutable
//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）  例如： 给定二叉树 [3,9,20,null,null,15,7],  3 / \ 9  20 /  \ 15   7 返回其自底向上的层次遍历为：  [ [15,7], [9,20], [3] ] Related Topics 树 广度优先搜索


//leetcode submit region begin(Prohibit modification and deletion)
//class TreeNode(var _value: Int) {
//  var value: Int = _value
//  var left: TreeNode = null
//  var right: TreeNode = null
//}

object Solution {
  def levelOrderBottom(root: TreeNode): List[List[Int]] = {
    import scala.collection.mutable.Queue
    val myqueue = new Queue[TreeNode]()
    var res = List[List[Int]]()
    if(root==null) return res
    myqueue.enqueue(root)
    while (myqueue.nonEmpty) {
      var subList = List[Int]()
      val nodes = myqueue.dequeueAll(_ => true)
      for (elem <- nodes) {
        subList = elem.value :: subList
        if(elem.left!=null){
          myqueue.enqueue(elem.left)
        }
        if(elem.right!=null){
          myqueue.enqueue(elem.right)
        }
      }
      res = subList.reverse :: res
    }
    res
  }
}

//leetcode submit region end(Prohibit modification and deletion)
