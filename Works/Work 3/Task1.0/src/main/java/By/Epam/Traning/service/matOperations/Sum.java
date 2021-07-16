package By.Epam.Traning.service.matOperations;

import By.Epam.Traning.entity.Matrix;
import By.Epam.Traning.service.Operations;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Sum implements Operations {

    private static final Logger serviceLogger = (Logger) LogManager.getLogger(Sum.class);
    TextManager textManager = TextManager.getInstance();

    public Matrix use(Matrix mat1, Matrix mat2) throws ServiceException {
        int[][] out = new int[mat1.length()][mat1.length_dop(0)];
        if (mat1.length() != mat2.length())
            throw new ServiceException(textManager.getString("sort.wrongFormatException"));
        for (int i = 0; i < mat1.length(); i++){
            if (mat1.length_dop(i) != mat2.length_dop(i))
                throw new ServiceException(textManager.getString("sort.wrongFormatException"));
            for (int j = 0; j < mat1.length_dop(i); j++)
                out[i][j] = mat1.getElement(i, j) + mat2.getElement(i, j);
        }
        serviceLogger.info("Completed successfully");
        return new Matrix(out);
    }
}
