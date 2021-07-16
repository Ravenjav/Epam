package By.Epam.Traning.service.matOperations;

import By.Epam.Traning.entity.Matrix;
import By.Epam.Traning.service.Operations;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Mult implements Operations {

    private static final Logger serviceLogger = (Logger) LogManager.getLogger(Sum.class);
    TextManager textManager = TextManager.getInstance();

    public Matrix use(Matrix mat1, Matrix mat2) throws ServiceException {
        int[][] out = new int[mat1.length()][mat2.length_dop(0)];
        for (int i = 0; i < mat1.length(); i++){
            //TODO name lenght_Dop -> columns
            if (mat1.length_dop(i) != mat2.length())
                throw new ServiceException(textManager.getString("sort.wrongFormatException"));
            for (int j = 0; j < mat2.length_dop(i); j++) {
                out[i][j] = 0;
                for (int g = 0; g < mat2.length(); g++) {
                    out[i][j] += mat1.getElement(i, g) * mat2.getElement(g, j);
                }
            }
        }
        serviceLogger.info("Completed successfully");
        return new Matrix(out);
    }
}
