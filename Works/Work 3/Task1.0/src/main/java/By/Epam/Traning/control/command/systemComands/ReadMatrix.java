package By.Epam.Traning.control.command.systemComands;

import By.Epam.Traning.control.command.CommandProvider;
import By.Epam.Traning.control.command.Commands;
import By.Epam.Traning.dataAccess.DataFactory;
import By.Epam.Traning.dataAccess.exception.DataException;
import By.Epam.Traning.entity.Matrix;
import By.Epam.Traning.entity.MatrixStore;
import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ReadMatrix implements Commands {
    private static final Logger CommandLogger = (Logger) LogManager.getLogger(CommandProvider.class);
    TextManager textManager = TextManager.getInstance();

    public String execute(){
        String out;
        Matrix el;
        DataFactory factory = DataFactory.getInstance();
        try {
            el = new Matrix(factory.getMatDAO().readFile("F:\\Git-Rep\\Epam\\Works\\Work 3\\Task1.0\\src\\main\\data\\matrix.txt"));
        }
        catch (DataException e){
            CommandLogger.error(e.getMessage());
            out = e.getMessage();
            return out;
        }
        MatrixStore.getInstance().add(el);

        try {
            el = new Matrix(factory.getMatDAO().readFile("F:\\Git-Rep\\Epam\\Works\\Work 3\\Task1.0\\src\\main\\data\\matrix2.txt"));
        }
        catch (DataException e){
            CommandLogger.error(e.getMessage());
            out = e.getMessage();
            return out;
        }
        MatrixStore.getInstance().add(el);
        out = textManager.getString("ReadFile.SuccessReading");
        return out;
    }
}
