package by.epam.textreader.service.sort;

import by.epam.textreader.entity.Composite;

public class SortLexem {
    public int findChar(Composite lexem, char symbol){
        int kol = 0;
        for (int i = 0;i < lexem.getSize(); i++){
            if (i != lexem.getSize() - 1){
                Composite word = (Composite) lexem.getChild(i);
                for (int j = 0; j < word.getSize(); j++){
                    if (symbol == (word.getChild(j).out(5).charAt(0)))
                        kol++;
                }
            }
            else{
                for (int j = 0; j < lexem.getChild(i).out(5).length(); j++)
                    if (symbol == lexem.getChild(i).out(5).charAt(j))
                        kol++;
            }
        }
        return kol;
    }
}
