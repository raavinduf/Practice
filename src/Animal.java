abstract class Animal{
    void displayInfo(){
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