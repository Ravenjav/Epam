package By.Epam.Traning.DataOut;

import java.util.ArrayList;

public class ConsoleOut {
    public void outInt(int x){
        System.out.println(x);
    }

    public void outDouble(double x){
        System.out.println(x);
    }

    public void outString(String s){
        System.out.println(s);
    }

    public void outMasInt(ArrayList<Integer> mas){
        for (int i = 0; i < mas.size(); i++){
            outInt(mas.get(i));
        }
    }
}
