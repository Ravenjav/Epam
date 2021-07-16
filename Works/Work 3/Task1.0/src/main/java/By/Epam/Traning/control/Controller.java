package By.Epam.Traning.control;

import By.Epam.Traning.control.command.CommandProvider;
import By.Epam.Traning.control.command.Commands;

public class Controller {

    private final CommandProvider provider = new CommandProvider();

    public String executeTask(String request){
        String commandName;
        Commands command;
        commandName = request;//.toUpperCase(Locale.ROOT);
        command = provider.getCommand(commandName);
        String out = command.execute();
        return out;
    }
}
