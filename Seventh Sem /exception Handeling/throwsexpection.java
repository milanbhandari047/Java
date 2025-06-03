public class  throwsexpection  {

    // This method declares it may throw an exception
    static void show() throws Exception {
        System.out.println("This is inside show() method");
        throw new Exception("Something went wrong");
    }

    public static void main(String[] args) {
        try {
            show(); // Call the method
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
