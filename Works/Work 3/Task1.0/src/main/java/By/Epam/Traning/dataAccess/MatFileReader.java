package By.Epam.Traning.dataAccess;

import By.Epam.Traning.dataAccess.exception.DataException;
import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MatFileReader implements MatDAO {

    private static final Logger fileLogger = (Logger) LogManager.getLogger(MasFileReader.class);
    TextManager textManager = TextManager.getInstance();

    public int[][] readFile(String file) throws DataException {
        ArrayList<ArrayList<Integer>> mas = new ArrayList<ArrayList<Integer>>();
        try (java.io.FileReader reader = new java.io.FileReader(file)){
            Scanner in = new Scanner(reader);
            int ch, f;
            String s, ss;
            while(in.hasNextLine()){
                ArrayList<Integer> dopmas = new ArrayList<>();
                s = in.nextLine();
                f = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != ' ' && i != s.length() - 1){}
                    else {
                        if (i == s.length() - 1)
                            ss = s.substring(f, i + 1);
                        else
                            ss = s.substring(f, i);
                        try {
                            ch = Integer.parseInt(ss);
                            dopmas.add(ch);
                        } catch (NumberFormatException e) {
                            throw new DataException(textManager.getString("sort.wrongFormatException") + " Mat.FileReader", e);
                        }
                        f = i + 1;
                    }
                }
                mas.add(dopmas);
            }
        }
        catch (FileNotFoundException e) {
            throw new DataException(textManager.getString("masFileReader.fileNotFoundException")  + " Mat.FileReader", e);
        }
        catch (IOException e) {
            throw new DataException(textManager.getString("masFileReader.fileReadingException")  + " Mat.FileReader", e);
        }
        int[][] outmas = new int[mas.size()][mas.get(0).size()];
        for (int i = 0; i < mas.size(); i++){
            if (i > 0) {
                if (mas.get(i).size() != mas.get(0).size())
                    throw new DataException(textManager.getString("sort.wrongFormatException") + "Mat.FileReader");
            }
            for (int j = 0; j < mas.get(i).size(); j++){
                outmas[i][j] = mas.get(i).get(j);
            }
        }
        fileLogger.info("Success file reading");
        return outmas;
    }
}
