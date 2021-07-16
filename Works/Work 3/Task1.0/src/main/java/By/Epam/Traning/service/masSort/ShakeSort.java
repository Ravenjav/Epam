package By.Epam.Traning.service.masSort;

import By.Epam.Traning.entity.Array;
import By.Epam.Traning.service.Sort;
import By.Epam.Traning.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ShakeSort implements Sort {

    private static final Logger sortLogger = (Logger) LogManager.getLogger(ShakeSort.class);

    @Override
    public Array sort(Array mas) throws ServiceException{
        try {
            chekMas(mas);
        }
        catch (ServiceException e){
            throw new ServiceException(e);
        }
        boolean flag = false;
        int right = mas.length() - 1;
        int left = 1;
        while (true){
            flag = false;
            for (int i = left; i <= right; i++){
                if (mas.getElement(i) < mas.getElement(i - 1)){
                    mas.swap(i, i - 1);
                    flag = true;
                }
            }
            right--;
            for (int i = right; i >= left; i--){
                if (mas.getElement(i) < mas.getElement(i - 1)){
                    mas.swap(i, i - 1);
                    flag = true;
                }
            }
            left++;
            if (!flag)
                break;
        }
        sortLogger.info("Sorting completed successfully");
        return mas;
    }
}
