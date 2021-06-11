package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class TemperatureAnalysis {

    public static final Logger temperatureAnalysis  = (Logger) LogManager.getLogger(TemperatureAnalysis.class);

    public boolean temperatureAnalysis (double t){
        temperatureAnalysis.info("Start equals3Double with t = " + t);
        if (t > 60.0) {
            temperatureAnalysis.info("Done equals3Double");
            return true;
        }
        else{
            temperatureAnalysis.info("Done equals3Double");
            return false;
        }
    }
}
