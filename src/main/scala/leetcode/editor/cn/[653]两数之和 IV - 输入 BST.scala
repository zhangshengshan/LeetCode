//给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。 
// 案例 1: 
//输入: 
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 9
//输出: True
// 案例 2: 
//输入: 
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 28
//输出: False
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
  def dfs(root: TreeNode, arr: scala.collection.mutable.ArrayBuffer[Int], k: Int): Boolean = {
    if (root == null) return false
    val leftFlag = dfs(root.left, arr, k)
    if (arr.contains(k - root.value)) return true
    else {
      arr += root.value
    }
    val rightFlag = dfs(root.right, arr, k)
    return leftFlag || rightFlag
  }

  def findTarget(root: TreeNode, k: Int): Boolean = {
    if (root == null) return false
    import scala.collection.mutable.ArrayBuffer
    val myArrayBuffer = new ArrayBuffer[Int]()
    dfs(root, myArrayBuffer, k)
  }

  //var left = 0
  //var right = myArrayBuffer.size - 1
  //while (left < right) {
  //val tmpSum = myArrayBuffer(left) + myArrayBuffer(right)
  //if (tmpSum == k) return true
  //if (tmpSum < k) {
  //left += 1
  //} else {
  //right -= 1
  //}
  //}
  //return false
}

//leetcode submit region end(Prohibit modification and deletion)
