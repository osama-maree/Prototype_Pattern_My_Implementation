package prototype;

public abstract class Vehicle {

    private final String brand;
    private final String model;
    private final String color;

    public abstract Driver getDriver();//To clarify the shallow copy

    public abstract void setData(int x);//To clarify the shallow copy

    public abstract Vehicle clone();

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return ", brand=" + brand + ", model=" + model + ", color=" + color + '}';
    }

}
