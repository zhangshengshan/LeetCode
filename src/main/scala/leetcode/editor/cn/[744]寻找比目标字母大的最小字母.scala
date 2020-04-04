//给定一个只包含小写字母的有序数组letters 和一个目标字母 target，
//寻找有序数组里面比目标字母大的最小字母。 
// 在比较时，
// 数组里字母的是循环有序的。举个例子： 
// 如果目标字母 target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。 
// 如果目标字母 target = 'n' 并且有序数组为 letters = ['m', 'z', 'c', 'f', 'j'] ，
// 则答案返回 'z' 。 
// 示例： 
// 输入:
//letters = ["c", "f", "j"]
//target = "a"
//输出: "c"
//输入:
//letters = ["c", "f", "j"]
//target = "c"
//输出: "f"
//输入:
//letters = ["c", "f", "j"]
//target = "d"
//输出: "f"
//输入:
//letters = ["c", "f", "j"]
//target = "g"
//输出: "j"
//输入:
//letters = ["c", "f", "j"]
//target = "j"
//输出: "c"
//输入:
//letters = ["c", "f", "j"]
//target = "k"
//输出: "c"
// 提示： 
// letters长度范围在[2, 10000]区间内。 
// letters 仅由小写字母组成，最少包含两个不同的字母。 
// 目标字母target 是一个小写字母。 
// 
// Related Topics 二分查找


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def nextGreatestLetter(letters: Array[Char], target: Char): Char = {

    var left = 0
    var right = letters.length - 1

    while (left < right) {
      val mid = (left + right) >> 1
      if (letters(mid) > target) {
        if (mid == 0) return letters(mid)
        else if (letters(mid - 1) <= target) return letters(mid)
        else {
          right = mid - 1
        }
      } else {
        left = mid + 1
      }
    }
    if (letters(left) > target) letters(left) else letters(0)
  }
}

//leetcode submit region end(Prohibit modification and deletion)
