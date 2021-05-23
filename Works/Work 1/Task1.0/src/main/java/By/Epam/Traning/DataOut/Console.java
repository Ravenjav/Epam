package By.Epam.Traning.DataOut;

import java.util.ArrayList;

public class Console {
    public static void out(ArrayList<Double> out){
        System.out.println("Сумма = " + out.get(0) + '\n' + "Разность =" + out.get(1) + '\n' +
                            "Произведение = " + out.get(2) + '\n' + "Частное = " + out.get(3) + '\n' +
                            "Ответ на Task9 = " + out.get(4) + '\n' + "Среднее арифметическое кубов = " + out.get(5) +
                            '\n' + "Среднее геометрическое модулей = " + out.get(6) + '\n' +
                            "Корни квадратного уравнения: x1 = " + out.get(7) + " x2 = " + out.get(8) + '\n');
    }
}
