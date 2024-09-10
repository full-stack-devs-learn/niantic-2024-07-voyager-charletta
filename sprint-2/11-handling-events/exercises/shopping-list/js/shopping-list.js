let service;
let list = []


let allItemsIncomplete = true;


function displayListTitle() {
    const title = document.getElementById("title")
    title.textContent = service.getListName();
}


function displayShoppingList() {
    const parent = document.getElementById("shopping-list")

    list.forEach(item => {
        addListItem(item, parent);
    })
}

function addListItem(item, parent)
{
    const div = document.createElement("div")
    div.classList.add("list-item");
    if(item.isComplete)
    {
        div.classList.add("complete")
    }

    addItemTitle(item, div);
    addQuantity(item, div)

    parent.appendChild(div)
}

function addItemTitle(item, parent)
{
    const div = document.createElement("div")
    div.textContent = item.title;

    parent.appendChild(div);
    
}


function addQuantity(item, parent)
{
    const div = document.createElement("div");
    div.classList.add("quantity-container");

    const span = document.createElement("span");
    span.textContent = "quantity"
    span.classList.add("super");

    const text = document.createTextNode(item.quantity)

    div.appendChild(span)
    div.appendChild(text)
    

    parent.appendChild(div);}

function markCompleted() {
    const listItems = document.querySelectorAll(".list-item");

    listItems.forEach(item => {
        item.classList.add("complete");
    })
}

// create the page load event here


document.addEventListener('DOMContentLoaded', () =>
{
    service = new ShoppingService();
    list = service.getShoppingList();

    displayListTitle();
    displayShoppingList();
    

    const form = document.querySelector('form');
    form.addEventListener("submit", (event) => {
        
    {
    event.preventDefault()
    const newItem = {
    title: document.getElementById('itemName').value, 
    quantity: document.getElementById('quantity').value,
    isComplete: false
        };

    list.push(newItem); 
    const parent = document.getElementById("shopping-list");
    addListItem(newItem, parent);

    form.reset(); 
    
        }
    })     
    
    const shoppingList = document.getElementById("shopping-list");

    shoppingList.addEventListener('click', (event) => 

        {
        const listItem = event.target.closest('.list-item'); 

        if (listItem && !listItem.classList.contains('complete')) {
            listItem.classList.add('complete');

            const itemTitle = listItem.querySelector('div').textContent; 
            const item = list.find(i => i.title === itemTitle); 
            if (item) item.isComplete = true; 
        }
    });

    shoppingList.addEventListener('dblclick', (event) => 

        {
        const listItem = event.target.closest('.list-item'); 

        if (listItem && listItem.classList.contains('complete')) {
            listItem.classList.remove('complete');

            const itemTitle = listItem.querySelector('div').textContent;
            const item = list.find(i => i.title === itemTitle); 
            if (item) item.isComplete = false;  
        }
    });

    const toggleButton = document.getElementById('toggleAll');
    toggleButton.textContent = 'Mark All Complete';

    toggleButton.addEventListener('click', () =>
         {
        const listItems = document.querySelectorAll('.list-item');

        if (allItemsIncomplete) {
            
            listItems.forEach((item, index) => {
                item.classList.add('complete');
                list[index].isComplete = true;
            });
            toggleButton.textContent = 'Mark All Incomplete';
            
        } else {
            
            listItems.forEach((item, index) => {
                item.classList.remove('complete');
                list[index].isComplete = false;
            });
            toggleButton.textContent = 'Mark All Complete';
        }

        
        allItemsIncomplete = !allItemsIncomplete;
    });
});

    


