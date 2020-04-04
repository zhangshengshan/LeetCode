
//给定一个二叉搜索树的根结点 root，返回树中任意两节点的差的最小值。
//
// 
//
// 示例： 
//
// 输入: root = [4,2,6,1,3,null,null]
//输出: 1
//解释:
//注意，root是树结点对象(TreeNode object)，而不是数组。
//
//给定的树 [4,2,6,1,3,null,null] 可表示为下图:
//
//          4
//        /   \
//      2      6
//     / \    
//    1   3  
//
//最小的差值是 1, 它是节点1和节点2的差值, 也是节点3和节点2的差值。 
//
// 
//
// 注意： 
//
// 
// 二叉树的大小范围在 2 到 100。 
// 二叉树总是有效的，每个节点的值都是整数，且不重复。 
// 本题与 530：https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/ 
//相同 
// 
// Related Topics 树 递归


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

  def minDiffInBST(root: TreeNode): Int = {
    var min: Int = Int.MaxValue
    import scala.collection.mutable.Stack
    val mystack = new Stack[TreeNode]()
    var pre: TreeNode = null
    var pCur: TreeNode = root
    while (mystack.nonEmpty || pCur != null) {
      if (pCur != null) {
        mystack.push(pCur)
        pCur = pCur.left
      } else {
        val cur: TreeNode = mystack.pop
        if (pre != null) {
          min = math.min(min, math.abs(cur.value - pre.value))
        }
        pre = cur
        pCur = cur.right
      }
    }
    return min
  }
}

//leetcode submit region end(Prohibit modification and deletion)
