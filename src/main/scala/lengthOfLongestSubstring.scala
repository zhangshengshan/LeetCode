import scala.collection.mutable
import util.control.Breaks._
object lengthOfLongestSubstring {
  def lengthOfLongestSubstring(s: String): Int = {
    val map = new scala.collection.mutable.HashMap[Char,Int]()
    var max = 0
    for ( i <- 0 until s.length) {
      map.clear()
      breakable{
        for ( j <- i until s.length) {
          if (map contains s(j)) break() else map(s(j)) = 1
        }
      }
      if ( map.keySet.toList.length > max ) max = map.keySet.toList.length
    }
    return max
  }
  def lengthOfLongestSubstring1(s:String, len:Int) :Int = {
    val set = new mutable.HashMap[Char,Int]()
    var max = 0
    var i = 0
    var j = 0
    while (  i < s.length && j < s.length ){
      if (  set.contains(s(j)) ) {
        set.remove(s(i))
        i = i + 1
      }
      else {
        set(s(j)) = 1
        if ( j - i + 1 > max) max = j - i + 1
        j = j + 1
      }
    }
    max
  }
  def main(args: Array[String]): Unit = {
    println(lengthOfLongestSubstring1("pwwkew",2 ))
  }
}
