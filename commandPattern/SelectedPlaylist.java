package commandPattern;

public class SelectedPlaylist implements Command{
    private Device device;
    public SelectedPlaylist(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.SelectedPlaylist();
    }
}

