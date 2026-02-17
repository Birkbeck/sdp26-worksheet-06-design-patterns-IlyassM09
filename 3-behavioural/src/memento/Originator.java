package memento;

public class Originator {
    private double x;
    private double y;

    private String lastUndoSavepoint;
    private CareTaker careTaker;

    public Originator(double x, double y, CareTaker careTaker) {
        // TODO: implement
        createSavepoint("INITIAL");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        // TODO: implement
    }

    public void setY(double y) {
        // TODO: implement
    }

    public void createSavepoint(String savepointName) {
        // TODO: implement
    }

    public void undo() {
        // TODO: implement
    }

    public void undo(String savepointName) {
        // TODO: implement
    }

    public void undoAll() {
        // TODO: implement
    }

    private void setOriginatorState(String savepointName) {
        // TODO: implement
    }

    @Override
    public String toString() {
        return "X: " + x + ", Y: " + y;
    }
}