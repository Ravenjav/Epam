package By.Epam.Traning.Expert;

import java.util.ArrayList;

public class MasInt {
    private int[] mas;

    public MasInt (ArrayList<Integer> mas){
        this.mas = new int[mas.size()];
        for (int i = 0; i < mas.size(); i++){
            this.mas[i] = mas.get(i);
        }
    }

    public int getElement(int id) {
        return mas[id];
    }
}
