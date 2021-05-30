package By.Epam.Traning.Expert;

import java.util.ArrayList;

public class MasDouble {
    private double[] mas;

    public MasDouble(ArrayList<Double> mas){
        this.mas = new double[mas.size()];
        for (int i = 0; i < mas.size(); i++){
            this.mas[i] = mas.get(i);
        }
    }

    public double getElement(int id) {
        return mas[id];
    }
}
