package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class SimpleIf {

    public static final Logger simpleIf = (Logger) LogManager.getLogger(By.Epam.Traning.Service.SimpleIf.class);

    public static int simpleIf(int x, int y){
        simpleIf.info("Start simpleIf with x = " + x + " y = " + y);
        if (x == y){
            simpleIf.info("Done simpleIf");
            return 0;
        }
        if (x > y){
            simpleIf.info("Done simpleIf");
            return x;
        }
        else{
            simpleIf.info("Done simpleIf");
            return y;
        }
    }
}
