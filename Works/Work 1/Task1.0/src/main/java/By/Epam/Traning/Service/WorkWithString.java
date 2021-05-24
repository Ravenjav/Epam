package By.Epam.Traning.Service;

import By.Epam.Traning.Control.Controller;
import By.Epam.Traning.DataOut.Console;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorkWithString {

    public static final Logger WorkWithString = LogManager.getLogger(Controller.class);

    public static void findChar(String s, char ch){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ch) {
                WorkWithString.info("Find Char");
                Console.outString("Number of element = " + (i + 1));
                String out = "";
                if (i > 0)
                    out += s.charAt(i - 1);
                out += " ";
                if (i < s.length() - 1)
                    out += s.charAt(i + 1);
                Console.outString("adjacent elements :" + out);
                return;
            }
        }
        Console.outString("input symbol not found");
        WorkWithString.info("Not find Char");
        return;
    }
}
