public class DogDemo {
    String name;
    int age;
    String breed;

    DogDemo(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " says: Woof!");
    }

    void doSpin() {
        System.out.println(name + " is spinning!");
    }

    void run() {
        System.out.println(name + " is running!");
    }

    public static void main(String[] args) {
        DogDemo dog = new DogDemo("Buddy", 3, "Labrador");
        dog.bark();
        dog.doSpin();
        dog.run();
    }
}
