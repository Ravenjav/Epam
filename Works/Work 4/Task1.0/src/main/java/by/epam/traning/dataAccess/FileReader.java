package by.epam.traning.dataAccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import by.epam.traning.dataAccess.exception.DataException;
import by.epam.traning.entity.VouchersStore;
import by.epam.traning.entity.Voucher;
import by.epam.traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class FileReader implements DAO{

    private static final Logger fileLogger = (Logger) LogManager.getLogger(FileReader.class);
    TextManager textManager = TextManager.getInstance();

    public void readFile() throws DataException {
        VouchersStore mas = VouchersStore.getInstance();
        try (java.io.FileReader reader = new java.io.FileReader("F:\\Git-Rep\\Epam\\Works\\Work 4\\Task1.0\\src\\main\\data\\vouchers.txt")){
            Scanner in = new Scanner(reader);
            char i;
            Voucher el;
            char type, transport;
            int eating, days;
            String s;
            while(in.hasNextLine()){
                s = in.nextLine();
                //System.out.println(s);
                i = s.charAt(0);
                if (i != 'R' && i!='E' && i!='T' && i!='S' && i!='C'){
                    throw new DataException(textManager.getString("FileReader.WrongFormat"));
                }
                type = i;

                i = s.charAt(1);
                if (i != ' ')
                    throw new DataException(textManager.getString("FileReader.WrongFormat"));

                i = s.charAt(2);
                if (i != 'P' && i != 'L' && i != 'B')
                    throw new DataException(textManager.getString("FileReader.WrongFormat"));
                transport = i;
                i = s.charAt(3);
                if (i != ' ')
                    throw new DataException(textManager.getString("FileReader.WrongFormat"));

                i = s.charAt(4);
                if (i != '2' && i != '3' && i != '0')
                    throw new DataException(textManager.getString("FileReader.WrongFormat"));
                eating = i - '0';
                i = s.charAt(5);
                if (i != ' ')
                    throw new DataException(textManager.getString("FileReader.WrongFormat"));
                try {
                    days = Integer.parseInt(s.substring(6));
                }catch (NumberFormatException e){
                    throw new DataException(textManager.getString("FileReader.WrongFormat"));
                }
                el = new Voucher(type, transport, eating, days);
                mas.add(el);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new DataException(textManager.getString("FileReading.FNF"),e);
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new DataException(textManager.getString("FileReading.Faild"),e);
        }
        fileLogger.info("Access file reading");
    }
}
