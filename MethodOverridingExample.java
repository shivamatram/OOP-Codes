class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}
