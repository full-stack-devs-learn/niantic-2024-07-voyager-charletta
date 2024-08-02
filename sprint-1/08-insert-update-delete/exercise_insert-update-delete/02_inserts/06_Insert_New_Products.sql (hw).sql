USE northwind;

-- Insert 10 new products into the new Sporting Goods Category
-- You can leave the Supplier Id empty for now, but you need to include
-- the product name, category, price, units in stock (20), units on order (0)
-- and re-order level (10) for each product.

     #Create 10 new products 
     #one product each column will be in parenthesis 
     #then you have to do each for the column. 
     
INSERT INTO products (product_name, category_id, supplier_id, unit_price, units_in_stock, units_on_order, reorder_level)

VALUES
('Basketball', 9, NULL, 19.99, 20, 0, 10),
('Yoga Mat', 9, NULL, 29.99, 20, 0, 10),
('Soccer Ball', 9, NULL, 39.99, 20, 0, 10),
('Fishing Rod', 9, NULL, 49.99, 20, 0, 10),
('Hiking Backpack', 9, NULL, 59.99, 20, 0, 10),
('Tennis Racket', 9, NULL, 69.99, 20, 0, 10),
('Camping Tent', 9, NULL, 79.99, 20, 0, 10),
('Baseball Bat', 9, NULL, 89.99, 20, 0, 10),
('Running Shoes', 9, NULL, 199.99, 20, 0, 10),
('Golf Club Set', 9, NULL, 299.99, 20, 0, 10);
      
                 
                 
          
     
              
           
     
     
     