package decorator;

public class SimplyNonVegPizza implements Pizza {
    @Override
    public String getDesc() {
        return "Simplynonveg";
    }

    @Override
    public double getPrice() {
        return 4;
    }
}
