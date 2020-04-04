
//给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
//
// 
//示例:
//输入: S = "a1b2"
//输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
//
//输入: S = "3z4"
//输出: ["3z4", "3Z4"]
//
//输入: S = "12345"
//输出: ["12345"]
// 
//
// 注意： 
//
// 
// S 的长度不超过12。
//// S 仅由数字和字母组成。
////
//// Related Topics 位运算 回溯算法


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def letterCasePermutation(S: String): List[String] = {
    if (S.length == 0) return List("")
    val strings: List[String] = letterCasePermutation(S.slice(1, S.length))
    if (S(0).isLetter) strings.flatMap(x => List(S(0).toLower + x, S(0).toUpper + x))
    else strings.map(x => S(0) + x)
  }

  //    import scala.collection.mutable.ArrayBuffer
  //    val myArrayBuffer = new ArrayBuffer[String]()
  //    import scala.collection.mutable.Queue
  //    val myqueue = new Queue[String]()
  //    myqueue.enqueue("")
  //    for (item <- S) {
  //      val strings = myqueue.dequeueAll(_ => true)
  //      val tmp = if (item.isLetter) {
  //        strings.map(x => x + item.toLower) ++ strings.map(x => x + item.toUpper)
  //      } else {
  //        strings.map(x => x + item)
  //      }
  //      tmp.foreach(x => myqueue.enqueue(x))
  //    }
  //    myqueue.toList
  //  }
}

//leetcode submit region end(Prohibit modification and deletion)
