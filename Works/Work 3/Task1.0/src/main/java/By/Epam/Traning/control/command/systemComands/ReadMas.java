package By.Epam.Traning.control.command.systemComands;

import By.Epam.Traning.control.command.CommandProvider;
import By.Epam.Traning.control.command.Commands;
import By.Epam.Traning.dataAccess.DataFactory;
import By.Epam.Traning.dataAccess.exception.DataException;
import By.Epam.Traning.entity.Array;
import By.Epam.Traning.entity.ArrayStore;
import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ReadMas implements Commands{

    private static final Logger CommandLogger = (Logger) LogManager.getLogger(CommandProvider.class);
    TextManager textManager = TextManager.getInstance();

    public String execute(){
        String out;
        Array el;
        //TODO service
        DataFactory factory = DataFactory.getInstance();
        try {
            el = new Array(factory.getMasDAO().readFile());
        }
        catch (DataException e){
            CommandLogger.error(e.getMessage());
            out = e.getMessage();
            return out;
        }
        ArrayStore.getInstance().add(el);
        out = textManager.getString("ReadFile.SuccessReading");
        return out;
    }
}
