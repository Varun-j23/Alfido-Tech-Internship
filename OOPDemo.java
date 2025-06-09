// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animals make sounds.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Method overriding
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls parent class method

        Dog myDog = new Dog();
        myDog.makeSound(); // Calls overridden method in child class
    }
}
