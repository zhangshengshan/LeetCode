//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。 
//
// 注意： 
//
// 
// num1 和num2 的长度都小于 5100. 
// num1 和num2 都只包含数字 0-9. 
// num1 和num2 都不包含任何前导零。 
// 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。 
// 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  implicit def char2int(c: Char): Int = {
    c.toInt - 48
  }

  implicit def int2char(i: Int): Char = {
    (i + 48).toChar
  }

  def addStrings(num1: String, num2: String): String = {

    val longArr = if (num1.size >= num2.size) num1.toArray else num2.toArray
    val shortArr = if (num1.size < num2.size) num1.toArray else num2.toArray

    var i = longArr.size - 1
    var j = shortArr.size - 1
    var carry = 0
    while (i >= 0 && j >= 0) {
      val sum = char2int(longArr(i)) + char2int(shortArr(j)) + carry
      longArr(i) = int2char(sum % 10)
      carry = sum / 10
      i -= 1
      j -= 1
    }
    while (carry != 0 && i >= 0) {
      val sum = char2int(longArr(i)) + carry
      longArr(i) = int2char(sum % 10)
      carry = sum / 10
      i -= 1
    }

    println(longArr.mkString)
    if (carry == 0) return longArr.mkString
    else return "1" + longArr.mkString

  }

  def main(args: Array[String]): Unit = {
    println(addStrings("99", "9"))
  }
}


//leetcode submit region end(Prohibit modification and deletion)
