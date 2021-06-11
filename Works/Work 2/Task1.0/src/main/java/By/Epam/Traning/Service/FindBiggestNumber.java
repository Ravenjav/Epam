package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.InputMismatchException;

public class FindBiggestNumber {

    private static final Logger findBiggestNumber = (Logger) LogManager.getLogger(By.Epam.Traning.Service.FindBiggestNumber.class);

    public int findBiggestNumber(int num){
        findBiggestNumber.info("Start findBiggestNumber with num = " + num);
        if (num < 1000 || num > 9999){
            findBiggestNumber.error("the password have more or less digits");
            findBiggestNumber.info("-------------------------------");
            throw new InputMismatchException("the password must have four digits");
        }
        int ch, ma = 0;
        while (num > 9){
            ch = num % 10;
            if (ch > ma)
                ma = ch;
            num /= 10;
        }
        if (num > ma)
            ma = num;
        findBiggestNumber.info("Done findBiggestNumber");
        return ma;
    }
}
