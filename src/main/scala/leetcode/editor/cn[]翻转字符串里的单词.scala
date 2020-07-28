//给定一个字符串，逐个翻转字符串中的每个单词。 
//
// 
//
// 示例 1： 
//
// 输入: "the sky is blue"
//输出: "blue is sky the"
// 
//
// 示例 2： 
//
// 输入: "  hello world!  "
//输出: "world! hello"
//解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
// 
//
// 示例 3： 
//
// 输入: "a good   example"
//输出: "example good a"
//解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
// 
//
// 
//
// 说明： 
//
// 
// 无空格字符构成一个单词。 
// 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。 
// 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。 






































































































object Solution {
  def reverseWords(s: String): String = {
    import scala.collection.mutable.ArrayBuffer 
    val myArrayBuffer = new ArrayBuffer[Char]()
    var i = s.length - 1
    var isFirst = true
    while( i>= 0 ){
      if(s(i) == ' '){
        i -= 1
      }else{
        var j = i 
        while(j-1 >= 0 && s(j-1) != ' '){
          j-= 1
        }
        for (idx <- j to i) {
          myArrayBuffer.append(s(idx))
        }
        myArrayBuffer.append(' ')
        println(i,j)
        i = j 
        i -= 1
      }
    }
    myArrayBuffer.slice(0, myArrayBuffer.length-1).mkString
  }
}
