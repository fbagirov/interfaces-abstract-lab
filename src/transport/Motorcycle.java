package transport;

public class Motorcycle extends Vehicle {
    private int speed;
    private boolean hasSidecar;
    private String color;
    public Motorcycle(String brand, int year, int speed, boolean hasSidecar, String color) {
        super(brand, year);  
        this.speed = speed;
        this.hasSidecar = hasSidecar;
        this.color = color;
    }
    public Motorcycle(String brand, int year){
        super(brand, year);
    }
    @Override
    public void move() {
        System.out.println(brand + " motorcycle is moving at " + speed + " mph.");
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    public void displayMotorcycleInfo() {
        displayInfo(); 
        System.out.println("Speed: " + speed);
        System.out.println("Has sidecar: " + hasSidecar);
        System.out.println("With color: " + color);
    }
}
