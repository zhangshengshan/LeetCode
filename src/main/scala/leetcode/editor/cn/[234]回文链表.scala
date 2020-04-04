//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 class ListNode(var _x: Int = 0) {
 var next: ListNode = null
 var x: Int = _x
 }
 */
object Solution {
  def reverse(head: ListNode): ListNode = {
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

  def isPalindrome(head: ListNode): Boolean = {
    var fast = head
    var slow = head
    while (fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
    }
    //此时slow是分界点
    var pList = reverse(slow.next)
    var pOld = head
    while (pList != null) {
      if (pList.x != head.x) return false
      pList = pList.next
      pOld = pOld.next
    }
    return true
  }
}

//leetcode submit region end(Prohibit modification and deletion)
