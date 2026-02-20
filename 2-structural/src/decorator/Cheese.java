package decorator;

public class Cheese implements Pizza {
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {

        return pizza.getDesc() + " Cheese";
    }

    @Override
    public double getPrice() {

        return pizza.getPrice()+ 5.2;
    }
}
