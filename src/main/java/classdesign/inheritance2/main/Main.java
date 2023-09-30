package classdesign.inheritance2.main;

import classdesign.inheritance2.Dog;
import classdesign.inheritance2.Husky;

public class Main {

    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();
    }
}