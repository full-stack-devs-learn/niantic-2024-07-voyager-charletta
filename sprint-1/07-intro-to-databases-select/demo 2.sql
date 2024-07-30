USE northwind;

-- give me the full name and hire date of each employee 
SELECT concat(first_name, " " ,last_name)
      
	   , hire_date
FROM employees; 	

