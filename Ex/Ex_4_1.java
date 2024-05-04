// Parent class
class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from the parent class
class Dog extends Animal {
    // Overriding the sound method in the child class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Ex_4_1 {
    public static void main(String[] args) {
        // Creating an object of the parent class
        Animal animal = new Animal();
        // Invoking method of the parent class
        animal.sound();

        // Creating an object of the child class
        Dog dog = new Dog();
        // Invoking method of the child class (method overriding)
        dog.sound();
    }
}
