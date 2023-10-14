package commandPattern;

import java.util.Scanner;

public class Automation_App {
    public Automation_App() {
    }

    public static void main(String[] args) {
        Scanner device = new Scanner(System.in);
        System.out.println("-----Home Automation-----");

        while(true) {
            System.out.println("Devices:");
            System.out.println("1.) Lights");
            System.out.println("2.) Music Player");
            System.out.println("3.) Thermostat");
            System.out.println("4.) Exit");
            System.out.print("Enter the number of the preferred Device: ");
            int sd = device.nextInt();
            if (sd == 1 | sd == 2 | sd == 3) {
                command(sd);
            } else if (sd == 4) {
                System.out.println("\n--!!App Shutting Down!!--");
                System.exit(0);
            } else {
                System.out.println("\nIncorrect Number!! Please Try Again!!\n");
            }
        }
    }

    public static void command(int sd) {
        String device = "";
        Scanner command = new Scanner(System.in);
        if (sd == 1) {
            device = device + "Lights";
        }

        if (sd == 2) {
            device = device + "Music Player";
        }

        if (sd == 3) {
            device = device + "Thermostat";
        }

        while(true) {
            System.out.println("\nYour selected device is: " + device);
            System.out.println("-------------------");
            System.out.println("Commands:");
            System.out.println("1.)  SwitchOn");
            System.out.println("2.)  SwitchOff");
            System.out.println("3.)  DIM");
            System.out.println("4.)  Increase Volume");
            System.out.println("5.)  Decrease Volume");
            System.out.println("6.)  Play Selected Playlist");
            System.out.println("7.)  Increase Temperature ");
            System.out.println("8.)  Decrease Temperature");
            System.out.println("9.)  Reset Temperature");
            System.out.println("10.) Back to Devices\n");
            System.out.print("Enter Selected Command: ");
            int cm = command.nextInt();
            System.out.println();
            Device light = new Lights();
            Device musicPlayer = new MusicPlayer();
            Device Thermostat = new Thermostat();
            CentralHub cenhub = new CentralHub();
            switch (cm) {
                case 1:
                    Command switchOn = new SwitchOn(light);
                    cenhub.addCommand(switchOn);
                    cenhub.activate();
                    break;
                case 2:
                    Command switchOff = new SwitchOff(light);
                    cenhub.addCommand(switchOff);
                    cenhub.activate();
                    break;
                case 3:
                    Command dim = new DimLights(light);
                    cenhub.addCommand(dim);
                    cenhub.activate();
                    break;
                case 4:
                    Command increaseVolume = new IncreaseVolume(musicPlayer);
                    cenhub.addCommand(increaseVolume);
                    cenhub.activate();
                    break;
                case 5:
                    Command decreaseVolume = new DecreaseVolume(musicPlayer);
                    cenhub.addCommand(decreaseVolume);
                    cenhub.activate();
                    break;
                case 6:
                    Command selectedPlaylist = new SelectedPlaylist(musicPlayer);
                    cenhub.addCommand(selectedPlaylist);
                    cenhub.activate();
                    break;
                case 7:
                    Command increaseTemp = new IncreaseTemp(Thermostat);
                    cenhub.addCommand(increaseTemp);
                    cenhub.activate();
                    break;
                case 8:
                    Command decreaseTemp = new DecreaseTemp(Thermostat);
                    cenhub.addCommand(decreaseTemp);
                    cenhub.activate();
                    break;
                case 9:
                    Command resetTemp = new ResetTemp(Thermostat);
                    cenhub.addCommand(resetTemp);
                    cenhub.activate();
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Incorrect Command!! Please Try Again!!");
            }
        }
    }
}