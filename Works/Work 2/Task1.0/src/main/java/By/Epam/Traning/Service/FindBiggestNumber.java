package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class FindBiggestNumber {

    public static final Logger findBiggestNumber = (Logger) LogManager.getLogger(By.Epam.Traning.Service.FindBiggestNumber.class);

    public static int findBiggestNumber(int num){
        findBiggestNumber.info("Start findBiggestNumber with num = " + num);
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
