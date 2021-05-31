import java.util.Objects;

public class Laptop extends Computer {

    private String battery;

    @Override
    public String getBattery() {
        return battery;
    }

    public Laptop setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery='" + battery + '\'' +
                '}';
    }
}
