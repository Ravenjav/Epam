package By.Epam.Traning.dataAccess;

import By.Epam.Traning.dataAccess.exception.DataException;

public interface MasDAO {
    int[] readFile() throws DataException;
}
