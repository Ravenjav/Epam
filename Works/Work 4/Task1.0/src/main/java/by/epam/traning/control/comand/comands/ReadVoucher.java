package by.epam.traning.control.comand.comands;

import by.epam.traning.control.Main;
import by.epam.traning.control.comand.Commands;
import by.epam.traning.dataAccess.DAO;
import by.epam.traning.dataAccess.DataFactory;
import by.epam.traning.dataAccess.exception.DataException;
import by.epam.traning.entity.VouchersStore;
import by.epam.traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ReadVoucher implements Commands {

    private static final Logger commandLogger = (Logger) LogManager.getLogger(Main.class);
    TextManager textManager = TextManager.getInstance();

    public String execute(){
        String out;
        DataFactory factory = DataFactory.getInstance();
        DAO read = factory.getDAO();
        VouchersStore mas;
        try{
            read.readFile();
        }catch (DataException e){
            commandLogger.error(e.getMessage());
            return out = e.getMessage();
        }
        out = textManager.getString("ReadVouchers.SuccessReading");
        return out;
    }
}
