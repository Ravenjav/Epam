package By.Epam.Traning.service.masSort;

import By.Epam.Traning.entity.Array;
import By.Epam.Traning.service.Sort;
import By.Epam.Traning.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ShelSort implements Sort {

    private static final Logger sortLogger = (Logger) LogManager.getLogger(ShelSort.class);

    @Override
    public Array sort(Array mas) throws ServiceException{
        try {
            chekMas(mas);
        }
        catch (ServiceException e){
            throw new ServiceException(e);
        }
        int h = 1;
        while (h*3 < mas.length())
            h = h * 3 + 1;

        while(h >= 1) {
            mas = hSort(mas, h);
            h = h/3;
        }
        sortLogger.info("Sorting completed successfully");
        return mas;
    }

    private Array hSort(Array array, int h) {
        int length = array.length();
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array.getElement(j) < array.getElement(j - h)){
                    array.swap(j, j - h);
                }
                else
                    break;
            }
        }
        return array;
    }
}
