package By.Epam.Traning.DataAccess;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Scan {
    public static ArrayList<Double> ScanDouble(){
        Scanner in = new Scanner(System.in);
        ArrayList<Double> data= new ArrayList<Double>();

        System.out.println("Ввведите x, y (Task 1)");
        data.add(in.nextDouble());
        data.add(in.nextDouble());

        System.out.println("Введите a, b, c, d (Task 9");
        for (int i = 0; i < 4; i ++)
            data.add(in.nextDouble());

        System.out.println("Введите два числа(Task 17)");
        data.add(in.nextDouble());
        data.add(in.nextDouble());

        System.out.println("Введите a, b, c (Task 25");
        for (int i = 0; i < 3; i ++)
            data.add(in.nextDouble());

        return data;
    }
}
