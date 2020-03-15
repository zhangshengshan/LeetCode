
//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 * var next: ListNode = null
 * var x: Int = _x
 * }
 */
//class ListNode(var _x: Int = 0) {
//  var next: ListNode = null
//  var x: Int = _x
//}

object Solution {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {

    if (l1 == null) return l2
    if (l2 == null) return l1
    if (l1 == null && l2 == null) return null
    var head: ListNode = null
    var cur: ListNode = null
    var t1 = l1
    var t2 = l2

    //HEAD NODE
    if (l1.x <= l2.x) {
      head = l1
      t1 = l1.next
    } else {
      head = l2
      t2 = l2.next
    };
    cur = head

    while (t1 != null && t2 != null) {
      if (t1.x <= t2.x) {
        cur.next = t1
        cur = cur.next
        t1 = t1.next
      } else {
        cur.next = t2
        cur = cur.next
        t2 = t2.next
      }
    }
    cur.next = if(t1!=null) t1 else t2
    return head
  }

  def mergeTwoLists2(l1: ListNode, l2: ListNode): ListNode = {
    (l1, l2) match {
      case (null, null) => null
      case (null, y) => y
      case (x, null) => x
      case (x, y) => {
        val tmp = new ListNode()
        if (x.x <= y.x) {
          tmp.x = x.x
          tmp.next = mergeTwoLists(x.next, y)
        } else {
          tmp.x = y.x
          tmp.next = mergeTwoLists(x, y.next)
        }
        return tmp
      }
    }
  }
}

//leetcode submit region end(Prohibit modification and deletion)
