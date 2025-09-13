package Exercise4;

public class Exercise3_4_Main {
    public static void main(String[] args) {
        Flight flight = new Flight("Stockholm", "SK1234", new Time(12, 30));
        System.out.println(flight.toString());
        Time depTime = flight.getDepTime();
        depTime.tic(1800); // seconds
        System.out.println(flight.toString());
    }
}
