package transport;

public abstract class AbstractCar extends Vehicle {

    protected int numDoors;
    protected int speed;
    protected String color;
    protected String fuelType;

    public AbstractCar(String brand, int year, int numDoors, int speed,
                       String color, String fuelType) {
        super(brand, year);
        this.numDoors = numDoors;
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;
    }

    public abstract void honk();
    public abstract String getCarType();

    @Override
    public String getInfo() {
        return "Brand: " + brand + 
               " | Year: " + year + 
               " | Type: " + getCarType() + 
               " | Doors: " + numDoors + 
               " | Color: " + color + 
               " | Fuel: " + fuelType + 
               " | Speed: " + speed + " mph";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Type: " + getCarType());
        System.out.println("Doors: " + numDoors);
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Speed: " + speed + " mph");
    }
}
