class ShoppingService {

    getListName() 
    { return 'Syilks Grocery List';
         
    }

    getShoppingList() {
        return [ 
            {
                id: 1,
                title: ' frozen chicken sausage',
                quantity: 1,
                isComplete: false
            },
            {
                id: 2,
                title: 'teriyaki seaweed',
                quantity: 4,
                isComplete: true

            },

            {   
                id:3,
                title:'dino chicken nuggets', 
                quantity: 3,
                isComplete:false

            },
    
            {   
                id:4,
                title:'blueberry pancakes', 
                quantity: 2,
                isComplete:true

            },

            {   
                id:5,
                title:'bananas', 
                quantity: 4,
                isComplete:false

            },

            {   
                id:6,
                title:'oranges', 
                quantity: 2,
                isComplete:true

            },

            {   
                id:7,
                title:'chocolate milk', 
                quantity: 1,
                isComplete:false

            },

            {   
                id:8,
                title:'1lb broccoli', 
                quantity: 1,
                isComplete:true

            },

            {   
                id:9,
                title:'string beans', 
                quantity: 2,
                isComplete:false

            },

            {   
                id:10,
                title:'lollipop', 
                quantity: 2,
                isComplete:true

            }
        ]
    }

    
}