//设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 
// push(x) -- 将元素 x 推入栈中。 
// pop() -- 删除栈顶的元素。 
// top() -- 获取栈顶元素。 
// getMin() -- 检索栈中的最小元素。 
// 
//
// 示例: 
//
// MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
// Related Topics 栈 设计


//leetcode submit region begin(Prohibit modification and deletion)
class MinStack() {

    /** initialize your data structure here. */
    import scala.collection.mutable.Stack
    val dataStack = new Stack[Int]()
    val minStack = new Stack[Int]()
    
    def push(x: Int) {
      dataStack.push(x)
      if(minStack.isEmpty) minStack.push(x)
      else minStack.push(math.min(x, minStack.top))
    }

    def pop() {
      if(dataStack.nonEmpty) {
        minStack.pop;
        dataStack.pop;
      }
    }

    def top(): Int = {
      if(dataStack.nonEmpty){
        dataStack.top
      }else{
        Int.MaxValue
      }
    }

    def getMin(): Int = {
      if(minStack.nonEmpty) return minStack.top else Int.MaxValue
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
//leetcode submit region end(Prohibit modification and deletion)
//
//
//["MinStack" , "push" , "push" , "push" , "push" , "getMin" , "pop" , "getMin" , "pop" , "getMin" , "pop" , "getMin"]
//[[]         , [2]    , [0]    , [3]    , [0]    , []       , []    , []       , []    , []       , []    , []]
