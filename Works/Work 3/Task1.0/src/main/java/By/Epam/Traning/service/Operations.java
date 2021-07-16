package By.Epam.Traning.service;

import By.Epam.Traning.entity.Array;
import By.Epam.Traning.entity.Matrix;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.textManeger.TextManager;

public interface Operations {
    Matrix use(Matrix mat1, Matrix mat2) throws ServiceException;
    TextManager textManager = TextManager.getInstance();

    default void chekMas(Matrix mat) throws ServiceException{
        if (mat == null)
            throw new ServiceException();
        else
        if (mat.getMatrix() == null)
            throw new ServiceException(textManager.getString("sort.wrongFormatException"));
    }
}
