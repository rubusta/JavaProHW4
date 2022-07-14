import java.util.*;

public class Main extends LogicPlains {
    //идея состоит в том, что есть список компаний авиаперевозчиков со всеми данными. Определенная компания находиться
    //в определенной стране. В зависимости страны пребывания компании, нужный нам самолет может
    // лететь в этом направлении. Ползователь -сотрудник простто вводит номер нужной компании
    //  и программа сама определяет нужный нам самолет.
    public static void main(String[] args) {
        LinkedHashMap<FlightCompany, String> map = new LinkedHashMap<>();
        LinkedHashSet<FlightCompany> set = new LinkedHashSet<>();

        FlightCompany A = new FlightCompany(1, "WizzAir");
        FlightCompany B = new FlightCompany(2, "UkrainianAirLines");
        FlightCompany C = new FlightCompany(3, "RyanAir");

        map.put(A, "111");
        map.put(B, "222");
        map.put(C, "333");

        set.add(A);
        set.add(B);
        set.add(C);

        doInputs();


        System.out.println("----------------------" +
                "\nAvaliables flight companies:"
                + "\n---------------------\n number: " + A.getNumber());

        for (Map.Entry<String, String> entry : ListPlains.flightCompany().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("Hash code of WizzAir:" + A.hashCode() +
                "\n------------------\n number: " + B.getNumber());

        for (Map.Entry<String, String> entry1 : ListPlains.flightCompany2().entrySet()) {
            System.out.println(entry1.getKey() + ":" + entry1.getValue());
        }
        System.out.println("Hash code of UkrainianAirLines:" + B.hashCode() +
                "\n------------------\n number: " + C.getNumber());
        for (Map.Entry<String, String> entry3 : ListPlains.flightCompany3().entrySet()) {
            System.out.println(entry3.getKey() + ":" + entry3.getValue());
        }
        System.out.println("Hash code of RyanAir:" + C.hashCode() +
                "\n-------------------");
    }


}

