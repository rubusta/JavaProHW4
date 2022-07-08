import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<FlightCompany, String> map = new LinkedHashMap<>();
        LinkedHashSet<FlightCompany> set = new LinkedHashSet<>();
        AirPlane airPlane = new Plain();

        FlightCompany A = new FlightCompany(1, "WizzAir");
        FlightCompany B = new FlightCompany(2, "UkrainianAirLines");
        FlightCompany C = new FlightCompany(3, "RyanAir");

        map.put(A, "111");
        map.put(B, "222");
        map.put(C, "333");

        set.add(A);
        set.add(B);
        set.add(C);

        Map<String, String> flightCompany = new HashMap<>();
        Map<String, String> flightCompany2 = new HashMap<>();
        Map<String, String> flightCompany3 = new HashMap<>();

        flightCompany.put("NameCompany", "WizzAir");
        flightCompany.put("Country", "Poland");
        flightCompany.put("qntPlanes", "1200");
        flightCompany.put("qntyEmployes", "9875");
        flightCompany.put("qntyDirFlights", "677");

        flightCompany2.put("NameCompany", "UkrainianAirLines");
        flightCompany2.put("Country", "Ukrain");
        flightCompany2.put("qntPlanes", "999");
        flightCompany2.put("qntyEmployes", "5678");
        flightCompany2.put("qntyDirFlights", "456");

        flightCompany3.put("NameCompany", "RyanAir");
        flightCompany3.put("Country", "Greece");
        flightCompany3.put("qntPlanes", "1212");
        flightCompany3.put("qntyEmployes", "9987");
        flightCompany3.put("qntyDirFlights", "777");


        System.out.println("----------------------" +
                "\nAvaliables flight companies:"
                + "\n---------------------\n number: " + A.getNumber());

        for (Map.Entry<String, String> entry : flightCompany.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("Hash code of WizzAir:" + A.hashCode() +
                "\n------------------\n number: " + B.getNumber());

        for (Map.Entry<String, String> entry1 : flightCompany2.entrySet()) {
            System.out.println(entry1.getKey() + ":" + entry1.getValue());
        }
        System.out.println("Hash code of UkrainianAirLines:" + B.hashCode() +
                "\n------------------\n number: " + C.getNumber());
        for (Map.Entry<String, String> entry3 : flightCompany3.entrySet()) {
            System.out.println(entry3.getKey() + ":" + entry3.getValue());
        }
        System.out.println("Hash code of RyanAir:" + C.hashCode() +
                "\n-------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of country flight:");
        int number = sc.nextInt();


        if (number == 1) {
            System.out.println(airPlane.fligtKiev());
        } else if (number == 2) {
            System.out.println(airPlane.flightAthens());
        } else {
            System.out.println("Other destinations");

        }
    }
}
