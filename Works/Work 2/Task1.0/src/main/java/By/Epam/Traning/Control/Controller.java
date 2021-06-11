package By.Epam.Traning.Control;

import By.Epam.Traning.DataAccess.ConsoleIn;
import By.Epam.Traning.DataOut.ConsoleOut;
import By.Epam.Traning.Service.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Controller {

    private static final Logger controller = LogManager.getLogger(By.Epam.Traning.Control.Controller.class);

    public void start(){
        controller.info("Access start program");

        ConsoleIn inData = new ConsoleIn();
        ConsoleOut outData = new ConsoleOut();

        outData.outString("Каждое число вводиться с новой строки");

        /** Task 2.1 */
        EqualsDouble eD = new EqualsDouble();
        outData.outString("Ввведите два числа (Task 2.1)");
        outData.outInt(eD.equalsDouble(inData.scanDouble(), inData.scanInt()));

        /** Task 2.9 */
        outData.outString("Введите три стороны треугольника (Task 2.9)");
        Equals3Double e3D = new Equals3Double();
        boolean answer = e3D.equals3Double(inData.scanDouble(), inData.scanDouble(), inData.scanDouble());
        if (answer)
            outData.outString("Треугольник равносторонний");
        else
            outData.outString("Треугольник не равносторонний");

        /** Task 2.17 */
        SimpleIf sI = new SimpleIf();
        outData.outString("Введите два числа(Task 2.17)");
        int x = sI.simpleIf(inData.scanInt(), inData.scanInt());
        outData.outString(x + " " + x);

        /** Task 2.25 */
        TemperatureAnalysis tA = new TemperatureAnalysis();
        outData.outString("Введите текущую температуру в комнате (Task 2.25)");
        answer = tA.temperatureAnalysis(inData.scanDouble());
        if (answer)
            outData.outString("Пожароопасная ситуация");

        /** Task 2.33 */
        AccessLevel aL = new AccessLevel();
        outData.outString("Введите четырехзначный пароль (Task 2.33)");
        char y = aL.accessLevel(inData.scanInt());
        if (x == 'Z')
            outData.outString("Пароль неверный");
        else
            outData.outString("Ваш уровень доступа: " + y);

        SimpleFor sF = new SimpleFor();
        /** Task 3.1 */
        outData.outMasInt(sF.simpleFor());

        /** Task 3.9 */
        outData.outInt(sF.sumFor());

        /** Task 3.17 */
        outData.outString("Введите a и n (Task 3.17)");
        outData.outDouble(sF.multForAToN(inData.scanDouble(), inData.scanInt()));

        /** Task 3.25 */
        outData.outString("Введите число (Task 3.25)");
        Factorial f = new Factorial();
        outData.outInt(f.factorial(inData.scanInt()));

        /** Task 3.33 */
        outData.outString("Введите число (Task 3.33)");
        FindBiggestNumber find = new FindBiggestNumber();
        outData.outInt(find.findBiggestNumber(inData.scanInt()));

        return;
    }
}
