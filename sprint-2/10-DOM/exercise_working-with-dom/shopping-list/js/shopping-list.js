// add pageTitle

// add groceries

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */


function displayListTitle()
{         const pageTitle = document.getElementById("syilk's shopping list");
          pageTitle.textContent = "Page Title"
    }
/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() 
{    const service = new ShoppingService();
     const ShoppingList=service.getShoppingList()
                         .sort((left,right) => left.isComplete-right.isComplete)
                         .map(grocery => {
                              return{
                              ...grocery,
                              statusText: grocery.isComplete ? "complete" : "incomplete"
                        };
        });

    const groceryListContainer = document.getElementById("groceries"); 

    ShoppingList.forEach(grocery => {
        createGroceryDiv(grocery, groceryListContainer);
    });


}


/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted()
{
    
        const divs = document.querySelectorAll(".groceries.grocery-item");
    
        divs.forEach(div => div.ShoppingList.add("completed"));


}

document.addEventListener("DOMContentLoaded",() =>{

displayListTitle();
displayGroceries();
});
    