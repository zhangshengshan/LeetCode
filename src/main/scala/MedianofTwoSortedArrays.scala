object MedianofTwoSortedArrays {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val c =  nums1 ++ nums2 sorted

    if ( c.length % 2 == 0 ) return (c(c.length /2) + c(c.length/2-1))/2.0
    else return c(c.length /2)
  }
  def findMedianSortedArrays1(nums1: Array[Int], nums2: Array[Int]): Double = {
    val len1 = nums1.length
    val len2 = nums2.length
    val nums3 = Array[Int]()
    var i = 0
    var j = 0
    var tmpa = nums1(0)
    var tmpb = nums2(0)
    while ( i + j <= (len1 + len2)/2){
      if ( nums1(i) < nums2(j)) {
        tmpa = nums1(i)
        i= i + 1
      } else {
        tmpa = nums2(j)
        j = j + 1
      }
    }
    return 1.0
  }

  def main(args: Array[String]): Unit = {
    println( findMedianSortedArrays1(Array(0,3,6),Array(1,2)))
//    println( findMedianSortedArrays(Array(0,3),Array(1)))
  }
}
