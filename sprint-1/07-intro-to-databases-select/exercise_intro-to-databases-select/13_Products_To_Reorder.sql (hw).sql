USE northwind;

-- The Product name, UnitsInStock
-- of all products that need to be re-ordered
-- (They are low stock and have not been 
-- re-ordered)

-- Expected: 1 row

SELECT product_name
      ,units_in_stock
      ,reorder_level 
      
FROM products 
    
WHERE  units_in_stock < reorder_level;
     
