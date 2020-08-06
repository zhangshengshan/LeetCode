//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 示例 1: 
//
// 
//输入: "Let's take LeetCode contest"
//输出: "s'teL ekat edoCteeL tsetnoc" 
// 
//
// 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。 




































































































object Solution {

  def reverseWords(s: String): String = {

    var arr = s.toArray

    var slow = 0 
    var fast = 0 

    while( slow < arr.length && fast < arr.length ){

      while( arr(slow) == ' ' ){
        slow += 1
      }

      fast = slow 

      while(fast < arr.length && arr(fast) != ' '){
        println(s"fast = ${fast}")
        fast += 1
      }

      var swap = fast - 1

      while( slow < swap ){
        println(s" slow = ${slow} and fast = ${fast} and swap = ${swap}" )
        val tmp = arr(slow)
        arr(slow) = arr(swap)
        arr(swap) = tmp 
        slow += 1
        swap -= 1
      }
    
      slow = fast
    }
    arr.mkString
  }
}
