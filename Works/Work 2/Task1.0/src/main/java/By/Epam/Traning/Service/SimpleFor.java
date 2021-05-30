package By.Epam.Traning.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.ArrayList;

public class SimpleFor {

    public static final Logger simpleFor = (Logger) LogManager.getLogger(By.Epam.Traning.Service.SimpleFor.class);

    public static ArrayList<Integer> simpleFor(){
        simpleFor.info("Start simpleFor");
        ArrayList<Integer> answer= new ArrayList<Integer>();
        for (int i = 1; i < 6; i++){
            answer.add(i);
        }
        simpleFor.info("Access simpleFor");
        return answer;
    }

    public static int sumFor(){
        simpleFor.info("Start sumFor");
        int sum = 0;
        for (int i = 1; i < 101; i++){
            sum += i * i;
        }
        simpleFor.info("Access sumFor");
        return sum;
    }

    public static int multForAToN(int a, int n){
        simpleFor.info("Start multForAToN with a = " + a + " n = " + n);
        int answer = 1;
        for (int i = a; i < (a + n); i++){
            answer *= i;
        }
        simpleFor.info("Access multForAToN");
        return answer;
    }



}
