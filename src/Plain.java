public class Plain implements AirPlane {
    @Override
    public boolean fligtKiev() {
        System.out.println("This plane can fligh to Kiev");
        return true;
    }

    @Override
    public boolean flightAthens() {
        System.out.println("This plane can flight to Athens");
        return true;
    }
}


