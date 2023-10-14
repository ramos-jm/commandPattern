package commandPattern;

public class IncreaseVolume implements Command{
    private Device device;
    public IncreaseVolume(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.IncreaseVolume();
    }
}
