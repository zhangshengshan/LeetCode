//假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。 
// 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True
//，不能则返回False。 
//
// 示例 1: 
//
// 
//输入: flowerbed = [1,0,0,0,1], n = 1
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: flowerbed = [1,0,0,0,1], n = 2
//输出: False
// 
//
// 注意: 
//
// 
// 数组内已种好的花不会违反种植规则。 
// 输入的数组长度范围为 [1, 20000]。 
// n 是非负整数，且不会超过输入数组的大小。 
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)





































































































object Solution {
    def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
      var i = 0 
      val exist_sum = flowerbed.sum
      var num = 0 
      while(i<flowerbed.length){
        if(flowerbed(i) == 0){
          if(i==0 ){
            if( flowerbed.length == 1 ) flowerbed(i) = 1
            else if(flowerbed(i+1)==0) flowerbed(i) = 1
          }
          else if(i==flowerbed.length-1 ){
            if( flowerbed.length ==1) flowerbed(i) = 1
            else if(flowerbed(i-1) == 0 ) flowerbed(i) = 1
          }
          else { 
            if(flowerbed(i-1) == 0 && flowerbed(i+1) ==0) flowerbed(i) = 1 
          }
        }
        i += 1
      }
      flowerbed.foreach(println)
      val new_place_num = flowerbed.sum - exist_sum
//      println("new_place_num", new_place_num)
//      println("exist_sum", exist_sum)
      new_place_num >= n 
    }
}
//leetcode submit region end(Prohibit modification and deletion)
