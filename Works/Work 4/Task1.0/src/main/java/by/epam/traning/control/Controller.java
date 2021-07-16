package by.epam.traning.control;

import by.epam.traning.control.comand.CommandProvider;
import by.epam.traning.control.comand.Commands;

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
