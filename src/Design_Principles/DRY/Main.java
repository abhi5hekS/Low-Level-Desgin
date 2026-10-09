package Design_Principles.DRY;

// class Order{
//     public void calculatePrice(double price){
//         double gst = price*0.14;
//         double finalPrice = price+gst;

//         System.out.println("Final Price is "+finalPrice);
//     }
// }


// class Invoice{
//     public void calculatePrice(double price){
//         double gst = price*0.14;
//         double finalPrice = price+gst;

//         System.out.println("Invoice Price is "+finalPrice);
//     }
// }

// calcualte price logic comes twice so when we need to update the gst percent then we need to remember all the places.


// DRY - Dont repeat yourself
 
// Every piece of knowledge or logic should have a single, clear, authoritative representation in the code.


class PriceCalculator{
    public double calculate(double price){
        double gst = price*0.18;
        return gst+price;
    }
}

class Order{
    PriceCalculator calc = new PriceCalculator();

    public void calculatePrice(double price){
        double finalPrice = calc.calculate(price);
        System.out.println("Final Price: "+finalPrice);
    }
}

class Invoice{
    PriceCalculator calc = new PriceCalculator();

    public void calculatePrice(double price){
        double finalPrice = calc.calculate(price);
        System.out.println("Final price: "+finalPrice);
    }
}

// Here what is happening we if we need to cahnge the GST rate the we just need to change it in one place.

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.calculatePrice(100);
        
    }
}
