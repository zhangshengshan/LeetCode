#Employee 表包含所有员工，他们的经理也属于员工。每个员工都有一个 Id，此外还有一列对应员工的经理的 Id。 
#
# +----+-------+--------+-----------+
#| Id | Name  | Salary | ManagerId |
#+----+-------+--------+-----------+
#| 1  | Joe   | 70000  | 3         |
#| 2  | Henry | 80000  | 4         |
#| 3  | Sam   | 60000  | NULL      |
#| 4  | MAX   | 90000  | NULL      |
#+----+-------+--------+-----------+
# 
#
# 给定 Employee 表，编写一个 SQL 查询，该查询可以获取收入超过他们经理的员工的姓名。在上面的表格中，Joe 是唯一一个收入超过他的经理的员工。 
#
#
# +----------+
#| Employee |
#+----------+
#| Joe      |
#+----------+
# 
#


#leetcode submit region begin(Prohibit modification AND deletion)
# Write your MySQL query statement below

SELECT 
    t1.Name AS Employee
FROM 
    Employee AS t1 
JOIN 
    Employee AS t2 
ON 
    t1.ManagerId = t2.id
WHERE
    t1.Salary > t2.Salary
AND 
    t1.ManagerId = t2.id
#leetcode submit region END(Prohibit modification AND deletion)
