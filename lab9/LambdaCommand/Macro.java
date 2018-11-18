import java.util.*;
public final class Macro {

    private final List<Command> commands;

    public Macro() {
        this.commands = new ArrayList<>();
    }

    public void record(final Command command) {
        this.commands.add(command);
    }

    public void run() {
        this.commands.forEach(Command::perform);
    }

}