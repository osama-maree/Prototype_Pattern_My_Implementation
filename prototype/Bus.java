package prototype;

public class Bus extends Vehicle {
    private int doors;
    private Driver driver;
    public Bus(String brand, String model, String color, int doors, Driver P) {
        super(brand, model, color);
        this.doors = doors;
        this.driver = P;
    }
    public Bus(Bus bus) {
        this(bus.getBrand(), bus.getModel(), bus.getColor(), bus.doors, bus.getDriver());
    }
    public Driver getDriver() {
        return driver;
    }
    public void setData(int x) {
        this.doors = x;
    }
    @Override
    public String toString() {
        return "\nBus{{" + "doors=" + doors + super.toString() + driver.toString();
    }
    //deepCopy
    @Override
    public Vehicle clone() {
        Vehicle clone = null;

        Driver p = new Driver(this.getDriver().getName(), this.getDriver().getId());
        clone = new Bus(this.getBrand(), this.getColor(), this.getModel(), this.doors, p);

        return clone;
    }
    //shallow Copy
//    @Override
//    public Vehicle clone() {
//        Vehicle clone = null;
//
//        clone = new Bus(this);
//
//        return clone;
//    }

}
