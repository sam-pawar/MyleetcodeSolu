select emp.name as Employee from Employee emp
join 
(
    Select * from Employee manager where id in 
    (select distinct(managerId) from Employee)
) manag on emp.managerId = manag.id
where emp.salary > manag.salary
