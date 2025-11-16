package ss8_clean_code.entity;

public class Truck extends Vehicle {
    int load;

    public Truck() {
    }

    public Truck(int load) {
        this.load = load;
    }

    public Truck(String name, int year, String id, String owner, int load) {
        super(name, year, id, owner);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "load=" + load +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }
}
