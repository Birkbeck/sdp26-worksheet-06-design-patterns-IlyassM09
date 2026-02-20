package decorator;

public class Spinach implements Pizza {

    private Pizza pizza;

    public Spinach(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {

        return pizza.getDesc()+ "Spinash";
    }

    @Override
    public double getPrice() {

        return pizza.getPrice()+ 1.3;
    }
}
