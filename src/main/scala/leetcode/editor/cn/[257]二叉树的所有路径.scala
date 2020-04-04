//给定一个二叉树，返回所有从根节点到叶子节点的路径。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 输入:
//
//   1
// /   \
//2     3
// \
//  5
//
//输出: ["1->2->5", "1->3"]
//
//解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3 
// Related Topics 树 深度优先搜索


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 */
object Solution {

  //if (root == null) return Nil
  //if (root.left == null && root.right == null) return List(root.value.toString)
  //val strings: List[String] = binaryTreePaths(root.left) ::: binaryTreePaths(root.right)
  //strings.map(x => root.value.toString + "->" + x)
  //    class TreeNode(var _value: Int) {
  //      var value: Int = _value
  //      var left: TreeNode = null
  //      var right: TreeNode = null
  //    }

  def binaryTreePaths(root: TreeNode): List[String] = {
    if (root == null) return Nil
    import scala.collection.mutable.Stack
    var list = List[String]()
    val mystack = new Stack[(TreeNode, String)]()
    mystack.push((root, root.value.toString))
    while (mystack.nonEmpty) {
      val (curNode, curPath) = mystack.pop()
      if (curNode.left == null && curNode.right == null) {
        list = curPath :: list
      }
      if (curNode.left != null) {
        mystack.push((curNode.left, curPath + "->" + curNode.left.value.toString))
      }
      if (curNode.right != null) {
        mystack.push((curNode.right, curPath + "->" + curNode.right.value.toString))
      }
    }
    return list
  }

  //  def main(args: Array[String]): Unit = {
  //    val a = new TreeNode(1)
  //    val b = new TreeNode(2 )
  //    val c = new TreeNode(3)
  //    a.left = b
  //    a.right = c
  //    binaryTreePaths(a)
  //  }
}

//leetcode submit region end(Prohibit modification and deletion)
