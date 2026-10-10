package Design_Principles.KISS;

// KISS - Keep it Simple and Stupid

// Keep your code and design as simple as possible. Avoid unnecessary complexity when a simple solution can solve the probelm.

// class NumberChecker{
//     public void check(int num){
//         String res;
        
//         if(num%2==0){
//             res = "Even";
//         }
//         else{
//             res = "odd";
//         }

//         if(res.equals("Even")){
//             System.out.println("Number is even");
//         }
//         else{
//             System.out.println("Number is odd");
//         }
//     }
// }
// In this code we are doing unnecesary things which avoid KISS principle


class NumberChecker{
    public void check(int num){
        
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}




public class Main {
    public static void main(String[] args) {
        
        NumberChecker obj = new NumberChecker();
        obj.check(10);
    }
}
