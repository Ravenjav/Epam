package By.Epam.Traning.Service;

import java.util.ArrayList;

import static By.Epam.Traning.Service.SimpleOperations.*;
import static java.lang.StrictMath.sqrt;

public class QuadraticEquations {
    public static ArrayList<Double> roots (double a, double b, double c){
        ArrayList<Double> answer = new ArrayList<Double>();
        double d = sub(mult(b, b),mult(mult(4, a),c));
        answer.add(div(sub(-b, sqrt(d)), mult(2, a)));
        answer.add(div(sum(-b, sqrt(d)), mult(2, a)));
        return answer;
    }
}