public class StaticTest {

    // Static method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Main method to test the static method
    public static void main(String[] args) {
        int result = StaticTest.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}
