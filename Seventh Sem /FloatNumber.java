import java.util.Scanner;

public class  FloatNumber{
    public static void main(String args[]){
        System.out.println("Enter any float number=");
        Scanner sc = new Scanner(System.in);
        float num =sc.nextFloat();
        System.out.println("The number is = " + num);
        sc.close();
    }
} 