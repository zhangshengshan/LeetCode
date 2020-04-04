//给定两个数组，编写一个函数来计算它们的交集。 
//
// 示例 1: 
//
// 输入: nums1 = [1,2,2,1], nums2 = [2,2]
//输出: [2,2]
// 
//
// 示例 2: 
//
// 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出: [4,9] 
//
// 说明： 
//
// 
// 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。 
// 我们可以不考虑输出结果的顺序。 
// 
//
// 进阶: 
//
// 
// 如果给定的数组已经排好序呢？你将如何优化你的算法？ 
// 如果 nums1 的大小比 nums2 小很多，哪种方法更优？ 
// 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？ 
// 
// Related Topics 排序 哈希表 双指针 二分查找


//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    var ret: List[Int] = List[Int]()
    val sorted1: Array[Int] = nums1.sorted
    val sorted2: Array[Int] = nums2.sorted
    var i = 0
    var j = 0
    while (i < sorted1.length && j < sorted2.length) {
      if (sorted1(i) > sorted2(j)) {
        j+= 1
      } else if (sorted1(i) < sorted2(j)) {
        i+= 1
      } else {
        ret = sorted1(i)::ret
        i+= 1
        j+= 1
      }
    }
    return ret.toArray
  }
}

//leetcode submit region end(Prohibit modification and deletion)
