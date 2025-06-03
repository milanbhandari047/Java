public class multiplecatchblock {

    public static void main(String[] args) {

        try {
            int a = 10 / 0; // This will cause ArithmeticException

            String str = null;
            System.out.println(str.length()); // This would cause NullPointerException if reached

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
