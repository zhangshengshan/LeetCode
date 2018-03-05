
class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object ListNode{
  def apply( _x: Int = 0 ): ListNode = new ListNode( _x )
  def unapply(arg: ListNode):Option[(Int,ListNode)] = {
    Some(arg.x, arg.next)
  }
}
