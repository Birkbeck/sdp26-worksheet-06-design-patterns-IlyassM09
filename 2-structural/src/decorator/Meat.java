package decorator;

public class Meat implements Pizza {
    private Pizza pizza;

    public Meat(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+ " meat";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.0;
    }
}
