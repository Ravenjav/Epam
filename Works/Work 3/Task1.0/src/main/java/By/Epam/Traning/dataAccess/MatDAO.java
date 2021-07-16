package By.Epam.Traning.dataAccess;

import By.Epam.Traning.dataAccess.exception.DataException;

public interface MatDAO {
    int[][] readFile(String file) throws DataException;
}
