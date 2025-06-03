package  package2;
import package1.*;
public class Package2 {
    public static void main(String[] args) {
        System.out.println("This is Package2.");

        Package1 p1 = new Package1(); 
        p1.main(); 

    }
}