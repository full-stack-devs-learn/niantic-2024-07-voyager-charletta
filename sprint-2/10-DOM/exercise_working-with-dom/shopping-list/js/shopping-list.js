// add pageTitle

// add groceries

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */


function displayListTitle()
{         const pageTitle = document.getElementById("title");
          pageTitle.textContent = "Syilks Shopping List "
    }
/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayShoppingList() 
{    const service = new ShoppingService();
     const ShoppingList=service.getShoppingList()
                         .sort((left,right) => left.isComplete-right.isComplete)
                         .map(grocery => {
                              return{
                              ...grocery,
                              statusText: grocery.isComplete ? "complete" : "incomplete"
                        };
        });

    const groceryListContainer = document.getElementById("list-container"); 

    ShoppingList.forEach(grocery => {
        createListItem(grocery, groceryListContainer);
    });


}

function createListItem( item, parent)
{
    const div = document.createElement("div");
    div.classList.add("list-item")
    div.textContent = `${item.quantity} (${item.title})`;

    parent.appendChild(div)
}


/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted()
{
    
        const items = document.querySelectorAll('.list-item');
        items.forEach(item =>{
           item.classList.add('complete')
        });


}

document.addEventListener("DOMContentLoaded",() =>{
    

displayListTitle();
displayShoppingList();

});
    