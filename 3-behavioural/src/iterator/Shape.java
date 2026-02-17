package iterator;

public record Shape(int id, String name) {

    @Override
    public String toString() {
        return "ID: " + id + " Shape: " + name;
    }
}