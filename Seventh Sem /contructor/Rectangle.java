// Rectangle

class Rectangle{
    double length;
     double breadth;

     Rectangle(){
        length = 4.5;
        breadth= 8;
     }
     double calculateArea(){
        return length * breadth;
     }


        public static void main (String[]args){
            double area;
            Rectangle r = new Rectangle();
            area = r.calculateArea();
            System.out.println("Area of rectangle is: " + area);
        }
     
}