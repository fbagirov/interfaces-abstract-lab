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
    class Bicycle extends Vehicle {
        public Bicycle (String brand, int year);
        super (brand, year);
        int numWheels;
        this.numWheels = numWheels
    }
    class Bicycle implements Movable { 
        public void move() {
            System.out.println("This bike travels on the ground by using kinetic energy from humans.")
                }
    }
        

}
