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

    public static ArrayList<ArrayList> scanAllInfo(){
        ArrayList<ArrayList> alldata = new ArrayList<ArrayList>();
        ArrayList<Double> datadub= new ArrayList<Double>();
        ArrayList<Integer> dataint = new ArrayList<Integer>();
        int i = 0;

        System.out.println("!Ввод каждого нового числа проводиться с новой строки!");

        System.out.println("Ввведите два числа (Task 2.1)");
        while (i < 2) {
            datadub.add(scanDouble());
            i++;
        }

        i = 0;
        System.out.println("Введите три стороны треугольника (Task 2.9)");
        while (i < 3) {
            datadub.add(scanDouble());
            i++;
        }

        i = 0;
        System.out.println("Введите два числа(Task 2.17)");
        while (i < 2) {
            dataint.add(scanInt());
            i++;
        }

        i = 0;
        System.out.println("Введите текущую температуру в комнате (Task 2.25)");
        datadub.add(scanDouble());

        System.out.println("Введите четырехзначный пароль (Task 2.33)");
        dataint.add(scanInt());
        if (dataint.get(dataint.size() - 1) < 1000 || dataint.get(dataint.size() - 1) > 9999){
            consoleIn.error("the password have more or less digits");
            consoleIn.info("-------------------------------");
            throw new InputMismatchException("the password must have four digits");
        }

        System.out.println("Введите два числа (Task 3.17)");
        while (i < 2) {
            dataint.add(scanInt());
            i++;
        }
        i = 0;
        System.out.println("Введите число факториал которого хотите найти (Task 3.25)");
        dataint.add(scanInt());

        System.out.println("Введите натуральное число (Task 3.33)");
        dataint.add(scanInt());

        alldata.add(datadub);
        alldata.add(dataint);
        consoleIn.info("Access read all info");
        return alldata;
    }

    public static double scanDouble(){
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

    public static int scanInt(){
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
