//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 * var next: ListNode = null
 * var x: Int = _x
 * }
 */

//class ListNode(var _x: Int = 0) {
// var next: ListNode = null
// var x: Int = _x
//}
object DDSolution {
  def deleteDuplicates(head: ListNode): ListNode = {
    if (head == null) return null
    var pListNode = head
    while (pListNode != null && pListNode.next != null) {
      if (pListNode.x == pListNode.next.x) {
        pListNode.next = pListNode.next.next
      } else {
        pListNode = pListNode.next
      }
    }
    return head
  }
}

//leetcode submit region end(Prohibit modification and deletion)
