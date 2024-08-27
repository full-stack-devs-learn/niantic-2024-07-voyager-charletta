-- 11. The average sales amount for all sales in Europe
-- (Use the customer_orders view)

-- (1 row) approx $605.99


SELECT AVG(order_id)
FROM customer_orders
WHERE country IN ('Europe');
