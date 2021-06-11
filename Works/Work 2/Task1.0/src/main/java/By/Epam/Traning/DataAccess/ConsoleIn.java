package By.Epam.Traning.DataAccess;

import By.Epam.Traning.Control.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleIn {

    public static final Logger consoleIn = LogManager.getLogger(By.Epam.Traning.DataAccess.ConsoleIn.class);

    public double scanDouble(){
        double x;
        try {
            Scanner in = new Scanner(System.in);
            x = in.nextDouble();
        } catch (InputMismatchException e) {
            consoleIn.error("invalid data format");
            consoleIn.info("-------------------------------");
            throw new InputMismatchException("invalid data format");
        }
        return x;
    }

    public int scanInt(){
        int x;
        try {
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
        } catch (InputMismatchException e) {
            consoleIn.error("invalid data format");
            consoleIn.info("-------------------------------");
            throw new InputMismatchException("invalid data format");
        }
        return x;
    }
}
