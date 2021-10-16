package by.epam.textreader.service.sort;

import by.epam.textreader.entity.Composite;

public class SortParagraphs {
    public Composite onSentNumb(Composite text){
        int kol1, kol2;
        for (int i = 1; i < text.getSize(); i++){
            for (int j = 0; j < text.getSize() - 1; j++){
                kol1 = ((Composite) text.getChild(j)).getSize();
                kol2 = ((Composite) text.getChild(j + 1)).getSize();
                if (kol1 > kol2){
                    text.swap(j, j + 1);
                }
            }
        }
        return text;
    }
}
