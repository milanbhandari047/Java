class Animal {
    public void eat(){
        System.out.println("Eat all eatables");
    }
}

class Dog extends Animal {
    // Overriding the eat() method
    public void eat(){
        super.eat(); // Calls the eat() method from Animal
        System.out.println("Dog likes eating bones"); // Adds Dog-specific behavior
    }

    public static void main (String[] args){
        Dog d = new Dog(); // Create a Dog object
        d.eat(); // Call the eat method
    }
}
