package transport;

public abstract class Vehicle implements Movable {

    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + " Year: " + year);
    }

}
class Airplane extends Vehicle {
    
    protected int speed;

    public Airplane(String brand, int year, int speed) {
        super(brand, year);
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("The airplane is flying.");
    }
    
    @Override
    public int getSpeed() {
        return speed;
    }
}
