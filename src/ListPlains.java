import java.util.*;
public class ListPlains {
    public static Map<String, String> flightCompany() {
        Map<String,String> flightCompany = new HashMap<>();
        flightCompany.put("NameCompany", "WizzAir");
        flightCompany.put("Country", "Poland");
        flightCompany.put("qntPlanes", "1200");
        flightCompany.put("qntyEmployes", "9875");
        flightCompany.put("qntyDirFlights", "677");

        return flightCompany;
    }
    public static  Map<String, String> flightCompany2 (){
        Map<String,String> flightCompany2 = new HashMap<>();
        flightCompany2.put("NameCompany", "UkrainianAirLines");
        flightCompany2.put("Country", "Ukrain");
        flightCompany2.put("qntPlanes", "999");
        flightCompany2.put("qntyEmployes", "5678");
        flightCompany2.put("qntyDirFlights", "456");
        return flightCompany2;
    }
    public static  Map<String, String> flightCompany3 (){
        Map<String,String> flightCompany3 = new HashMap<>();

        flightCompany3.put("NameCompany", "RyanAir");
        flightCompany3.put("Country", "Greece");
        flightCompany3.put("qntPlanes", "1212");
        flightCompany3.put("qntyEmployes", "9987");
        flightCompany3.put("qntyDirFlights", "777");
        return flightCompany3;
    }

}