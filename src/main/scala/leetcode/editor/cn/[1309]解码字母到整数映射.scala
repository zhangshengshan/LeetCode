//给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符： 
<<<<<<< HEAD
//
// 
// 字符（'a' - 'i'）分别用（'1' - '9'）表示。 
// 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
// 
//
// 返回映射之后形成的新字符串。 
//
// 题目数据保证映射始终唯一。 
//
// 
//
// 示例 1： 
//
// 输入：s = "10#11#12"
//输出："jkab"
//解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
// 
//
// 示例 2： 
//
// 输入：s = "1326#"
//输出："acz"
// 
//
// 示例 3： 
//
// 输入：s = "25#"
//输出："y"
// 
//
// 示例 4： 
//
=======
// 
// 字符（'a' - 'i'）分别用（'1' - '9'）表示。 
// 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
//
// 返回映射之后形成的新字符串。 
// 题目数据保证映射始终唯一。 
// 示例 1： 
// 输入：s = "10#11#12"
//输出："jkab"
//解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
// 示例 2： 
// 输入：s = "1326#"
//输出："acz"
// 示例 3： 
// 输入：s = "25#"
//输出："y"
// 示例 4： 
>>>>>>> 2392a866852869394739dc4fd756a8e270293df8
// 输入：s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
//输出："abcdefghijklmnopqrstuvwxyz"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s[i] 只包含数字（'0'-'9'）和 '#' 字符。 
// s 是映射始终存在的有效字符串。 
// 
<<<<<<< HEAD
// Related Topics 字符串 
// 👍 29 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def freqAlphabets(s: String): String = {

    import scala.collection.mutable.ArrayBuffer
    val myArrayBuffer = new ArrayBuffer[Char]()
    val aInt = 'a'.toInt
    val oneInt = '1'.toInt
    var idx = 0
    while (idx < s.length) {

      println(s(idx))

      if (s(idx) == '1' || s(idx) == '2') {
        // j - z Char
        // x - 'a' = num - '1'
        // x = num + 'a' - '1'
        if (idx + 2 < s.length && s(idx + 2) == '#') {
          println(s(idx), s(idx + 1))
          val newChar = (s(idx) - '0') * 10 + (s(idx + 1) - '1') + 'a'
          myArrayBuffer.append(newChar.toChar)
          idx += 2
        } else {
          myArrayBuffer.append((aInt + s(idx) - oneInt).toChar)
        }
      } else {
        myArrayBuffer.append((aInt + s(idx) - oneInt).toChar)
      }

      idx += 1
    }
    myArrayBuffer.mkString
  }
}

//leetcode submit region end(Prohibit modification and deletion)
=======
// Related Topics 字符串






































































































object Solution {
    def freqAlphabets(s: String): String = {

      import scala.collection.mutable.ArrayBuffer 
      val myArrayBuffer = new ArrayBuffer[Char]()
      val aInt = 'a'.toInt
      val oneInt = '1'.toInt
      var idx = 0 
      while( idx < s.length ){
        println("s(idx)", s(idx))
        if( s(idx) == '1' || s(idx) == '2' ) {
          // j - z Char
          if(idx + 2 < s.length && s(idx)== '#'){
            idx += 2
            myArrayBuffer.append( ((s(idx) - '0' ) * 10 + (s(idx+1) - '0') + aInt - oneInt ).toChar )
          } else{
            myArrayBuffer.append( (aInt + s(idx) - oneInt ).toChar )
          }
        } else {
          myArrayBuffer.append( (aInt + s(idx) - oneInt ).toChar )
        }

        idx += 1
      }
      myArrayBuffer.mkString
    }
}
>>>>>>> 2392a866852869394739dc4fd756a8e270293df8
