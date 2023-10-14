package commandPattern;

public class DecreaseVolume implements Command{
    private Device device;
    public DecreaseVolume(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.DecreaseVolume();
    }
}
