package By.Epam.Traning.dataAccess;

import By.Epam.Traning.dataAccess.exception.DataException;
import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MasFileReader implements MasDAO {

    private static final Logger fileLogger = (Logger) LogManager.getLogger(MasFileReader.class);
    TextManager textManager = TextManager.getInstance();

    public int[] readFile() throws DataException {
        ArrayList<Integer> mas = new ArrayList<Integer>();
        try (java.io.FileReader reader = new java.io.FileReader("F:\\Git-Rep\\Epam\\Works\\Work 3\\Task1.0\\src\\main\\data\\mas.txt")){
            Scanner in = new Scanner(reader);
            int ch;
            String s;
            while(in.hasNextLine()){
                s = in.nextLine();
                try{
                    ch = Integer.parseInt(s);
                    mas.add(ch);
                }
                catch (NumberFormatException e){
                    throw new DataException(textManager.getString("sort.wrongFormatException") + "Mas.FileReader", e);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new DataException(textManager.getString("masFileReader.fileNotFoundException"  + "Mas.FileReader"), e);
        }
        catch (IOException e) {
            throw new DataException(textManager.getString("masFileReader.fileReadingException"  + "Mas.FileReader"), e);
        }
        int[] outmas = new int[mas.size()];
        for (int i = 0; i < mas.size(); i++){
            outmas[i] = mas.get(i);
        }
        fileLogger.info("Success file reading");
        return outmas;
    }
}
