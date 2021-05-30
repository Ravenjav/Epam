package By.Epam.Traning.DataOut;

import java.util.ArrayList;

public class ConsoleOut {
    public static void outInt(int x){
        System.out.println(x);
    }

    public static void outString(String s){
        System.out.println(s);
    }

    public static void outArrayInt(ArrayList<Integer> mas){
        for (int i = 0; i < mas.size(); i++){
            outInt(mas.get(i));
        }
    }
}
