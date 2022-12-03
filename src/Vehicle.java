//Task 3
public class Vehicle {
    private String coordinates;
    private int price;
    private int speed;
    private int year;

    public Vehicle(){}

    public Vehicle(String coordinates, int price, int speed, int year) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
