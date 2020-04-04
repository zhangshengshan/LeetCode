//给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看
//做它自身的一棵子树。 
//
// 示例 1: 
//给定的树 s: 
//
// 
//     3
//    / \
//   4   5
//  / \
// 1   2
// 
//
// 给定的树 t： 
//
// 
//   4 
//  / \
// 1   2
// 
//
// 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。 
//
// 示例 2: 
//给定的树 s： 
//
// 
//     3
//    / \
//   4   5
//  / \
// 1   2
//    /
//   0
// 
//
// 给定的树 t： 
//
// 
//   4
//  / \
// 1   2
// 
//
// 返回 false。 
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

  //def eqTree(s: TreeNode, t: TreeNode): Boolean = {
  //if( s == null && t == null ) return true
  //if( s == null || t == null ) return false
  //if( s.value != t.value ) return false
  //eqTree(s.left, t.left) && eqTree(s.right, t.right)
  //}

  //def isSubtree(s: TreeNode, t: TreeNode): Boolean = {
  //if(s == null) return false
  //if(eqTree(s,t)) return true
  //return isSubtree(s.left, t) || isSubtree(s.right, t)
  //}
  def preOrder(root: TreeNode): String = {
    if (root == null) return "null"
    "#" + root.value.toString + preOrder(root.left) + preOrder(root.right)
  }

  def isSubtree(s: TreeNode, t: TreeNode): Boolean = {
    val s1 = preOrder(s)
    val s2 = preOrder(t)
    println(s1)
    println(s2)
    s1.contains(s2)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
