package Design_Principles.SOLID;

// Liskov Substitution Principle

// L - If B is a subtype of A, then object of B should be usable wherever objects of A are expected without breaking the programs expected behaviour

class Bird{
    public void eat(){
        System.out.println("Eating");
    }
}

interface FlyingBird{
    void fly();
}

class Sparrow extends Bird implements FlyingBird{
    public void fly(){
        System.out.println("Flying");
    }
}

class Penguin extends Bird{
    public void walk(){
        System.out.println("Walking");
    }
}

// every subclass Should satisfies the expectation of Bird

public class L {
    public static void main(String[] args) {
        
        Bird bird1 = new Sparrow();
        bird1.eat();

        Bird bird2 = new Penguin();
        bird2.eat();

        // you can only instantiate an interface using a class that explicitly implements it
        FlyingBird bird3 = new Sparrow();
        bird3.fly();
    }
}

