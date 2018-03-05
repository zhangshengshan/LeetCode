object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val tmpList = for ( i <- 0 until nums.length -1 ; j <- i + 1 until nums.length if nums(i) + nums(j) == target) yield Array(i,j)
    tmpList.headOption.getOrElse(Array())
  }

  def twoSum1(nums: Array[Int], target: Int): Array[Int] = {
    val map = new scala.collection.mutable.HashMap[Int,Int]
    for ( i <- 0 until nums.length ) {
      map(nums(i)) = i
    }
    for ( i <- 0 until nums.length ) {
      if ( map.contains( target - nums(i))){
        return Array(i, map(target - nums(i)))
      }
    }
    return Array()
  }

  def twoSum2(nums: Array[Int], target: Int): Array[Int] = {
    val map = new scala.collection.mutable.HashMap[Int,Int]
    for ( i <- 0 until nums.length ) {
      if ( map.contains( target - nums(i))){
        return Array(i, map(target - nums(i)))
      }else{
        map(nums(i)) = i
      }
    }
    return Array()
  }
  def main(args: Array[String]): Unit = {
    val aa = twoSum2(Array(1,2,3,4),3)
    println(aa.length)
    println("==============================")
    aa.toList.foreach(println)
  }
}
