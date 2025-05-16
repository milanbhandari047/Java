import java.util.Scanner;

public class Rectangle {


int l , b ;
void getData(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle: ");
    l = sc.nextInt();
    System.out.println("Enter the breadth of the rectangle: ");
    b = sc.nextInt();
}

void displayArea(){
 int area = l * b;
    System.out.println("The area of the rectangle is: " + area);
}




         public static void main(String[] args) {
            Rectangle rect = new Rectangle();
            rect.getData();
            rect.displayArea();

         }
}