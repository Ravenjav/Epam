package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.InputMismatchException;

import static java.lang.StrictMath.abs;

public class Equals3Double {

    public static final Logger equals3Double = (Logger) LogManager.getLogger(By.Epam.Traning.Service.Equals3Double.class);

    public static boolean equals3Double (double a, double b, double c){
        equals3Double.info("Start equals3Double with a =" + a + " b = " + b + " c = " + c);
        if (a <= 0 || b <= 0 || c <= 0){
            equals3Double.error("side length 0 or negative ");
            equals3Double.info("-------------------------------");
            throw new InputMismatchException("side length can not be 0 or negative");
        }
        if ((abs(a - b) < 0.0001) && (abs(a - c) < 0.0001)) {
            equals3Double.info("Done equals3Double");
            return true;
        }
        else{
            equals3Double.info("Done equals3Double");
            return false;
        }
    }
}
