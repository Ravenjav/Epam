package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.ArrayList;

public class SimpleFor {

    private static final Logger simpleFor = (Logger) LogManager.getLogger(By.Epam.Traning.Service.SimpleFor.class);

    public ArrayList<Integer> simpleFor(){
        simpleFor.info("Start simpleFor");
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++){
            answer.add(i);
        }
        simpleFor.info("Access simpleFor");
        return answer;
    }

    public int sumFor(){
        simpleFor.info("Start sumFor");
        int sum = 0;
        for (int i = 1; i < 101; i++){
            sum += i * i;
        }
        simpleFor.info("Access sumFor");
        return sum;
    }

    public double multForAToN(double a, int n){
        simpleFor.info("Start multForAToN with a = " + a + " n = " + n);
        double answer = 1;
        for (double i = 0; i < n; i++){
            answer *= (a + i);
            System.out.println(answer);
            if ( answer == Double.POSITIVE_INFINITY || answer == Double.NEGATIVE_INFINITY){
                simpleFor.error("Error in multForAToN, type overflow");
                simpleFor.info("-------------------------------");
                throw new IllegalArgumentException("type overflow");
            }
        }
        simpleFor.info("Access multForAToN");
        return answer;
    }



}
