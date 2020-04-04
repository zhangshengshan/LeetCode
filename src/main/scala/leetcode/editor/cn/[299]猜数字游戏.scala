//你正在和你的朋友玩 猜数字（Bulls and Cows）游戏：你写下一个数字让你的朋友猜。每次他猜测后，你给他一个提示，告诉他有多少位数字和确切位置都猜对
//了（称为“Bulls”, 公牛），有多少位数字猜对了但是位置不对（称为“Cows”, 奶牛）。你的朋友将会根据提示继续猜，直到猜出秘密数字。 
//
// 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，用 A 表示公牛，用 B 表示奶牛。 
//
// 请注意秘密数字和朋友的猜测数都可能含有重复数字。 
//
// 示例 1: 
//
// 输入: secret = "1807", guess = "7810"
//
//输出: "1A3B"
//
//解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。 
//
// 示例 2: 
//
// 输入: secret = "1123", guess = "0111"
//
//输出: "1A1B"
//
//解释: 朋友猜测数中的第一个 1 是公牛，第二个或第三个 1 可被视为奶牛。 
//
// 说明: 你可以假设秘密数字和朋友的猜测数都只包含数字，并且它们的长度永远相等。 
// Related Topics 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def getHint(secret: String, guess: String): String = {
    var numBulls = 0
    var numCols = 0
    val mymap1 = scala.collection.mutable.Map[Char, Int]()
    val mymap2 = scala.collection.mutable.Map[Char, Int]()
    for (i <- 0 until secret.size) {
      if (secret(i) == guess(i)) {
        numBulls += 1
      } else {
        if (mymap1.contains(secret(i))) mymap1(secret(i)) += 1 else mymap1(secret(i)) = 1
        if (mymap2.contains(guess(i))) mymap2(guess(i)) += 1 else mymap2(guess(i)) = 1
      }
    }
    for (elem <- mymap1) {
      if (mymap2.contains(elem._1)) {
        numCols += math.min(elem._2, mymap2(elem._1))
      }
    }
    return numBulls.toString + "A" + numCols.toString + "B"
  }
}

//leetcode submit region end(Prohibit modification and deletion)
