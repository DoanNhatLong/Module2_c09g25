package ss8_clean_code.entity;

public class Oto extends Vehicle {
    int seat;
    String style;

    public Oto() {
    }

    public Oto(int seat, String style) {
        this.seat = seat;
        this.style = style;
    }

    public Oto(String name, int year, String id, String owner, int seat, String style) {
        super(name, year, id, owner);
        this.seat = seat;
        this.style = style;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "seat=" + seat +
                ", style='" + style + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }
}
