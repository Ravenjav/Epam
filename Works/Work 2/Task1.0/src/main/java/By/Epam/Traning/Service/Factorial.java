package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.InputMismatchException;

public class Factorial {

    public static final Logger factorial = (Logger) LogManager.getLogger(By.Epam.Traning.Service.Factorial.class);

    public int factorial(int n){
        factorial.info("Start of factorial with n = " + n);
        int answer = 1;
        if (n > 19) {
            factorial.error("Error in multForAToN, type overflow");
            factorial.info("-------------------------------");
            throw new IllegalArgumentException("type overflow");
        }
        if (n < 0){
            factorial.error("Error in multForAToN, negative value");
            factorial.info("-------------------------------");
            throw new InputMismatchException("negative value can not be in");
        }
        for (int i = 2; i <= n; i++){
            answer *= i;
        }
        factorial.info("Access factorial");
        return answer;
    }

}
