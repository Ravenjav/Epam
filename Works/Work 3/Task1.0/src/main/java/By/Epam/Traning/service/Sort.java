package By.Epam.Traning.service;

import By.Epam.Traning.entity.Array;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.textManeger.TextManager;

public interface Sort{
    Array sort(Array mas) throws ServiceException;
    TextManager textManager = TextManager.getInstance();

    default void chekMas(Array mas) throws ServiceException{
        if (mas == null)
            throw new ServiceException();
        else
        if (mas.getMas() == null)
            throw new ServiceException(textManager.getString("sort.wrongFormatException"));
    }
}
