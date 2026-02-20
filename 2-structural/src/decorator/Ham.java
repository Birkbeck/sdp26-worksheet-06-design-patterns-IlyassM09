package decorator;

public class Ham implements Pizza {

    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {

        return pizza.getDesc()+ " Ham";
    }

    @Override
    public double getPrice() {

        return pizza.getPrice() + 3.0;
    }
}
