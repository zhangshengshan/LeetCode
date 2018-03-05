
object addTwoNumbers {


  def addTwoNumbersRec(l1:ListNode, l2:ListNode, add:Int):ListNode = {
    val l1x = if (l1== null) 0 else l1.x
    val l2x = if (l2== null) 0 else l2.x
    val add_next = if (l1x + l2x  + add >= 10 ) 1 else 0
    val tmp = (l1x + l2x + add ) % 10
    val ret = ListNode( tmp )


    if( l1.next == null && l2.next == null ) if( add_next == 0 ) ret.next = null else ret.next = new ListNode(1)
    else if (l1.next == null && l2.next != null) ret.next = addTwoNumbersRec(new ListNode(), l2.next , add_next)
    else if (l1.next != null && l2.next == null) ret.next = addTwoNumbersRec(l1.next, new ListNode(), add_next)
    else ret.next = addTwoNumbersRec(l1.next,l2.next,add_next)

    ret
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    return addTwoNumbersRec(l1, l2, 0)
  }

  def myTailSum(listNode: ListNode, fac:Int = 1):Int= {
    var ret :Int = 0
    listNode match  {
      case ListNode(v, next) =>  if ( next != null) v * fac + myTailSum(next, fac * 10 ) else v * fac
    }
  }

  def main(args: Array[String]): Unit = {

//    val a = ListNode(1)
//
//    val b = ListNode(9)
//    b.next = ListNode(9)
//
//    val aaa = addTwoNumbers(a,b )
//    println(aaa.next)

  }
}
