public class AnimalTree {
    static class Animal {
        String name;
        String sound;

        Animal(String name, String sound) {
            this.name = name;
            this.sound = sound;
        }

        void makeSound() {
            System.out.println(name + " says: " + sound);
        }

        void eat() {
            System.out.println(name + " is eating.");
        }
    }

    static class Dog extends Animal {
        String breed;

        Dog(String name, String breed) {
            super(name, "Woof");
            this.breed = breed;
        }

        @Override
        void makeSound() {
            System.out.println(name + " barks: Woof Woof!");
        }

        void fetch() {
            System.out.println(name + " is fetching the ball.");
        }
    }

    static class Cat extends Animal {
        boolean isIndoor;

        Cat(String name, boolean isIndoor) {
            super(name, "Meow");
            this.isIndoor = isIndoor;
        }

        @Override
        void makeSound() {
            System.out.println(name + " meows: Meow Meow!");
        }

        void purr() {
            System.out.println(name + " is purring.");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "...");
        Dog dog = new Dog("Rex", "German Shepherd");
        Cat cat = new Cat("Whiskers", true);

        animal.makeSound();
        animal.eat();

        dog.makeSound();
        dog.fetch();
        dog.eat();

        cat.makeSound();
        cat.purr();
        cat.eat();

        Animal polymorphicDog = new Dog("Buddy", "Poodle");
        polymorphicDog.makeSound();
    }
}
