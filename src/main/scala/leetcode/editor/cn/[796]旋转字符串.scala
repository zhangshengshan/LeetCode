//给定两个字符串, A 和 B。 
//
//
//
//
//
// A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后
//，A 能变成B，那么返回True。 
//
// 
//示例 1:
//输入: A = 'abcde', B = 'cdeab'
//输出: true
//
//示例 2:
//输入: A = 'abcde', B = 'abced'
//输出: false 
//
// 注意： 
//
// 
// A 和 B 长度不超过 100。 
// 
//


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def rotateString(A: String, B: String): Boolean = {
    if (A.length != B.length) false else {
      if ((A + A).contains(B)) return true else false
    }
    //    if(A.length != B.length) return false
    //    val mymap = scala.collection.mutable.Map[(Char, Char), Int]()
    //    for (i <- 0 to A.length - 1) {
    //      val start = i
    //      val end = (i + 1) % A.length
    //      val PairA = (A(start), A(end))
    //      val PairB = (B(start), B(end))
    //      if (mymap.contains(PairA)) mymap(PairA) += 1
    //      else mymap(PairA) = 1
    //      if (mymap.contains(PairB)) mymap(PairB) -= 1
    //      else mymap(PairB) = -1
    //    }
    //    mymap.forall(x => x._2 == 0)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
