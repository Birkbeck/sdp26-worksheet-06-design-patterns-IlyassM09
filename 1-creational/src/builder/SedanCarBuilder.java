package builder;

public class SedanCarBuilder implements CarBuilder{

    private String bodyStyle, power , engine , breaks, seats, windows, fuelType;

    @Override
    public void buildBodyStyle() {
        this.bodyStyle = "External dimensions: overall length (inches): 202.9, overall width (inches): 76.2, overall height (inches):";
    }

    @Override
    public void buildPower(){
        this.power = "285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm";
    }

    @Override
    public void buildEngine() {
        this.engine = "3.5L Duramax V 6 DOHC";
    }

    @Override
    public void buildBreaks() {
        this.breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution";
    }

    @Override
    public void buildSeats() {

    }

    @Override
    public void buildWindows() {

    }

    @Override
    public void buildFuelType() {
        // TODO: implement
    }

    @Override
    public Car getCar(){
        // TODO: implement
        return null;
    }
}