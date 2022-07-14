import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LogicPlains {
    public static void doInputs() {
        AirPlane airPlane = new Plain();
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