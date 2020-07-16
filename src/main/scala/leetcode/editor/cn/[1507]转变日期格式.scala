//给你一个字符串 date ，它的格式为 Day Month Year ，其中： 
// Day 是集合 {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"} 中的一个元素。 
// Month 是集合 {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oc
//t", "Nov", "Dec"} 中的一个元素。 
// Year 的范围在 [1900, 2100] 之间。 
// 请你将字符串转变为 YYYY-MM-DD 的格式，其中： 
// YYYY 表示 4 位的年份。 
// MM 表示 2 位的月份。 
// DD 表示 2 位的天数。 
// 
//
// 
//
// 示例 1： 
//
// 输入：date = "20th Oct 2052"
//输出："2052-10-20"
// 
//
// 示例 2： 
//
// 输入：date = "6th Jun 1933"
//输出："1933-06-06"
// 
//
// 示例 3： 
//
// 输入：date = "26th May 1960"
//输出："1960-05-26"
// 
//
// 
//
// 提示： 
//
// 
// 给定日期保证是合法的，所以不需要处理异常输入。 
// 
// Related Topics 字符串






































































































//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
  def reformatDate(date: String): String = {
    // Day 是集合 {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"} 中的一个元素。 
    // Month 是集合 {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"} 中的一个元素。 
    // Year 的范围在 [1900, 2100] 之间。 
    val dayMap = Map[String,String](
      "1st" ->   "01"
      ,"2nd" ->  "02"
      ,"3rd" ->  "03"
      ,"4th" ->  "04"
      ,"5th" ->  "05"
      ,"6th" ->  "06"
      ,"7th" ->  "07"
      ,"8th" ->  "08"
      ,"9th" ->  "09"
      ,"10th" -> "10"
      ,"11th" -> "11"
      ,"12th" -> "12"
      ,"13th" -> "13"
      ,"14th" -> "14"
      ,"15th" -> "15"
      ,"16th" -> "16"
      ,"17th" -> "17"
      ,"18th" -> "18"
      ,"19th" -> "19"
      ,"20th" -> "20"
      ,"21st" -> "21"
      ,"22nd" -> "22"
      ,"23rd" -> "23"
      ,"24th" -> "24"
      ,"25th" -> "25"
      ,"26th" -> "26"
      ,"27th" -> "27"
      ,"28th" -> "28"
      ,"29th" -> "29"
      ,"30th" -> "30"
      ,"31st" -> "31"
      )
    val monthMap = Map[String, String](
      "Jan" -> "01",
      "Feb" -> "02",
      "Mar" -> "03",
      "Apr" -> "04",
      "May" -> "05",
      "Jun" -> "06",
      "Jul" -> "07",
      "Aug" -> "08",
      "Sep" -> "09",
      "Oct" -> "10",
      "Nov" -> "11",
      "Dec" -> "12",
      )

    val dateSplit = date.split(" ")

    val day = dateSplit(0)
    val month = dateSplit(1)
    val year = dateSplit(2)

    dayMap(day)

    year + "-" + monthMap(month) + "-" + dayMap(day)
  }
}
//leetcode submit region end(Prohibit modification and deletion)
