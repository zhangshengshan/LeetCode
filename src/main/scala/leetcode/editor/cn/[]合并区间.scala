//给出一个区间的集合，请合并所有重叠的区间。 
//
// 示例 1: 
//
// 输入: [[1,3],[2,6],[8,10],[15,18]]
//输出: [[1,6],[8,10],[15,18]]
//解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
// 
//
// 示例 2: 
//
// 输入: [[1,4],[4,5]]
//输出: [[1,5]]
//解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。 
// Related Topics 排序 数组


object Solution {
  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {

    import scala.collection.mutable.ArrayBuffer

    val myArray = new ArrayBuffer[Array[Int]]

    val array: Array[Array[Int]] = intervals.sortBy(x => x(0))

    if (intervals.length <= 1) return intervals
    var i = 0
    var j = 1

    while (i < array.length && j < array.length) {

      println(array(i)(1))
      println(array(j)(1))
      if (array(i)(1) >= array(j)(0)) {


        array(i)(1) = math.max(array(i)(1), array(j)(1))
        array(i)(0) = math.min(array(i)(0), array(j)(0))
        j += 1

      } else {

        myArray.append(array(i))
        i = j
        j += 1

      }

    }

    myArray.append(array(i))
    myArray.toArray

  }
}
