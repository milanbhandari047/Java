import java.util.Scanner;
public class IntegerNumber{
    public static void main(String args[])
    {
        System.out.println("Enter any number =");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The number is = " + num);
        sc.close();
    }
}