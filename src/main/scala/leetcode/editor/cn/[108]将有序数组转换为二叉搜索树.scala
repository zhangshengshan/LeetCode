
//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
//
// 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。 
//
// 示例: 
//
// 给定有序数组: [-10,-3,0,5,9],
//
//一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
//
//      0
//     / \
//   -3   9
//   /   /
// -10  5
// 
// Related Topics 树 深度优先搜索
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
  def makeTree(nums: Array[Int]): TreeNode = {
    if (nums == null || nums.size == 0) return null
    val mid = nums.size / 2
    val root = new TreeNode(nums(mid))
    root.left = makeTree(nums.slice(0, mid))
    root.right = makeTree(nums.slice(mid + 1, nums.size))
    return root
  }

  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    makeTree(nums)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
