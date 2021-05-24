package By.Epam.Traning.DataAccess;

import By.Epam.Traning.Control.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {

    public static final Logger Scan = LogManager.getLogger(Controller.class);

    public static ArrayList<Double> scanDouble(){
        Scanner in = new Scanner(System.in);
        ArrayList<Double> data= new ArrayList<Double>();
        int i = 0;

        System.out.println("Ввведите x, y (Task 1)");
        while (i < 2) {
            try {
                data.add(in.nextDouble());
            } catch (InputMismatchException e) {
                Scan.error("invalid data format");
                Scan.info("-------------------------------");
                throw new InputMismatchException("invalid data format");
            }
            i++;
        }

        i = 0;
        System.out.println("Введите a, b, c, d (Task 9");
        while (i < 4) {
            try {
                data.add(in.nextDouble());
            } catch (InputMismatchException e) {
                Scan.error("invalid data format");
                Scan.info("-------------------------------");
                throw new InputMismatchException("invalid data format");
            }
            i++;
        }

        i = 0;
        System.out.println("Введите два числа(Task 17)");
        while (i < 2) {
            try {
                data.add(in.nextDouble());
            } catch (InputMismatchException e) {
                Scan.error("invalid data format");
                Scan.info("-------------------------------");
                throw new InputMismatchException("invalid data format");
            }
            i++;
        }

        i = 0;
        System.out.println("Введите a, b, c (Task 25)");
        while (i < 3) {
            try {
                data.add(in.nextDouble());
            } catch (InputMismatchException e) {
                Scan.error("invalid data format");
                Scan.info("-------------------------------");
                throw new InputMismatchException("invalid data format");
            }
            i++;
        }

        Scan.info("Access read Double");
        return data;
    }

    public static String scanString(){
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s == null){
            Scan.error("String can not be null");
            Scan.info("-------------------------------");
            throw new InputMismatchException("String can not be null");
        }
        return s;
    }

    public static char scanChar(){
        System.out.println("Введите искомый символ");
        Scanner in = new Scanner(System.in);
        Character ch = in.next().charAt(0);
        if (ch == null){
            Scan.error("Symbol can not be null");
            Scan.info("-------------------------------");
            throw new InputMismatchException("Symbol can not be null");
        }
        return ch;
    }
}
