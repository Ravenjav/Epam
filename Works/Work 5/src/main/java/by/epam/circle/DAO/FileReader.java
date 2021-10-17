package by.epam.circle.DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {
    public void read(){
        ArrayList<ArrayList<Integer>> matrix;
        try(FileInputStream fin=new FileInputStream("src/main/data.txt"))
        {
            int i=-1;
            while((i=fin.read())!=-1){

            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
