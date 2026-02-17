package state;

public class Robot implements RoboticState {
    private final RoboticState roboticOn;
    private final RoboticState roboticCook;
    private final RoboticState roboticOff;

    private RoboticState currentState;

    public Robot() {
        this.roboticOn = new RoboticOn(this);
        this.roboticCook = new RoboticCook(this);
        this.roboticOff = new RoboticOff(this);

        this.currentState = roboticOn;
    }

    public void setRoboticState(RoboticState state) {
        currentState = state;
    }

    @Override
    public void walk() {
        currentState.walk();
    }

    @Override
    public void cook() {
        currentState.cook();
    }

    @Override
    public void off() {
        currentState.off();
    }

    public RoboticState getRoboticOn() {
        return roboticOn;
    }

    public RoboticState getRoboticCook() {
        return roboticCook;
    }

    public RoboticState getRoboticOff() {
        return roboticOff;
    }

    public RoboticState getState() {
        return currentState;
    }

    public void setState(RoboticState currentState) {
        this.currentState = currentState;
    }
}