-- 8. The sum of all sales in the UK
-- sales_price * quantity -- don't worry about discount
-- (Use the customer_orders view)

-- (1 row) - $60616.51

SELECT Sum(sales_price * quantity) AS allsales_inUK

FROM customer_orders

WHERE country = 'UK';



