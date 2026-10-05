package Design_Principles.SOLID;

// Open/Closed Principle

// O - software must be open for extenstion but closed for modification.

// class PaymentService {
//     public void pay(String paymentMethod) {
//         if (paymentMethod.equals("UPI")) {
//             System.out.println("Pay using UPI");
//         }
//         else if (paymentMethod.equals("CARD")) {
//             System.out.println("Pay using Card");
//         }
//     }
// }

// In this we keep modifying the if else logic for different type of payment modes

interface Payment{
    void pay(double amount);
}

class UPIPayment implements Payment{
    @Override 
    public void pay(double amount){
        System.out.println("Paid $"+amount+" using UPI");
    }
}

class CardPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid $"+amount+" using cash");
    }
}

class PaypalPayment implements Payment{
    @Override 
    public void pay(double amount){
        System.out.println("Paid $"+amount+" using PayPal");
    }
}


class PaymentService{
    public void processPayment(Payment payment, double amount){
        payment.pay(amount);
    }
}


public class O {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        UPIPayment upi = new UPIPayment();
        service.processPayment(upi, 10000);

        CardPayment card = new CardPayment();
        service.processPayment(card, 40000);

        PaypalPayment paypal = new PaypalPayment();
        service.processPayment(paypal, 60000);

    }
}
