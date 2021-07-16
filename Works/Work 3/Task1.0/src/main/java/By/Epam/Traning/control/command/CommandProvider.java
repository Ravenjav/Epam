package By.Epam.Traning.control.command;

import By.Epam.Traning.control.command.matrixOperationComands.*;
import By.Epam.Traning.control.command.sortOperationsCommands.*;
import By.Epam.Traning.control.command.systemComands.ReadMas;
import By.Epam.Traning.control.command.systemComands.ReadMatrix;
import By.Epam.Traning.control.command.systemComands.ShowMas;
import By.Epam.Traning.control.command.systemComands.ShowMatrix;
import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Commands> repository = new HashMap<>();
    private static final Logger CommandLogger = (Logger) LogManager.getLogger(CommandProvider.class);
    TextManager textManager = TextManager.getInstance();

    public CommandProvider(){
        //TODO CommandName_COMMAND
        repository.put(CommandName.BUBBLE_SORT, new UseBubble());
        repository.put(CommandName.CHOSE_SORT, new UseChose());
        repository.put(CommandName.INSERT_SORT, new UseInsert());
        repository.put(CommandName.MERGER_SORT, new UseMerger());
        repository.put(CommandName.SHAKE_SORT, new UseShake());
        repository.put(CommandName.SHEL_SORT, new UseShel());
        repository.put(CommandName.HASH_SORT, new UseHashSort());
        repository.put(CommandName.READ_MAS, new ReadMas());
        repository.put(CommandName.READ_MAT, new ReadMatrix());
        repository.put(CommandName.SHOW_MAS, new ShowMas());
        repository.put(CommandName.SHOW_MAT, new ShowMatrix());
        repository.put(CommandName.SUM, new UseSum());
        repository.put(CommandName.SUB, new UseSub());
        repository.put(CommandName.MULT, new UseMult());
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
