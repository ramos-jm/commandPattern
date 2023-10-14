package commandPattern;

public class DimLights  implements Command{
    private Device device;
    public DimLights(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.DimLights();
    }
}

