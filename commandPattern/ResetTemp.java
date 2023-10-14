package commandPattern;

public class ResetTemp implements Command{
    private Device device;
    public ResetTemp(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.ResetTemp();
    }
}

