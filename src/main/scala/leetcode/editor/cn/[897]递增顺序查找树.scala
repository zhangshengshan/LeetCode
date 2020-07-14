//给你一个树，请你 按中序遍历 重新排列树，
//使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。 
// 示例 ： 
// 输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]
//       5
//      / \
//    3    6
//   / \    \
//  2   4    8
// /        / \ 
//1        7   9
//
//输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
// 1
//  \
//   2
//    \
//     3
//      \
//       4
//        \
//         5
//          \
//           6
//            \
//             7
//              \
//               8
//                \
//                 9  
//
// 提示： 
// 给定树中的结点数介于 1 和 100 之间。 
// 每个结点都有一个从 0 到 1000 范围内的唯一整数值。 
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
  def midOrder(root: TreeNode, buff: scala.collection.mutable.ArrayBuffer[TreeNode]): Unit = {
    if (root == null) return
    midOrder(root.left, buff)
    buff += root
    midOrder(root.right, buff)
  }

  def increasingBST(root: TreeNode): TreeNode = {
    import scala.collection.mutable.ArrayBuffer
    val myArrayBuffer = new ArrayBuffer[TreeNode]()
    midOrder(root, myArrayBuffer)
    for (i <- 0 to myArrayBuffer.length - 2) {
      myArrayBuffer(i).left = null
      myArrayBuffer(i).right = myArrayBuffer(i + 1)
    }
    myArrayBuffer(0)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
