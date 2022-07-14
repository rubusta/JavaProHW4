import java.util.Objects;

public class FlightCompany extends Plain implements AirPlane{

    private final int  number;
    private final String name;


    public int getNumber() {
        return number;
    }

    public FlightCompany(int number, String name) {
        this.number = number;
        this.name = name;
    }


    @Override
    public String toString() {
        return "FlightCompany{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightCompany that = (FlightCompany) o;

        if (number != that.number) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}