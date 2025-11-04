package org.example;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex");
        Animal cat = new Cat("Murka");

        System.out.println(dog.getName() + ": " + dog.makeSound());
        System.out.println(cat.getName() + ": " + cat.makeSound());
    }
}
