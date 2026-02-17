package bridge;

public abstract class Car {

    protected final Product product;
    protected final String carType;

    public Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails() {
        System.out.println("Car: " + carType + ", Product:" + product.productName());
    }
}