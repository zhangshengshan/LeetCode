import scala.collection.mutable
//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
// 示例 1： 
// 输入：text = "nlaebolko"
//输出：1
// 示例 2： 
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
// Related Topics 哈希表 字符串






































































































//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def maxNumberOfBalloons(text: String): Int = {
    // balloon
    val mymap= scala.collection.mutable.Map[Char,Int]()
    for (item <- text) {
      if( Array('a','b','l','n','o').contains( item )){
        if(mymap.contains(item)){
          mymap(item) += 1
        }else{
          mymap(item) = 1
        }
      }
    }
    val ints = mymap.map(x => if (x._1 == 'o' || x._1 == 'l') x._2 / 2 else x._2)
    if(ints.size  == 5) ints.min else 0
  }
}
//leetcode submit region end(Prohibit modification and deletion)
