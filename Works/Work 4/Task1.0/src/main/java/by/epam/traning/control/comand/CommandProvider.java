package by.epam.traning.control.comand;

import by.epam.traning.control.comand.comands.ReadVoucher;
import by.epam.traning.control.comand.comands.ShowVoucher;
import by.epam.traning.control.comand.comands.UseSort;
import by.epam.traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Commands> repository = new HashMap<>();
    private static final Logger CommandLogger = (Logger) LogManager.getLogger(CommandProvider.class);
    TextManager textManager = TextManager.getInstance();

    public CommandProvider(){
        repository.put(CommandName.READ_VOUCHER, new ReadVoucher());
        repository.put(CommandName.SHOW_VOUCHER, new ShowVoucher());
        repository.put(CommandName.USE_SORT, new UseSort());
    }

    public Commands getCommand(String name){
        CommandName commandName = null;
        Commands sortCommand = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            sortCommand = repository.get(commandName);
        }catch(IllegalArgumentException | NullPointerException e){
            CommandLogger.error(e.getMessage());
            System.out.println(textManager.getString("CommandProvider.WrongRequest") + ' ' + e.getMessage());
        }
        return sortCommand;
    }
}
