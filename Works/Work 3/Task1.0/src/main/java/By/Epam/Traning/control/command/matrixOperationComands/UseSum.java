package By.Epam.Traning.control.command.matrixOperationComands;

import By.Epam.Traning.control.command.CommandProvider;
import By.Epam.Traning.control.command.Commands;
import By.Epam.Traning.entity.Array;
import By.Epam.Traning.entity.ArrayStore;
import By.Epam.Traning.entity.Matrix;
import By.Epam.Traning.entity.MatrixStore;
import By.Epam.Traning.service.ServiceFactory;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class UseSum implements Commands {
    private static final Logger CommandLogger = (Logger) LogManager.getLogger(CommandProvider.class);
    TextManager textManager = TextManager.getInstance();

    @Override
    public String execute(){
        String out = null;
        MatrixStore store = MatrixStore.getInstance();
        Matrix mas1 = store.get(0);
        Matrix mas2= store.get(1);
        try {
            store.add(ServiceFactory.getInstance().getSum().use(mas1, mas2));
            out =  textManager.getString("Controller.SuccessOperation");
        }
        catch (ServiceException e){
            CommandLogger.error(e.getMessage());
            out = e.getMessage();
        }
        return out;
    }
}
