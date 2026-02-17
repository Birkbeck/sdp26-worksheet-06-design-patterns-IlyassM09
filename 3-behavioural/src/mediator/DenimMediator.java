package mediator;

public class DenimMediator implements MachineMediator {
    private final Machine machine;
    private final Heater heater;
    private final Motor motor;
    private final Sensor sensor;
    private final SoilRemoval soilRemoval;
    private final Valve valve;

    public DenimMediator(Machine machine, Heater heater, Motor motor, Sensor sensor,
                         SoilRemoval soilRemoval, Valve valve) {
        this.machine = machine;
        this.heater = heater;
        this.motor = motor;
        this.sensor = sensor;
        this.soilRemoval = soilRemoval;
        this.valve = valve;

        System.out.println("Setting up for DENIM program");
    }


    @Override
    public void start() {
        // TODO: implement
    }

    @Override
    public void wash() {
        // TODO: implement
    }

    @Override
    public void open() {
        // TODO: implement
    }

    @Override
    public void closed() {
        // TODO: implement
    }

    @Override
    public void on() {
        // TODO: implement
    }

    @Override
    public void off() {
        // TODO: implement
    }

    @Override
    public boolean checkTemperature() {
        // TODO: implement
        return false;
    }
}
