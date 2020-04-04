//写一个程序，输出从 1 到 n 数字的字符串表示。 
//
// 1. 如果 n 是3的倍数，输出“Fizz”； 
//
// 2. 如果 n 是5的倍数，输出“Buzz”； 
//
// 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。 
//
// 示例： 
//
// n = 15,
//
//返回:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
// 
//


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def fizzBuzz(n: Int): List[String] = {
    var l: List[String] = List()
    for (i <- (1 to n).reverse) {
      if (i % 3 == 0 && i % 5 == 0) {
        l = "FizzBuzz" :: l
      } else if (i % 3 == 0) {
        l = "Fizz" :: l
      } else if (i % 5 == 0) {
        l = "Buzz" :: l
      } else {
        l = i.toString :: l
      }
    }
    l
  }
}

//leetcode submit region end(Prohibit modification and deletion)
