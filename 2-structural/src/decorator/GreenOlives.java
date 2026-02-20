package decorator;

public class GreenOlives implements Pizza {
    private Pizza pizza;
    public GreenOlives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {

        return pizza.getDesc()+ " Green olives";
    }

    @Override
    public double getPrice() {

        return pizza.getPrice()+ 2.7;
    }
}
