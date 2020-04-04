//冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。 
//
// 现在，给出位于一条水平线上的房屋和供暖器的位置，找到可以覆盖所有房屋的最小加热半径。 
//
// 所以，你的输入将会是房屋和供暖器的位置。你将输出供暖器的最小加热半径。 
//
// 说明: 
//
// 
// 给出的房屋和供暖器的数目是非负数且不会超过 25000。 
// 给出的房屋和供暖器的位置均是非负数且不会超过10^9。 
// 只要房屋位于供暖器的半径内(包括在边缘上)，它就可以得到供暖。 
// 所有供暖器都遵循你的半径标准，加热的半径也一样。 
// 
//
// 示例 1: 
//
// 
//输入: [1,2,3],[2]
//输出: 1
//解释: 仅在位置2上有一个供暖器。如果我们将加热半径设为1，那么所有房屋就都能得到供暖。
// 
//
// 示例 2: 
//
// 
//输入: [1,2,3,4],[1,4]
//输出: 1
//解释: 在位置1, 4上有两个供暖器。我们需要将加热半径设为1，这样所有房屋就都能得到供暖。
// 
// Related Topics 二分查找


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int len1 = houses.length;
        int len2 = heaters.length;
        int result = 0;
        for (int i = 0; i < len1; i++) {
            //遍历房屋,找到每一个房屋距离供暖器的最短距离
            int min = 0;
            //最左边
            if (houses[i] <= heaters[0]) {
                min = heaters[0] - houses[i];
            }
            //最右边
            else if (houses[i] > heaters[len2 - 1]) {
                min = houses[i] - heaters[len2 - 1];
            } else {
                //相当于查找目标元素在供暖器数组中的插入位置
                int left = 0;
                int right = len2 - 1;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (heaters[mid] < houses[i]) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                min = Math.min(houses[i] - heaters[left - 1], heaters[left] - houses[i]);
            }
            result = Math.max(min, result);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
