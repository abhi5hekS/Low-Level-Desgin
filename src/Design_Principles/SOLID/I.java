package Design_Principles.SOLID;

// I - Interface segregation principle

// Client should not be forced to depend on methods they don't use.

// interface Restaurant{
    
//     void cook();
//     void serve();
//     void clean();
//     void manageInventory();

// }

// class Chef implements Restaurant{
    
//     public void cook(){
//         System.out.println("Cooking");
//     }
    
//     public void serve(){
//         System.out.println("Serving");
//     }

//     public void clean(){
//         System.out.println("Cleaning");
//     }

//     public void manageInventory(){
//         System.out.println("managing Inventory");
//     }
// }

// Here chef is forced to implement all the methods


interface Cookable{
    void cook();
}

interface Cleanable{
    void clean();
}

interface Managable{
    void manageInventory();
}

interface Servable{
    void serve();
}

class Chef implements Cookable{
    public void cook(){
        System.out.println("Cooking....");
    }
}

class Waiter implements Servable{
    public void serve(){
        System.out.println("Serving...");
    }
}


// Now each class only implements what it actually needs

public class I {
    public static void main(String[] args) {
        
    }
}
