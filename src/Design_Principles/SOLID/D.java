package Design_Principles.SOLID;

import javax.xml.crypto.Data;

// D - Dependency Inversion Principle

// High level modules should not depend directly on low-level modules. Both should depend on abstractions.

// class MySqlDb{
//     public void save(){
//         System.out.println(("Saved to MySql"));
//     }
// }

// class OrderService{
//     private MySqlDb db;

//     public OrderService(){
//         db = new MySqlDb();  // here we are manually made db as mysql whihc is tightly coupled
//     }

//     public void saveOrder(){
//         db.save();
//     }
// }

interface Database{
    void save();
}


class MySqlDb implements Database{

    public void save(){
        System.out.println("Saved to MySql");
    }
}


class MongoDb implements Database{
    
    public void save(){
        System.out.println("Saved to mongoDb");
    }
}

// tightly coupled -> means when a class directly creates a particular type of object

class OrderService{
    
    private Database db;

    public OrderService(Database db){
        this.db = db;
        // here Db is not tightly coupled 
    }

    public void saveOrder(){
        db.save();
    }
    // not that db.save will work which type of DB we have given while initializaing the Db object
}

public class D {
    public static void main(String[] args) {
        
        Database mongodb = new MongoDb();
        Database mysql = new MySqlDb();

        OrderService orderService1 = new OrderService(mongodb);
        orderService1.saveOrder();

        OrderService orderService2 = new OrderService(mysql);
        orderService2.saveOrder();
    }
}
