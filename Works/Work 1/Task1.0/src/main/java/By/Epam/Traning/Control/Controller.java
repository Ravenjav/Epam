package By.Epam.Traning.Control;

import By.Epam.Traning.DataOut.Console;
import java.util.ArrayList;

import static By.Epam.Traning.DataAccess.Scan.*;
import static By.Epam.Traning.Service.SimpleOperations.*;
import static By.Epam.Traning.Service.QuadraticEquations.roots;
import static By.Epam.Traning.Service.СombinationOfSimpleCalculations.*;


public class Controller {
    public static void useAll(){
        /**Read from console*/
        ArrayList<Double> in = new ArrayList<Double>();
        in = ScanDouble();

        ArrayList<Double> out = new ArrayList<Double>();

        /** Task1  Class SimpleOperations*/
        out.add(sum(in.get(0), in.get(1)));
        out.add(sub(in.get(0), in.get(1)));
        out.add(mult(in.get(0), in.get(1)));
        out.add(div(in.get(0), in.get(1)));

        /** Task 9 Class CombinationOfSimpleCalculations*/
        out.add(combinationOfSimpleCalculations(in.get(2), in.get(3), in.get(4), in.get(5)));

        /** Task 17 Class CombinationOfSimpleCalculations*/
        out.addAll(Mean(in.get(6), in.get(7)));

        /** Task 25* Class QuadraticEquations*/
        out.addAll(roots(in.get(8), in.get(9), in.get(10)));
        Console.out(out);
    }
}
