abstract class Animal{
     public void displayInfo(){
        System.out.println("I am an Animal");
    }

    abstract void makeSound();
    }

    class Dog extends Animal{
        @Override
        void makeSound() {
            System.out.println("Bark");
        }
    }

    class Cat extends Animal{
        @Override
        void makeSound() {
            System.out.println("Meow");
        }
    }
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayInfo();
        dog.makeSound();

        Cat cat = new Cat();
        cat.displayInfo();
        cat.makeSound();

        p();

    }

    public static void p(){
        System.out.println("Hello");
    }
}