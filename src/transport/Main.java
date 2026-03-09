package transport;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 2022, 4, 120, "Red", "Gasoline");

        System.out.println("=== Car ===");
        myCar.displayInfo();
        myCar.move();
        myCar.honk();

        System.out.println("\n=== getInfo() from Vehicle Contract ===");
        System.out.println(myCar.getInfo());

        System.out.println("\n=== Movable Contract in Action ===");
        Movable myCar2 = new Car("Honda", 2021, 4, 100, "Blue", "Gasoline");
        System.out.println("-- Fulfilling move() contract --");
        myCar2.move();
        System.out.println("-- Fulfilling getSpeed() contract --");
        System.out.println("Speed: " + myCar2.getSpeed() + " mph");

        System.out.println("\n=== AbstractCar Contract in Action ===");
        AbstractCar myCar3 = new Car("BMW", 2023, 2, 180, "Black", "Gasoline");
        System.out.println("-- Fulfilling honk() contract --");
        myCar3.honk();
        System.out.println("-- Fulfilling getCarType() contract --");
        System.out.println("Car Type: " + myCar3.getCarType());
        System.out.println("-- Fulfilling getInfo() contract --");
        System.out.println(myCar3.getInfo());
    }
}
