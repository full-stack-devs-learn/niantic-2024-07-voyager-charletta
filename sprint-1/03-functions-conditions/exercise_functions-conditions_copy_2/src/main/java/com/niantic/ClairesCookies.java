package com.niantic;

public class ClairesCookies
{
    @SuppressWarnings("unused") 
    private final double TaxRate = .0575;

    /*
     * Claire's cookies cost $12.95 a dozen.
     *
     * A customer places an order with a quantity
     * of how many dozen cookies they want to order.
     *
     * This calculateSubtotal function should calculate
     * the price of an order BEFORE the cost of tax
     * is added.
     *
     * calculateSubtotal(1) -> 12.95
     * calculateSubtotal(2) -> 25.90
     * calculateSubtotal(5) -> 64.75
     */
    public double calculateSubtotal(int quantity)
    {
          double dozenCookies;
          dozenCookies=12.95;

          double beforeTax;
          beforeTax= dozenCookies * quantity;


         return beforeTax;
    }

    /*
     * Claire is required to charge her customers
     * a 5.75% tax rate on all orders.
     *
     * Her cookies cost $12.95 a dozen.
     *
     * A customer places an order with a quantity
     * of how many dozen cookies they want to order.
     *
     * The calculateTotal function should calculate
     * the price of an order AFTER the cost of tax
     * is added.
     *
     * calculateTotal(1) -> 13.69
     * calculateTotal(2) -> 27.39
     * calculateTotal(5) -> 68.47
     */
    public double calculateTotal(int quantity)
    {

        double dozenCookies;
        dozenCookies=12.95;

        double taxRate;
        taxRate=0.0575;

        double beforeTax;
        beforeTax= dozenCookies * quantity;

        double withTax;
        withTax= beforeTax * taxRate;

        double totalCost;
        totalCost =(beforeTax + withTax) *100 / (100.0);


        return totalCost ;
    }

    /*
     * Snicker Doodles, Chocolate Chip and Frosted Chocolate Chip
     * cookies are the most popular cookies that Claire sells.
     *
     * Following is the cost of the cookies:
     * -------------------------------------
     * Snicker Doodles:        $12.95 / dz
     * Chocolate Chip:         $13.95 / dz
     * Frosted Chocolate Chip: $15.95 / dz
     *
     * For these popular orders, customers
     * can just choose how many dozen of each popular
     * cookie they would like to have.
     *
     * Parameters:
     * snickerDozen = quantity of Snicker Doodles Dozens
     * chocolateDozen = quantity of Chocolate Chip Dozens
     * frostedDozen = quantity of Frosted Chocolate Chip Dozens
     *
     * Calculate the total price of an order.
     * (Don't forget to add the tax)
     *
     * calculateQuickOrder(1,1,1) -> 45.31
     * calculateQuickOrder(0,3,2) -> 77.99
     * calculateQuickOrder(3,1,0) -> 55.84
     * calculateQuickOrder(2,0,2) -> 61.12
     */
    public double calculateQuickOrder(int snickerDozen, int chocolateDozen, int frostedDozen)
    {
        double claireSnicker;
        claireSnicker=12.95;

        double claireChocolate;
        claireChocolate=13.95;

        double claireFrostedChocolate;
        claireFrostedChocolate=15.95;

        double TaxRate;
        TaxRate= 0.0575;

        double beforeTaxSnicker;
        beforeTaxSnicker= claireSnicker * snickerDozen;

        double beforeTaxChoc;
        beforeTaxChoc = claireChocolate * chocolateDozen;

        double beforeTaxFrosted;
        beforeTaxFrosted = claireFrostedChocolate * frostedDozen;

        double orderSubtotal;
        orderSubtotal= beforeTaxSnicker+ beforeTaxChoc + beforeTaxFrosted;

        double withTax;
        withTax= (orderSubtotal * TaxRate);

        double totalPrice;
        totalPrice = orderSubtotal + withTax;



        return totalPrice;
    }


    /*
     * Claire also allows customers to customize their
     * cookies. They can choose to add chocolate chips
     * or add frosting to any of her cookies for an
     * additional cost.
     *
     * Extra ingredient cost
     * ---------------------
     * base cookie price: $12.95 / dz
     * chocolate chips:   $ 1.00 / dz
     * frosting:          $ 2.00 / dz
     *
     * Parameters:
     * quantity = the number of dozens of cookies ordered
     * hasChocolateChips = if true, add $1.00 to the cost of each dozen
     * hasFrosting = if true, add $2.00 to the cost of each dozen
     *
     * calculateCustomOrder (1, true, true) -> 16.87
     * calculateCustomOrder (2, true, false) -> 29.50
     * calculateCustomOrder (3, false, true) -> 47.43
     * calculateCustomOrder (5, true, false) -> 73.76
     */
    public double calculateCustomOrder (int quantity, boolean hasChocolateChips, boolean hasFrosting)
    {
         double baseCookie;
         baseCookie=12.95;
         double ChocChips;
         ChocChips=1.00;
         double Frosting;
         Frosting=2.00;
         double addTheTax;
         addTheTax=0.0575;

           double Order;
           Order= baseCookie * quantity;

           if (hasChocolateChips) {
               Order += quantity * ChocChips;
           }
           if (hasFrosting) {
               Order += quantity * Frosting;
           }

           double orderWithTax;
           orderWithTax= Order * addTheTax;

           double totalCustomOrder;
           totalCustomOrder= Order + orderWithTax;




        return totalCustomOrder;
    }

}