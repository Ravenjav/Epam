package By.Epam.Traning.service.masSort;

import By.Epam.Traning.entity.Array;
import By.Epam.Traning.service.Sort;
import By.Epam.Traning.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ChoseSort implements Sort {

    private static final Logger sortLogger = (Logger) LogManager.getLogger(ChoseSort.class);

    @Override
    public Array sort(Array mas) throws ServiceException{
        try {
            chekMas(mas);
        }
        catch (ServiceException e){
            throw new ServiceException(e);
        }
        int mi, mip, swap;
        for (int i = 0; i < mas.length() - 1; i++){
            mi = mas.getElement(i);
            mip = i;
            for (int j = i + 1; j < mas.length(); j++){
                if (mas.getElement(j) < mi){
                    mi = mas.getElement(j);
                    mip = j;
                }

            }
            mas.swap(i, mip);
        }
        sortLogger.info("Sorting completed successfully");
        return mas;
    }
}
