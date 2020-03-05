//给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//给定如下二叉树，以及目标和 sum = 22， 
//
//               5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \      \
//        7    2      1
// 
//
// 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。 
// Related Topics 树 深度优先搜索


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
    def hasPathSum(root: TreeNode, sum: Int): Boolean = {
      if (root == null) return false
      if (root.left == null && root.right == null && root.value == sum ) return true
      return hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value)
    }
    //def hasPathSum(root: TreeNode, sum: Int): Boolean = {
      //if (root == null) return false
      //import scala.collection.mutable.Stack
      //val mystack = new Stack[(TreeNode,Int)]()
      //mystack.push((root,root.value))

      //while(mystack.nonEmpty){
        //val (node, acc) = mystack.pop
        //if( node.left == null && node.right == null && acc == sum) {
          //return true
        //}
        //if(node.left!=null){
          //mystack.push((node.left, acc+node.left.value))
        //}
        //if(node.right!=null){
          //mystack.push((node.right, acc+node.right.value))
        //}
      //}
      //return false
    //}
}
//leetcode submit region end(Prohibit modification and deletion)
