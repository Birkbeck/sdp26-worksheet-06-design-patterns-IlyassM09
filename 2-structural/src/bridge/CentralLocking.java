package bridge;

public class CentralLocking implements Product {

    private String productName;

    public CentralLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        // TODO: implement
        return this.productName;
    }

    @Override
    public void produce() {
        // TODO: implement
        System.out.println("Producing "+ this.productName);
    }
}
