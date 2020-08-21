//给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。 
//
// 示例 1: 
//
// 输入: 1->2->3->4->5->NULL, k = 2
//输出: 4->5->1->2->3->NULL
//解释:
//向右旋转 1 步: 5->1->2->3->4->NULL
//向右旋转 2 步: 4->5->1->2->3->NULL
// 
//
// 示例 2: 
//
// 输入: 0->1->2->NULL, k = 4
//输出: 2->0->1->NULL
//解释:
//向右旋转 1 步: 2->0->1->NULL
//向右旋转 2 步: 1->2->0->NULL
//向右旋转 3 步: 0->1->2->NULL
//向右旋转 4 步: 2->0->1->NULL 


// Definition for singly-linked list.
// class ListNode(var _x: Int = 0) {
//   var next: ListNode = null
//   var x: Int = _x
// }





































































































object Solution {
  def rotateRight(head: ListNode, k: Int): ListNode = {

    if(head == null) return head
    var fast = head 
    var cnt = k 

    while( cnt > 0 ){
      if( fast.next == null ){
        fast = head
      }else{
        fast = fast.next
      }
      cnt -= 1
    }

    var slow = head 
    while(fast.next != null) {
      fast = fast.next 
      slow = slow.next
    }

    fast.next = head 

    val newHead = slow.next
    slow.next = null

    return newHead
  }
}
