package ss10_vehicle.entity;

public class Motorbike extends Vehicle {
    int power;

    public Motorbike() {
    }

    public Motorbike(int power) {
        this.power = power;
    }

    public Motorbike(String name, int year, String id, String owner, int power) {
        super(name, year, id, owner);
        this.power=power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "power=" + power +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public String toCSV() {
        return "Motorbike,"+getName()+","+getYear()+","+getId()+","+getOwner()+","+getPower();
    }
}
