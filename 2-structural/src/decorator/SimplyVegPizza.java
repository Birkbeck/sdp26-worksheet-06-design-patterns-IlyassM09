package decorator;

public class SimplyVegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "SimplyVeg";
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
