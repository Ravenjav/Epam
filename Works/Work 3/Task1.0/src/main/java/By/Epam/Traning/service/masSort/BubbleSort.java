package By.Epam.Traning.service.masSort;

import By.Epam.Traning.entity.Array;
import By.Epam.Traning.service.Sort;
import By.Epam.Traning.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class BubbleSort implements Sort {

    private static final Logger sortLogger = (Logger) LogManager.getLogger(BubbleSort.class);

    @Override
    public Array sort(Array mas) throws ServiceException{
        try {
            chekMas(mas);
        }
        catch (ServiceException e){
            throw new ServiceException(e);
        }
        for (int i = 0; i < mas.length(); i++) {
            for (int j = 1; j < mas.length(); j++) {
                if (mas.getElement(j) < mas.getElement(j - 1))
                    mas.swap(j, j - 1);
            }
        }
        sortLogger.info("Sorting completed successfully");
        return mas;
    }
}
