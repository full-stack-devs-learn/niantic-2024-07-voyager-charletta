-- 6. The sum of all sales in California
-- sales_price * quantity -- don't worry about discount
-- (Use the customer_orders view)

-- (1 row) - $3490.02

use northwind;

SELECT Sum(sales_price* quantity) AS allSales_inCalifornia  
FROM customer_orders
WHERE region='CA'; 





