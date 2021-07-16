package By.Epam.Traning.control.command.sortOperationsCommands;

import By.Epam.Traning.control.command.CommandProvider;
import By.Epam.Traning.control.command.Commands;
import By.Epam.Traning.entity.Array;
import By.Epam.Traning.entity.ArrayStore;
import By.Epam.Traning.service.ServiceFactory;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class UseHashSort implements Commands {
    private static final Logger CommandLogger = (Logger) LogManager.getLogger(CommandProvider.class);
    TextManager textManager = TextManager.getInstance();

    @Override
    public String execute(){
        String out = null;
        ArrayStore store = ArrayStore.getInstance();
        Array mas = store.get(0);
        try {
            store.replacement(0, ServiceFactory.getInstance().getHash().sort(mas));
            out =  textManager.getString("Controller.SuccessSorting");
        }
        catch (ServiceException e){
            CommandLogger.error(e.getMessage());
            out = e.getMessage();
        }
        return out;
    }
}
