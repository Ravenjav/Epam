package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class AccessLevel {

    public static final Logger accessLevel = (Logger) LogManager.getLogger(By.Epam.Traning.Service.AccessLevel.class);

    public char accessLevel(int x){
        accessLevel.info("Start equals3Double with x = " + x);
        if (x == 9583 || x == 1747){
            accessLevel.info("Done equals3Double");
            return 'A';
        }

        if (x == 3331 || x == 7922){
            accessLevel.info("Done equals3Double");
            return 'B';
        }

        if (x == 9455 || x == 8997){
            accessLevel.info("Done equals3Double");
            return 'C';
        }

        accessLevel.info("Done equals3Double");
        return 'Z';
    }
}
