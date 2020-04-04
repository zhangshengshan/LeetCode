# 请判断一个链表是否为回文链表。 
# 
#  示例 1: 
# 
#  输入: 1->2
# 输出: false 
# 
#  示例 2: 
# 
#  输入: 1->2->2->1
# 输出: true
#  
# 
#  进阶： 
# 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
#  Related Topics 链表 双指针


# leetcode submit region begin(Prohibit modification and deletion)
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        vals = []
        current_node = head

        while current_node is not None:
            vals.append(current_node.val)
            current_node = current_node.next

        start = 0 
        end = len(vals) -  1
        while start < end:
            if vals[start] != vals[end]:
                return False
            start = start + 1 
            end = end - 1

        return True


# leetcode submit region end(Prohibit modification and deletion)
