package Exercise4;

public class Flight {
    private final String destination;
    private final String flightNr;
    private final Time depTime;

    public Flight(String destination, String flightNr, Time depTime) {
        this.destination = destination;
        this.flightNr = flightNr;
        this.depTime = depTime;
    }

    public Time getDepTime() {
        return depTime;
    }

    @Override
    public String toString() {
        return "Exercise4.Flight{" +
                "destination='" + destination + '\'' +
                ", flightNr='" + flightNr + '\'' +
                ", depTime=" + depTime +
                '}';
    }
}
