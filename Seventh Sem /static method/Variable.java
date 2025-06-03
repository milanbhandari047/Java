
public class Variable {
    static int max = 10;
    int min = 5;

    public static void main(String[] args) {
        Variable v = new Variable();
        System.out.println("Static variable max: " + Variable.max);
        System.out.println("Non-static variable min: " + v.min);
}

}

 
