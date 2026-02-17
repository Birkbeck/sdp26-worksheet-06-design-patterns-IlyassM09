package iterator;

public class ShapeStorage {
    private final Shape[] shapes = new Shape[100];
    private int count;

    public void addShape(String name) {
        Shape shape = new Shape(count, name);
        shapes[count++] = shape;
    }

    public Shape[] getShapes() {
        return shapes;
    }
}