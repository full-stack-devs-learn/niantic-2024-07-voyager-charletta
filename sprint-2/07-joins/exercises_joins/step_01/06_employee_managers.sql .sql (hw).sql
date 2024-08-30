-- 6. Select the full name of each employee
-- and the full name of their manager

-- hint look at the employee table to see how to
-- determine who the manager is of each employee

-- you will need to do a "self join" to the employees table
-- and you will need to create table aliases to complete this query

-- (9 rows)

USE northwind;

SELECT 
CONCAT(title_of_courtesy, ' ', first_name, ' ', last_name) AS full_name,
CONCAT(title_of_courtesy, ' ', first_name, ' ', last_name) AS manager_name

FROM employees,




