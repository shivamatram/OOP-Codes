class Car {
    String model;
    int year;

    Car(String model) {
        this.model = model;
    }

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", 2022);
        car1.display();
        car2.display();
    }
}
