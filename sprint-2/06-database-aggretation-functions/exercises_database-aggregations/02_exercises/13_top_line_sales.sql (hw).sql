-- 13. Top 5 line item sales:
-- include the company name, order id, country and total sale amount
-- (Use the customer_orders View)

-- expected rows
-- QUICK-Stop,                  10865,  Germany,    15810.00
-- Hanari Carnes,               10981,  Brazil,     15810.00
-- Piccolo und mehr,            10353,  Austria,    10540.00
-- Simons bistro,               10417,  Denmark,    10540.00
-- Rattlesnake Canyon Grocery,  10889,  USA,        10540.00


-- (1 row)
use northwind;

SELECT company_name,
       order_id,
       country,
       SUM(sales_price) AS total_sale_amount
FROM customer_orders
GROUP BY company_name, order_id, country
ORDER BY total_sale_amount DESC
LIMIT 5;



