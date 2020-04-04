#表1: Person 
#
# +-------------+---------+
#| 列名         | 类型     |
#+-------------+---------+
#| PersonId    | INT     |
#| FirstName   | VARCHAR |
#| LastName    | VARCHAR |
#+-------------+---------+
#PersonId 是上表主键
# 
#
# 表2: Address 
#
# +-------------+---------+
#| 列名         | 类型    |
#+-------------+---------+
#| AddressId   | INT     |
#| PersonId    | INT     |
#| City        | VARCHAR |
#| State       | VARCHAR |
#+-------------+---------+
#AddressId 是上表主键
# 
#
# 
#
# 编写一个 SQL 查询，满足条件：无论 person 是否有地址信息，都需要基于上述两表提供 person 的以下信息： 
#
# 
#
# FirstName, LastName, City, State
# 
#


#leetcode submit region begin(Prohibit modification AND deletion)
# Write your MySQL query statement below
SELECT
  FirstName,
  LastName,
  City,
  State
FROM 
  Person t1 
LEFT JOIN
  Address t2
ON 
  t1.PersonId = t2.PersonId
;
  

#leetcode submit region END(Prohibit modification AND deletion)
