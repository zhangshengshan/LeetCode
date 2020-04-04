//集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重
//复。 
//
// 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。 
//
// 示例 1: 
//
// 
//输入: nums = [1,2,2,4]
//输出: [2,3]
// 
//
// 注意: 
//
// 
// 给定数组的长度范围是 [2, 10000]。 
// 给定的数组是无序的。 
// 
// Related Topics 哈希表 数学


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {

  def findErrorNums(nums: Array[Int]): Array[Int] = {
    val mymap = scala.collection.mutable.Map[Int, Int]()
    var dup = 0
    import util.control.Breaks._
    breakable {
      for (i <- 0 to nums.length - 1) {
        if (!mymap.contains(nums(i))) mymap(nums(i)) = 1
        else {
          dup = nums(i)
          break
        }
      }
    }
    val i: Int = nums.sum - dup
    val missing = (1 + nums.size) * nums.size / 2 - i
    Array(dup, missing)
bb
cc
dd
ee
ff
gg
aa
ii
  }
}

//leetcode submit region end(Prohibit modification and deletion)
