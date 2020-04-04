//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。  示例 1:  输入: "hello" 输出: "holle" 示例 2:  输入: "leetcode" 输出: "leotcede"  说明: 元音字母不包含字母"y"。 Related Topics 双指针 字符串


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def reverseVowels(s: String): String = {
    val list = List('a', 'e', 'i', 'o', 'u')
    val arr = s.toArray
    var start = 0
    var end = s.size - 1
    while (start < end) {
      while (!list.contains(arr(start).toLower) && start < end) {
        start += 1
      }
      while (!list.contains(arr(end).toLower) && start < end) {
        end -= 1
      }
      if (start < end) {
        println("==" + arr(start))
        println("--" + arr(end))
        val tmp = arr(start)
        arr(start) = arr(end)
        arr(end) = tmp
      }
      start += 1
      end -= 1
    }

    return arr.mkString
  }
}

//leetcode submit region end(Prohibit modification and deletion)
