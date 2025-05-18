class Parameterized {
    double length;
     double breadth;


     //parameterized constructor
        Parameterized(double l, double b){
            length = l;
            breadth= b;
        }
        double calculateArea(){
            return length * breadth;
        }
        public static void main (String[]args){
            double area;
            Parameterized r = new Parameterized(4.5, 8);
            area = r.calculateArea();
            System.out.println("Area of rectangle is: " + area);
        }
}