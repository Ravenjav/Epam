package By.Epam.Traning.Service;

import By.Epam.Traning.Control.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

import static By.Epam.Traning.Service.SimpleOperations.*;
import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.sqrt;

/**
 Here i doing 9 and 17 tasks by using statistical methods from class SimpleOperations
 */

public class СombinationOfSimpleCalculations {

    public static final Logger СombinationOfSimpleCalculations = LogManager.getLogger(Controller.class);

    public static double combinationOfSimpleCalculations(double a, double b, double c, double d){
        СombinationOfSimpleCalculations.info("Start of execution combinationOfSimpleCalculations with a = " + a + " b = " + b + " c = " + c + " d = " + d);
        double answer = sub(mult(div(a, c), div(b,d)),div(sub(mult(a,b),c),mult(c,d)));
        СombinationOfSimpleCalculations.info("Access end of combinationOfSimpleCalculations");
        return answer;
    }

    public static ArrayList<Double> Mean(double x, double y){
        ArrayList<Double> answer = new ArrayList<Double>();
        СombinationOfSimpleCalculations.info("Start of execution Mean with x = " + x + " y = " + y);
        double arithmeticalMean = div(sum(mult(x, x),mult(y, y)),2);
        answer.add(arithmeticalMean);
        double geometricMean = sqrt(mult(abs(x),abs(y)));
        answer.add(geometricMean);
        СombinationOfSimpleCalculations.info("Access end of Mean");
        return answer;
    }
}
