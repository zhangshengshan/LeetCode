//给出一个字符串数组words组成的一本英语词典。从中找出最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。若其中有多个可行的答案，则返
//回答案中字典序最小的单词。 
//
// 若无答案，则返回空字符串。 
//
// 示例 1: 
//
// 
//输入: 
//words = ["w","wo","wor","worl", "world"]
//输出: "world"
//解释: 
//单词"world"可由"w", "wo", "wor", 和 "worl"添加一个字母组成。
// 
//
// 示例 2: 
//
// 
//输入: 
//words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
//输出: "apple"
//解释: 
//"apply"和"apple"都能由词典中的单词组成。但是"apple"得字典序小于"apply"。
// 
//
// 注意: 
//
// 
// 所有输入的字符串都只包含小写字母。 
// words数组长度范围为[1,1000]。 
// words[i]的长度范围为[1,30]。 
// 
// Related Topics 字典树 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def allExt(mymap: scala.collection.mutable.Map[String, Int], str: String): Boolean = {
    (1 to str.size - 1).forall(x => mymap.contains(str.slice(0, x)))
  }

  def longestWord(words: Array[String]): String = {
    var maxString = ""
    val mymap = scala.collection.mutable.Map[String, Int]()
    for (item <- words) {
      mymap(item) = item.length
    }
    for (item <- mymap) {
      val (str, length) = item
      if (allExt(mymap, str)) {
        if (str.length > maxString.length) maxString = str
        else if (str.length == maxString.length) {
          if (str <= maxString) {
            maxString = str
          }
        }
      }
    }
    return maxString
  }
}

//leetcode submit region end(Prohibit modification and deletion)
