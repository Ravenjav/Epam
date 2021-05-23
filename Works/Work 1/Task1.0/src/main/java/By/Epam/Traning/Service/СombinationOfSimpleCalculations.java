package By.Epam.Traning.Service;

import java.util.ArrayList;

import static By.Epam.Traning.Service.SimpleOperations.*;
import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.sqrt;

/**
 Here i doing 9 and 17 tasks by using statistical methods from class SimpleOperations which i use for 1 task
 */

public class СombinationOfSimpleCalculations {

    public static double combinationOfSimpleCalculations(double a, double b, double c, double d){
        return sub(mult(div(a, c), div(b,d)),div(sub(mult(a,b),c),mult(c,d)));
    }

    public static ArrayList<Double> Mean(double x, double y){
        ArrayList<Double> answer = new ArrayList<Double>();
        double arithmeticalMean = div(sum(mult(x, x),mult(y, y)),2);
        answer.add(arithmeticalMean);
        double geometricMean = sqrt(mult(abs(x),abs(y)));
        answer.add(geometricMean);
        return answer;
    }
}
