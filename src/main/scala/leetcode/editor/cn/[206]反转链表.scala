//反转一个单链表。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletio
// n)
/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */
object Solution {
//    def reverseList(head: ListNode): ListNode = {
//      if (head==null || head.next == null)  return null
//      val p = reverseList(head.next)
//      head.next.next = head
//      head.next = null
//      return p
//    }

    def reverseList(head: ListNode): ListNode = {
      var last :ListNode= null
      var now = head
      var next: ListNode = null
      while(now != null){
        next = now.next
        now.next = last
        last = now
        now = next
      }
      return last
    }
}
//leetcode submit region end(Prohibit modification and deletion)
