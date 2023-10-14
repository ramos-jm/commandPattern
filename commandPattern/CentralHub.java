package commandPattern;

public class CentralHub {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void addCommand(Command command) {
        this.command = command;
    }

    public void activate() {
        command.execute();
    }
}

