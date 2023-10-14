package commandPattern;

public class Lights implements Device{

    @Override
    public void IncreaseTemp() {
        System.out.println("Increasing Temperature:");
        System.out.println("Mode: Warm");
        System.out.println("Temperature: 24°C \n");
    }
    @Override
    public void ResetTemp() {
        System.out.println("Resetting Temperature:");
        System.out.println("Mode: Default");
        System.out.println("Temperature: 20°C \n");
    }

    @Override
    public void DecreaseTemp() {
        System.out.println("Decreasing Temperature:");
        System.out.println("Turbo Mode: Activated");
        System.out.println("Temperature: 16°C \n");
    }

    @Override
    public void IncreaseVolume() {
        System.out.println("Increasing Volume");
        System.out.println("Music mode: Rave\n");
    }

    @Override
    public void SelectedPlaylist() {
        System.out.println("Playing Selected Playlist");
        System.out.println("Now Playing: ➗(Deluxe) by Ed Sheeran");
        System.out.println("Que:");
        System.out.println("- Photograph by Ed Sheeran");
        System.out.println("- Perfect by Ed Sheeran");
        System.out.println("- Castle on the Hill by Ed Sheeran");
        System.out.println("- Galway Girl by Ed Sheeran\n");
    }

    @Override
    public void DecreaseVolume() {
        System.out.println("Decreasing Volume");
        System.out.println("Music mode: Chill\n");
    }

    @Override
    public void SwitchOn() {
        System.out.println("Lights Switching ON");
        System.out.println("Mode: Bright Light");
        System.out.println("Brightness Level = 100%\n");
    }
    @Override
    public void DimLights() {
        System.out.println("Lights Switching to DIM");
        System.out.println("Mode: Moody");
        System.out.println("Brightness Level = 50%\n");
    }

    @Override
    public void SwitchOff() {
        System.out.println("Lights Switching Off");
        System.out.println("Mode: Darkness");
        System.out.println("Brightness Level = 0%\n");
    }
}
