//给定一个二叉树，它的每个结点都存放着一个整数值。 
//
// 找出路径和等于给定数值的路径总数。 
//
// 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。 
//
// 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。 
//
// 示例： 
//
// root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
//
//      10
//     /  \
//    5   -3
//   / \    \
//  3   2   11
// / \   \
//3  -2   1
//
//返回 3。和等于 8 的路径有:
//
//1.  5 -> 3
//2.  5 -> 2 -> 1
//3.  -3 -> 11
// 
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
  def func(root: TreeNode, sum: Int, preSum: Int, mymap: scala.collection.mutable.Map[Int, Int]): Int = {
    var num = 0
    if (root == null) return 0
    val newPreSum: Int = root.value + preSum
    if (mymap.contains(newPreSum - sum)) {
      num += mymap(newPreSum - sum)
    }
    if (mymap.contains(newPreSum)) mymap(newPreSum) += 1
    else mymap(newPreSum) = 1
    num += func(root.left, sum, newPreSum, mymap)
    num += func(root.right, sum, newPreSum, mymap)
    if (mymap(newPreSum) == 1) mymap.remove(newPreSum)
    else mymap(newPreSum) -= 1
    return num
  }

  def pathSum(root: TreeNode, sum: Int): Int = {
    var preSum = 0
    val mymap = scala.collection.mutable.Map[Int, Int]()
    mymap(0) = 1
    func(root, sum, preSum, mymap)
  }

  //def dfs(root: TreeNode, sum: Int): Int = {
  //if (root == null) return 0
  //var num = 0
  //if (root.value == sum) num += 1
  //num += dfs(root.left, sum - root.value)
  //num += dfs(root.right, sum - root.value)
  //return num
  //}

  //def pathSum(root: TreeNode, sum: Int): Int = {
  //if (root == null) return 0
  //dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum)
  //}

  //    if (root == null) return 0
  //    if (root.left == null && root.right == null) if (root.value == sum) return 1 else 0
  //    import scala.collection.mutable.Stack
  //    val mystack = new Stack[(TreeNode, List[Int])]()
  //    mystack.push((root, List(root.value)))
  //
  //    var num = 0
  //    while (mystack.nonEmpty) {
  //      val (node, sumpath) = mystack.pop
  //      num += sumpath.count((_: Int) == sum)
  //      if (node.left != null) {
  //        mystack.push((node.left, node.left.value :: sumpath.map(x => x + node.left.value)))
  //      }
  //      if (node.right != null) {
  //        mystack.push((node.right, node.right.value :: sumpath.map(x => x + node.right.value)))
  //      }
  //    }
  //    return num
}

//leetcode submit region end(Prohibit modification and deletion)
