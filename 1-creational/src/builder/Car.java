package builder;

public class Car {
    private String bodyStyle;
    private String power;
    private String engine;
    private String breaks;
    private String seats;
    private String windows;
    private String fuelType;
    private final String carType;

    public Car(String carType) {
        this.carType = carType;
    }

    public Car(String carType, String power, String engine) {
        this.carType = carType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBreaks() {
        return breaks;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {

        return "--------------" + carType + "---------------------" +
                "\n Body: " +
                bodyStyle +
                "\n Power: " +
                power +
                "\n Engine: " +
                engine +
                "\n Breaks: " +
                breaks +
                "\n Seats: " +
                seats +
                "\n Windows: " +
                windows +
                "\n Fuel Type: " +
                fuelType;
    }
}