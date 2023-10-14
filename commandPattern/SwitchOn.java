package commandPattern;

public class SwitchOn implements Command{
    private Device device;

    public SwitchOn(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.SwitchOn();
    }
}