class trycatch{
    public static void main (String []args){
        try{
            int divideByZero = 5/0;
            System.out.println("Rest of code executes");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        finally{
            System.out.println("This block always executes");
        }
    }
}