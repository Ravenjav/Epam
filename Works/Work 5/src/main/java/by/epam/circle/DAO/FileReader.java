package by.epam.circle.DAO;

import by.epam.circle.DAO.exceptuin.DAOException;
import by.epam.circle.entity.Cube;
import by.epam.circle.service.valid.ValidData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {
    public ArrayList<Cube> read() throws DAOException {
        ArrayList<Cube> data = new ArrayList<Cube>();
        try(FileInputStream fin=new FileInputStream("src/main/data.txt"))
        {
            String line = "";
            int i=-1;
            int x, y, z;
            ValidData checker = new ValidData();
            while((i=fin.read())!=-1){
                if ((char) i == '\n'){
                    if (checker.checkCube(line)){
                        data.add(checker.getCube());
                    }
                    line = "";
                }
                line += (char) i;
            }
        }
        catch(IOException ex){
            throw new DAOException(ex);
        }
        return data;
    }
}
