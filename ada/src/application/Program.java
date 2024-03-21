package application;

import anipack.Dog;

public class Program {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bob");
        System.out.println(dog.getName());
    }
}
