package prototype;

public class Car extends Vehicle {
    private int topSpeed;
    private Driver driver;
    public Car(String brand, String model, String color, int topSpeed, Driver P) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
        driver = P;
    }
    public Car(Car car) {
        this(car.getBrand(), car.getModel(), car.getColor(), car.topSpeed, car.getDriver());
    }
    public Driver getDriver() {
        return driver;
    }
    @Override
    public String toString() {
        return "Car{{" + "topSpeed=" + this.topSpeed + super.toString() + driver.toString();

    }
    public void setData(int x) {
        this.topSpeed = x;
    }
//    //deepCopy
    @Override
    public Vehicle clone() {
        Vehicle clone = null;
        if (this instanceof Car) {
            Driver a = new Driver(this.getDriver().getName(), this.getDriver().getId());
            clone = new Car(this.getBrand(), this.getColor(), this.getModel(), this.topSpeed, a);
        }
        return clone;
    }
    //shallow Copy
//    @Override
//    public Vehicle clone() {
//        Vehicle clone = null;
//     if (this instanceof Car) {
//            clone = new Car(this);
//        }
//
//        return clone;
//    }
}
