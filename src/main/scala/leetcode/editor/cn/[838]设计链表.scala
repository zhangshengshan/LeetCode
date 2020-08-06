//设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针
///引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。 
//
// 在链表类中实现这些功能： 
//
// 
// get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。 
// addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。 
// addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。 
// addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val 的节点。如果 index 等于链表的长度，则该节点将附加
//到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。 
// deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。 
// 
//
// 
//
// 示例： 
//
MyLinkedList linkedList = new MyLinkedList();
MlinkedList.addAtHead(1);
MlinkedList.addAtTail(3);
//linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
//linkedList.get(1);            //返回2
//linkedList.deleteAtIndex(1);  //现在链表是1-> 3
//linkedList.get(1);            //返回3
// 
//
//
// 提示： 
//
// 


class MyLinkedList() {
  class ListNode(v:Int) {
    val x :Int = v
    var next :ListNode = null 
    var prev :ListNode = null
  }
  /** Initialize your data structure here. */

  val head = new ListNode(Int.MaxValue)
  val tail = new ListNode(Int.MinValue)

  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  def get(index: Int): Int = {

  }

  /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  def addAtHead(`val`: Int) {

  }

  /** Append a node of value val to the last element of the linked list. */
  def addAtTail(`val`: Int) {

  }

  /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
  def addAtIndex(index: Int, `val`: Int) {

  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  def deleteAtIndex(index: Int) {

  }

  def walk(){

  }

  def reverseWalk(){

  }
}
//var obj = new MyLinkedList()
//obj.addAtHead(1)
//obj.addAtTail(2)
//obj.addAtIndex(1,3)
//val obj = new MyLinkedList()
//obj.addAtHead(7)
//obj.addAtHead(2)
//obj.addAtHead(1)
//obj.addAtIndex(3,0)
//obj.deleteAtIndex(2)
//obj.addAtHead(6)
//obj.addAtTail(4)
//obj.get(4)
//obj.addAtHead(4)
//obj.addAtIndex(5,0)
//obj.addAtHead(6)
