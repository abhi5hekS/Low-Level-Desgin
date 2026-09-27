package Design_Principles.SOLID;

// S - Instead of doing all work in a single class we can make a separate class for each

class Order{
    
    private double amount;

    public Order(double amount){
        this.amount = amount;
    }
    
    public double calculateTotal(){
        return amount;
    }
}

class OrderRepository{
    public void save(Order order){
        System.out.println("Order saved to DB");
    }
}

class EmailService{
    public void sendEmail(String person){
        System.out.println("Email sent to "+person);
    }
}

class InvoiceService{
    public void generateInvoice(Order order){
        System.out.println("Invoice generated");
    }
}


public class S {
    public static void main(String[] args) {
        Order order = new Order(500);
        System.out.println("Total "+order.calculateTotal());

        OrderRepository repo = new OrderRepository();
        repo.save(order);

        EmailService emailService = new EmailService();
        emailService.sendEmail("abc@gmail.com");

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.generateInvoice(order);
        
    }
}
