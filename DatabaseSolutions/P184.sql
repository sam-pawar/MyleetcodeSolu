SELECT dept.name as Department, emp.name as Employee, emp.salary Salary FROM Employee emp
INNER JOIN Department dept ON emp.departmentId = dept.id
INNER JOIN 
(Select max(salary) as salary, departmentId as depart from Employee group by departmentId)
 temp on emp.departmentId = temp.depart and emp.salary = temp.salary
