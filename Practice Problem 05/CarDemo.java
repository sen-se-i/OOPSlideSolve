public class CarDemo {
    String owner;
    String brand;
    String serialNumber;
    boolean isRunning;
    double fuelLevel;

    CarDemo(String owner, String brand, String serialNumber) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.isRunning = false;
        this.fuelLevel = 100.0;
    }

    void start() {
        isRunning = true;
        System.out.println(brand + " started.");
    }

    void stop() {
        isRunning = false;
        System.out.println(brand + " stopped.");
    }

    void checkFuel() {
        System.out.println("Fuel level: " + fuelLevel + "%");
    }

    public static void main(String[] args) {
        CarDemo car = new CarDemo("Alice", "Toyota", "SN12345");
        car.start();
        car.checkFuel();
        car.stop();
    }
}
