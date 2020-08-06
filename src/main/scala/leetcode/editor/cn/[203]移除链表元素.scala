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
    val tmpHead = new ListNode(Int.MaxValue)
    tmpHead.next = head
    var cur = head
    var last = tmpHead

    while (cur != null) {
      val next = cur.next
      if (cur.x == value) {
        last.next = cur.next
      } else {
        last = cur
      }
      cur = next
    }

    return tmpHead.next

  }
}

