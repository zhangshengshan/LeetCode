//leetcode submit region begin(Prohibit modification and deletion)
object Solution {

  def addBinary(a: String, b: String): String = {
    val maxLength: Int = math.max(a.length, b.length)
    val minLength: Int = math.min(a.length, b.length)
    val ret = new Array[Char](maxLength)
    val (longStr,shortStr) = if (maxLength == a.length) (a,b) else (b,a)

    var carry = '0'
    var i = minLength - 1
    while (i >= 0) {
      println(longStr(i + maxLength - minLength))
      println(shortStr(i))
      val tuple: (Char, Char) = getChar(longStr(i + maxLength - minLength), shortStr(i), carry)
      carry = tuple._1
      ret(i + maxLength - minLength) = tuple._2
      i = i - 1
    }
    i = maxLength - minLength - 1
    while (i >= 0) {
      val tuple: (Char, Char) = getChar(longStr(i), '0', carry)
      carry = tuple._1
      ret(i) = tuple._2
      i = i - 1
    }
    for (elem <- ret) {
      //      println(elem)
    }
    if (carry == '1') {
      return "1" + ret.mkString("")
    } else {
      return ret.mkString("")
    }
  }

  def char2int(a: Char): Int = {
    a.toString.toInt
  }

  def getChar(a: Char, b: Char, c: Char): (Char, Char) = {
    val num: Int = a.toString.toInt + b.toString.toInt + c.toString.toInt
//    println(num)
    if (num == 0) return ('0', '0')
    if (num == 1) return ('0', '1')
    if (num == 2) return ('1', '0')
    if (num == 3) return ('1', '1')
    return ('1', '0')
  }

  def main(args: Array[String]): Unit = {
    println(addBinary("10", "11"))
  }
}

//leetcode submit region end(Prohibit modification and deletion)

