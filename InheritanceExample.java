class Animal {
    protected String name = "Animal";
    public void display() {
        System.out.println("I am an " + name);
    }
}

class Dog extends Animal {
    private String breed = "Labrador";
    public void showBreed() {
        System.out.println("Breed: " + breed);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
        dog.showBreed();
    }
}
