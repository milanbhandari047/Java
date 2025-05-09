public class SimpleInterest {
    public static void main(String[] args){
        double principal = 1000; // Principal amount
        double rate = 5; // Rate of interest
        double time = 2; // Time in years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("Simple Interest: " + simpleInterest);
    }
}