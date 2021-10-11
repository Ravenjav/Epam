package by.epam.textReader.service.sort;

import by.epam.textReader.entity.Composite;

import java.util.ArrayList;

public class SortText {
    public ArrayList<String> sortWords(Composite text){
        ArrayList<String> out = new ArrayList<String>();
        for (int i = 0; i < text.getSize(); i++){
            Composite paragraf = (Composite) text.getChild(i);
            for (int j = 0; j < paragraf.getSize(); j++){
                Composite sent = (Composite) paragraf.getChild(j);
                out.add(new SortWords().onWordLength(sent));
            }
        }
        return out;
    }

    public ArrayList<String> sortLexem(Composite text, char symbol) {
        ArrayList<String> out = new ArrayList<String>();
        ArrayList<Integer> size = new ArrayList<Integer>();
        int place;
        for (int i = 0; i < text.getSize(); i++){
            Composite paragraf = (Composite) text.getChild(i);
            for (int j = 0; j < paragraf.getSize(); j++){
                Composite sent = (Composite) paragraf.getChild(j);
                for (int g = 0; g < sent.getSize(); g++) {
                    Composite lexem = (Composite) sent.getChild(g);
                    //System.out.println(lexem.out(3));
                    int kol = new SortLexem().findChar(lexem, symbol);
                    place = -1;
                    for (int r = 0; r < out.size(); r++){
                        if (kol < size.get(r) || (kol == size.get(r) && out.get(r).compareTo(lexem.out(3)) < 0)) {
                            place = r;
                            break;
                        }
                    }
                    if (place == -1){
                        out.add(lexem.out(3));
                        size.add(kol);
                    }
                    else {
                        out.add(place, lexem.out(3));
                        size.add(place, kol);
                    }
                }
            }
        }
        return out;
    }
}
