import java.util.Scanner;

public class Name {
    public static void main (String args[]){
        System.out.println("Enter your name =");
        Scanner  sc = new Scanner (System.in);
        String name = sc.nextLine();
        System.out.println("Your name is = " + name);
        sc.close();
    }
}