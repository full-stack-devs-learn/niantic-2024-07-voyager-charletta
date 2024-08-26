package com.niantic.exercises;

import com.niantic.models.LineItem;

import java.util.ArrayList;
import java.util.List;

public class Filters
{

    /*
    1) using Java Stream functions, filter the *lineItems* list to include only line items for the given company name

    hint: the company name should not be required to be the full name, but could be a partial name
     */
    public List<LineItem> filterByCompanyName(List<LineItem> lineItems, String companyName)
    {
           var filteredList=lineItems.stream()
                                     .filter(lineItem ->lineItem.getCompanyName().toLowerCase().contains(companyName.toLowerCase()))
                                     .toList();



        return (filteredList);
    }

    /*
    2) using Java Stream functions, filter the *lineItems* list to include only line items for the given category name

    hint: the user may search by only a partial category name
     */
    public List<LineItem> filterByCategory(List<LineItem> lineItems, String categoryName)
    {
       var filteredNameList=lineItems.stream()
                                     .filter(lineItem -> lineItem.getCategoryName().toLowerCase().contains(categoryName.toLowerCase()))
                                     .toList();




        return (filteredNameList);
    }

    /*
    3) using Java Stream functions, filter the *lineItems* list to include only line items for the given product name

    hint: the user may search by only a partial product name
     */
    public List<LineItem> filterByProduct(List<LineItem> lineItems, String productName)
    {
           var filteredProductList= lineItems.stream()
                                             .filter(lineItem -> lineItem.getProductName().toLowerCase().contains(productName.toLowerCase()))
                                             .toList();



    return (filteredProductList);
    }

    /*
    4) using Java Stream functions, filter the *lineItems* list to include only line items for the given order year

     */
    public List<LineItem> filterByYear(List<LineItem> lineItems, int year)
    {
        var filteredYear=lineItems.stream()
                                  .filter(lineItem -> lineItem .getOrderDate().getYear() ==year)
                                  .toList();




        return (filteredYear);
    }


    /*
    5) using Java Stream functions, filter the *lineItems* list to include only line items for the given order id

     */
    public List<LineItem> filterByOrderId(List<LineItem> lineItems, int orderId)
    {

        var filteredOrderId = lineItems.stream()
                                      .filter(lineItem -> lineItem .getOrderId()== orderId)
                                      .toList();


        return filteredOrderId;
    }
}
