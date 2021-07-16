package By.Epam.Traning.service.masSort;

import By.Epam.Traning.entity.Array;
import By.Epam.Traning.service.Sort;
import By.Epam.Traning.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class InsertSort implements Sort {

    private static final Logger sortLogger = (Logger) LogManager.getLogger(InsertSort.class);

    @Override
    public Array sort(Array mas) throws ServiceException{
        try {
            chekMas(mas);
        }
        catch (ServiceException e){
            throw new ServiceException(e);
        }
        int j, swap;
        for (int i = 1; i < mas.length(); i++){
            j = 0;
            swap = mas.getElement(i);
            while (j < i && mas.getElement(i) > mas.getElement(j))
                j++;
            for (int g = i; g > j; g--){
                mas.setElement(g, mas.getElement(g - 1)) ;
            }
            mas.setElement(j, swap);
        }
        sortLogger.info("Sorting completed successfully");
        return mas;
    }
}
