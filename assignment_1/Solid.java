public class Animal {
    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public abstract void speak();
}

public class Dog extends Animal {
    public Dog(String name, String species) {
        super(name, species);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

public class Cat extends Animal {
    public Cat(String name, String species) {
        super(name, species);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Sparky", "Labrador Retriever");
        Cat cat = new Cat("Garfield", "Tabby");

        System.out.println(dog.getName() + " says: " + dog.speak());
        System.out.println(cat.getName() + " says: " + cat.speak());
    }
}