package transport;

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
