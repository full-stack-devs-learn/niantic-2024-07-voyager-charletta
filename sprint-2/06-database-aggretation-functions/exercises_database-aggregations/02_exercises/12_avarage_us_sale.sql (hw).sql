-- 12. The average line_item amount for all sales in the US
-- (Use the customer_orders view)
-- expect approx $748.77

-- (1 row)

SELECT AVG(DISTINCT order_id)

FROM customer_orders

WHERE country IN ('USA');


