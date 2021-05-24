package By.Epam.Traning.Service;

import By.Epam.Traning.Control.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Math.abs;

/**
 Task 1
 */

public class SimpleOperations {

    public static final Logger SimpleOperations = LogManager.getLogger(Controller.class);

    public static Double sum(double x, double y){
        if ( x + y == Double.POSITIVE_INFINITY || x + y == Double.NEGATIVE_INFINITY){
            SimpleOperations.error("Error in sum, type overflow");
            SimpleOperations.info("-------------------------------");
            throw new IllegalArgumentException("type overflow");
        }
        SimpleOperations.info("Access using sum with x = " + x + " y = " + y);
        return (x + y);
    }

    public static Double sub(double x, double y){
        if ( x - y == Double.POSITIVE_INFINITY || x - y == Double.NEGATIVE_INFINITY){
            SimpleOperations.error("Error in sub, type overflow");
            SimpleOperations.info("-------------------------------");
            throw new IllegalArgumentException("type overflow");
        }
        SimpleOperations.info("Access using sub with x = " + x + " y = " + y);
        return (x - y);
    }

    public static Double mult (double x, double y){
        if ( x * y == Double.POSITIVE_INFINITY || x * y == Double.NEGATIVE_INFINITY){
            SimpleOperations.error("Error in mult, type overflow");
            SimpleOperations.info("-------------------------------");
            throw new IllegalArgumentException("type overflow");
        }
        SimpleOperations.info("Access using mult with x = " + x + " y = " + y);
        return (x * y);
    }

    public static Double div(double x, double y){
        if (y == 0){
            SimpleOperations.error("Error in div, div by zero");
            SimpleOperations.info("-------------------------------");
            throw new IllegalArgumentException("Cannot div by zero");
        }
        if ( x / y == Double.POSITIVE_INFINITY || x / y == Double.NEGATIVE_INFINITY){
            SimpleOperations.error("Error in mult, type overflow");
            SimpleOperations.info("-------------------------------");
            throw new IllegalArgumentException("type overflow");
        }
        SimpleOperations.info("Access using div with x = " + x + " y = " + y);
        return (x / y);
    }
}
