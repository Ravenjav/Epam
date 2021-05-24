package By.Epam.Traning.Service;

import By.Epam.Traning.Control.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

import static By.Epam.Traning.Service.SimpleOperations.*;
import static java.lang.StrictMath.sqrt;



public class QuadraticEquations {

    public static final Logger QuadraticEquations = LogManager.getLogger(Controller.class);

    public static ArrayList<Double> roots (double a, double b, double c) {
        QuadraticEquations.info("Start finding roots with a = " + a + " b = " + b + " c = " + c);
        ArrayList<Double> answer = new ArrayList<Double>();
        double d = sub(mult(b, b),mult(mult(4, a),c));
        answer.add(div(sub(-b, sqrt(d)), mult(2, a)));
        answer.add(div(sum(-b, sqrt(d)), mult(2, a)));
        QuadraticEquations.info("Access finding roots");
        return answer;
    }
}