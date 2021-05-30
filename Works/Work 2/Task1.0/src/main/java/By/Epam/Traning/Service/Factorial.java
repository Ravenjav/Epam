package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Factorial {

    public static final Logger factorial = (Logger) LogManager.getLogger(By.Epam.Traning.Service.Factorial.class);

    public static int factorial(int n){
        factorial.info("Start of factorial with n = " + n);
        int answer = 1;
        for (int i = 2; i <= n; i++){
            answer *= i;
        }
        factorial.info("Access factorial");
        return answer;
    }

}
