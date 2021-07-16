package by.epam.traning.dataAccess;

import by.epam.traning.dataAccess.exception.DataException;

public interface DAO {
    void readFile() throws DataException;
}
