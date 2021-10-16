package by.epam.textreader.service.sort;

import by.epam.textreader.entity.Composite;

import java.util.ArrayList;
import java.util.Collections;

public class SortWords {
    public String onWordLength(Composite sent){
        String out = "";
        ArrayList<String> mas = new ArrayList<String>();
        for (int i = 0; i < sent.getSize(); i++) {
            Composite lexem = (Composite) sent.getChild(i);
            for (int j = 0; j < lexem.getSize() - 1; j++) {
                mas.add(lexem.getChild(j).out(4));
            }
        }
        for (int i = 1; i < mas.size(); i++){
            for (int j = 0; j < mas.size() - 1; j++){
                if (mas.get(j).length() > mas.get(j + 1).length())
                    Collections.swap(mas, j, j + 1);
            }
        }
        for (int i = 0; i < mas.size(); i++){
            out += mas.get(i) + " ";
        }
        return out;
    }
}
