package transport;

public class Car extends AbstractCar {

    public Car(String brand, int year, int numDoors, int speed,
               String color, String fuelType) {
        super(brand, year, numDoors, speed, color, fuelType);
    }

    @Override
    public void move() {
        System.out.println(brand + " is driving on the road.");
    }

    @Override
    public void honk() {
        System.out.println(brand + " goes Beep beep!");
    }

    @Override
    public String getCarType() {
        return "Regular Car";
    }
}
