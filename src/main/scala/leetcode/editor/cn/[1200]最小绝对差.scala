//给你个整数数组 arr，其中每个元素都 不相同。 
//
// 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [4,2,1,3]
//输出：[[1,2],[2,3],[3,4]]
// 
//
// 示例 2： 
//
// 输入：arr = [1,3,6,10,15]
//输出：[[1,3]]
// 
//
// 示例 3： 
//
// 输入：arr = [3,8,-10,23,19,-4,-14,27]
//输出：[[-14,-10],[19,23],[23,27]]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 10^5 
// -10^6 <= arr[i] <= 10^6 
// 
// Related Topics 数组






































































































//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
    def minimumAbsDifference(arr: Array[Int]): List[List[Int]] = {
      import scala.collection.mutable.ListBuffer
      val listBuffer = new ListBuffer[List[Int]]()
      val sort = arr.sorted
      var min = Int.MaxValue
      for(i<- 0 to sort.size - 2){
        val mayByMin = math.abs(sort(i+1) - sort(i))
        if(mayByMin < min) {
          listBuffer.clear()
          listBuffer.append(List(sort(i), sort(i+1)))
          min = mayByMin
        }else if(mayByMin == min){
          listBuffer.append(List(sort(i), sort(i+1)))
        }
      }
      listBuffer.toList
    }
}
//leetcode submit region end(Prohibit modification and deletion)
