package commandPattern;

public class SwitchOff implements Command{
    private Device device;

    public SwitchOff(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.SwitchOff();
    }
}
