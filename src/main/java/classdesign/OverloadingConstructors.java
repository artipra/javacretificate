package classdesign;

class DogO {
    private String name;
    private String breed;
    private double weight;

    public DogO(String name) {
//        this.name = name;
//        breed = "husky";
//        weight = 30.0;

//        Dog(name, "husky"); // does not compile
//        new Dog(name, "husky"); // compiles but does not do what we want
//        System.out.println("constructor 1");
        this(name, "husky");
        System.out.println("constructor 1");
    }

    public DogO(String name, String breed) {
//        this.name = name;
//        this.breed = breed;
//        weight = 30.0;
        this(name, breed, 30.0);
        System.out.println("constructor 2");
    }

    public DogO(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructor 3");
    }

    public void print() {
        System.out.println(name + " " + breed + " " + weight);
    }
}

public class OverloadingConstructors {

    public static void main(String[] args) {
        DogO dog1 = new DogO("Jimmy");
        dog1.print();

        DogO dog2 = new DogO("Anthony", "shepard");
        dog2.print();

        DogO dog3 = new DogO("Rex", "german shepard", 40);
        dog3.print();
    }
}