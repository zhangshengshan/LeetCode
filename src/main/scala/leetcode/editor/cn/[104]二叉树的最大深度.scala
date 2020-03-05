import scala.collection.mutable
//给定一个二叉树，找出其最大深度。
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例： 
//给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
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
    def maxDepth(root: TreeNode): Int = {
      if(root==null) return  0
        var length = 0
        import scala.collection.mutable.Stack
        val mystack = new  mutable.Stack[TreeNode]()
        mystack.push(root)
        while(mystack.nonEmpty){


        }
    }
    def maxDepth1(root: TreeNode): Int = {
        if(root==null) return 0
        return 1 + math.max(maxDepth(root.left), maxDepth(root.right))
    }
}
//leetcode submit region end(Prohibit modification and deletion)
