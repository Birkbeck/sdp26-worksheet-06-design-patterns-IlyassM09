package decorator;

public class RomaTomatoes implements Pizza {
    private Pizza pizza;

    public RomaTomatoes(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {

        return pizza.getDesc()+ " RomaTomatoes";
    }

    @Override
    public double getPrice() {

        return pizza.getPrice()+ 1.6;
    }
}
