package transport;

public abstract class Vehicle implements Movable {

    protected String brand;
    protected int year;
    protected int speed;

    public Vehicle(String brand, int year, int speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }
    
    @Override
    public int getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + " Year: " + year + " Speed: " + speed);
    }

}
