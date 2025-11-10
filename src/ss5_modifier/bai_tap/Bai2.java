package ss5_modifier.bai_tap;

public class Bai2 {
    public static void main(String[] args) {
        Bai2 student = new Bai2();
        System.out.println(student.getClasses());
    }

    private String name = "John";
    private String classes = "CO2";

    public Bai2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Bai2{" +
                "name=" + name +
                ", classes=" + classes +
                '}';
    }
}


