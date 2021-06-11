package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class EqualsDouble {

    private static final Logger equalsDouble = (Logger) LogManager.getLogger(By.Epam.Traning.Service.EqualsDouble.class);

    public int equalsDouble(double x, double y){
        equalsDouble.info("Start of equalsDouble with x = " + x + " y = " + y);
        if (x < y) {
            equalsDouble.info("Access equalsDouble");
            return 7;
        }
        else
            equalsDouble.info("Access equalsDouble");
            return 8;
    }
}
