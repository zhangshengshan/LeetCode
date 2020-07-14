//给出一棵二叉树，其上每个结点的值都是 0 或 1 。每一条从根到叶的路径都代表一个从最高有效位开始的二进制数。例如，如果路径为 0 -> 1 -> 1 ->
// 0 -> 1，那么它表示二进制数 01101，也就是 13 。 
//
// 对树上的每一片叶子，我们都要找出从根到该叶子的路径所表示的数字。 
//
// 以 10^9 + 7 为模，返回这些数字之和。 
//
// 
//
// 示例： 
//
// 
//
// 输入：[1,0,1,0,1,0,1]
//输出：22
//解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
// 
//
// 
//
// 提示： 
//
// 
// 树中的结点数介于 1 和 1000 之间。 
// node.val 为 0 或 1 。 
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
  def sumRootToLeaf(root: TreeNode): Int = {
    import scala.collection.mutable.Stack
    val mystack = new Stack[TreeNode]()

    def dfs(root: TreeNode, l:List[Int]): Unit = {
      if (root == null) return
      mystack.push(root)
      dfs(root.left)
      if (root.left == null && root.right == null) {
        mystack.foreach(x => print(" " + x.value))
        println("")
        println("hello => " + mystack.pop.value)
      }
      dfs(root.right)
    }

    dfs(root)
    return 0
  }
}

//leetcode submit region end(Prohibit modification and deletion)
