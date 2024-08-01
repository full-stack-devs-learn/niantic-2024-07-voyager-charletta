USE northwind;

-- The employee name and title
-- of all employees who were hired
-- in 2013

-- Expected: 3 rows

SELECT first_name
       ,title
       
FROM  employees

WHERE year(hire_date)= '2013';





  

