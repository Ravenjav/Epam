package By.Epam.Traning.Control;

import By.Epam.Traning.DataAccess.ConsoleIn;
import By.Epam.Traning.Expert.MasDouble;
import By.Epam.Traning.Expert.MasInt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

import static By.Epam.Traning.DataOut.ConsoleOut.*;
import static By.Epam.Traning.Service.AccessLevel.accessLevel;
import static By.Epam.Traning.Service.Equals3Double.equals3Double;
import static By.Epam.Traning.Service.EqualsDouble.equalsDouble;
import static By.Epam.Traning.Service.Factorial.factorial;
import static By.Epam.Traning.Service.FindBiggestNumber.findBiggestNumber;
import static By.Epam.Traning.Service.SimpleFor.*;
import static By.Epam.Traning.Service.SimpleIf.simpleIf;
import static By.Epam.Traning.Service.TemperatureAnalysis.temperatureAnalysis;

public class Controller {

    public static final Logger controller = LogManager.getLogger(By.Epam.Traning.Control.Controller.class);

    public static void start(){
        controller.info("Access start program");

        /**Read from console*/
        ArrayList<ArrayList> allinfo = new ArrayList<ArrayList>();
        allinfo = ConsoleIn.scanAllInfo();

        for (int f = 0; f < allinfo.size(); f ++){
            for (int j = 0; j < allinfo.get(f).size(); j ++){
                System.out.print(allinfo.get(f).get(j) + " ");
            }
            System.out.println();
        }

        MasDouble masDouble = new MasDouble(allinfo.get(0));
        MasInt masInt = new MasInt(allinfo.get(1));

        /** Task 2.1  Class EqualsDouble*/
        outInt(equalsDouble(masDouble.getElement(0), masDouble.getElement(1)));

        /** Task 2.9  Class Equals3Double*/
        boolean answer = equals3Double(masDouble.getElement(2), masDouble.getElement(3), masDouble.getElement(4));
        if (answer)
            outString("Треугольник равносторонний");
        else
            outString("Треугольник не равносторонний");

        /** Task 2.17  Class SimpleIf*/
        int x = simpleIf(masInt.getElement(0), masInt.getElement(1));
        outString(x + " " + x);

        /** Task 2.25  Class TemperatureAnalysis */
        answer = temperatureAnalysis(masDouble.getElement(5));
        if (answer)
            outString("Пожароопасная ситуация");

        /** Task 2.33  Class AccessLevel */
        x = accessLevel(masInt.getElement(2));
        switch (x){
            case (1):{
                outString("Ваш уровень доступа A");
                break;
            }
            case (2):{
                outString("Ваш уровень доступа B");
                break;
            }
            case (3):{
                outString("Ваш уровень доступа C");
                break;
            }
            default:
                outString("Пароль неверный");
        }

        /** Task 3.1  Class SimpleFor */
        outArrayInt(simpleFor());

        /** Task 3.9  Class SimpleFor */
        outInt(sumFor());

        /** Task 3.17  Class SimpleFor */
        outInt(multForAToN(masInt.getElement(3), masInt.getElement(4)));

        /** Task 3.25  Class Factorial */
        outInt(factorial(masInt.getElement(5)));

        /** Task 3.33  Class findBiggestNumber */
        outInt(findBiggestNumber(masInt.getElement(6)));

        return;
    }
}
