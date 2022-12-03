//Task 3
public class Ship extends Vehicle{
    String port;
    private int numberOfPassengers;

    public Ship(String port, int numberOfPassengers) {
        this.port = port;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Ship(String coordinates, int price, int speed, int year, String port, int numberOfPassengers) {
        super(coordinates, price, speed, year);
        this.port = port;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
