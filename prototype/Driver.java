package prototype;

public class Driver {

    private String name;
    private int id;

    public Driver(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " Driver{" + "name=" + getName() + ", id=" + getId() + "}}";
    }

}
