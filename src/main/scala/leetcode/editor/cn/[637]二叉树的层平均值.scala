
//给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
//
// 示例 1: 
//
// 输入:
//    3
//   / \
//  9  20
//    /  \
//   15   7
//输出: [3, 14.5, 11]
//解释:
//第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
// 
//
// 注意： 
//
// 
// 节点值的范围在32位有符号整数范围内。 
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
  def averageOfLevels(root: TreeNode): Array[Double] = {
    val mymap = scala.collection.mutable.Map[Int, (Double, Int)]()
    import scala.collection.mutable.ArrayBuffer
    val myArrayBuffer = new ArrayBuffer[Double]()
    dfs(root, 0, mymap)
    var i = 0
    import util.control.Breaks._
    breakable {
      while (true) {
        if (!mymap.contains(i)) break
        myArrayBuffer += mymap(i)._1 / mymap(i)._2
        i += 1
      }
    }
    myArrayBuffer.toArray
  }

  def dfs(root: TreeNode, layer: Int, mymap: scala.collection.mutable.Map[Int, (Double, Int)]) {

    if (root == null) return

    if (!mymap.contains(layer)) {
      mymap(layer) = (root.value.toDouble, 1)
    } else {
      mymap(layer) = (mymap(layer)._1 + root.value.toDouble, mymap(layer)._2 + 1)
    }

    dfs(root.left, layer + 1, mymap)
    dfs(root.right, layer + 1, mymap)
  }

  //def averageOfLevels(root: TreeNode): Array[Double] = {
  //if (root == null) return Array[Double]()
  //import scala.collection.mutable.ArrayBuffer
  //val myArrayBuffer = new ArrayBuffer[Double]()
  //import scala.collection.mutable.Queue
  //val myqueue = new Queue[TreeNode]()
  //myqueue.enqueue(root)
  //while (myqueue.nonEmpty) {
  //val nodes = myqueue.dequeueAll(_ => true)
  //val length: Int = nodes.length
  //val sum = nodes.map(x => x.value.toDouble).sum
  //val i = sum / length
  //nodes.foreach(x => {
  //if (x.left != null) myqueue.enqueue(x.left)
  //if (x.right != null) myqueue.enqueue(x.right)
  //})
  //myArrayBuffer += i
  //}
  //myArrayBuffer.toArray
  //}
}

//leetcode submit region end(Prohibit modification and deletion)
