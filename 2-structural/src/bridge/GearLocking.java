package bridge;

public class GearLocking implements Product {

    private String productName;

    public GearLocking(String productName) {
        // TODO: implement
        this.productName = productName;
    }

    @Override
    public String productName() {
        // TODO: implement
        return this.productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing "+ this.productName);
    }
}
