-- 8. The smallest line item amount made in Europe
-- (Use the customer_orders view)

-- (1 row) $4.80

SELECT product_name
	, unit_price
FROM products
ORDER BY unit_price 
LIMIT 1;




