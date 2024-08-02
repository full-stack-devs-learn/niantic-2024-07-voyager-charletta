USE northwind;

-- You were just hired by Northwind Traders, Inc and 
-- you need to add yourself as a Sales Associate to the Employees table.
-- Inlcude your:
    -- full name
    -- job title
    -- preferred title (Mr, Mrs, etc)
    -- Birthday
    -- hire date: (today)
    -- home address
-- leave all other fields null by default



INSERT INTO  employees (first_name, last_name, title, title_of_courtesy, birth_date, hire_date, address, city, region, postal_code,country,home_phone, extension, notes, reports_to, salary)
VALUES 
      ('Char', 'Harris', 'Sales Associate', 'Ms', '1995-05-06',' 2024-08-02', '123 Main Street', 'Oakland','CA', '94605', NULL, NULL, NULL,' ', NULL, NULL);