//Task 3
public class Plane extends Vehicle{
    private int height;
    private int numberOfPassengers;

    public Plane(int height, int numberOfPassengers) {
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Plane(String coordinates, int price, int speed, int year, int height, int numberOfPassengers) {
        super(coordinates, price, speed, year);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
