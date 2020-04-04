/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 * var next: ListNode = null
 * var x: Int = _x
 * }
 */
object Solution {
  def removeElements(head: ListNode, `val`: Int): ListNode = {
    val value = `val`
    var newHead = head

    if (head == null) return null
    while (newHead != null && newHead.x == value) {
      newHead = newHead.next
    }

    var last = newHead
    var cur = newHead

    while (cur != null) {
      if (cur.x == value) {
        last.next = cur.next
      } else {
        last = cur
      }
      cur = cur.next
    }

    return newHead
  }
}

//leetcode submit region end(Prohibit modification and deletion)
