abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method, non-abstract method, concrete method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void print(){
        System.out.println("this is a method");
    }
    
}

class Dog extends Animal{
    public void animalSound() {
        System.out.println("The dog says: bhao bhao");
    }
}
public class javaPrac2 {
    public static void main(String args[]) {
      Pig myPig = new Pig(); // Create a Pig object
        // myPig.animalSound();
        myPig.sleep();
        myPig.print();

    //     Dog dog = new Dog();
    //     dog.animalSound();
    //     dog.sleep();
        
    // Animal animal = new Animal();
    //     System.out.println(animal);
      
    }
}