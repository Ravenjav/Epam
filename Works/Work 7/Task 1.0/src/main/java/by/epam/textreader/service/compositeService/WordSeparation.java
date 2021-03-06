package by.epam.textreader.service.compositeService;

import by.epam.textreader.entity.Component;
import by.epam.textreader.entity.Composite;
import by.epam.textreader.entity.LeafMark;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSeparation {
    String lexem;
    public WordSeparation(String text){
        this.lexem = text;
    }

    public Component handleRequest(){
        Matcher matcher =  Pattern.compile("([^-.!?,:;\\s]+)").matcher(lexem);
        String word, punctuation = "";
        Component root  = new Composite();
        while (matcher.find()){
            word = lexem.substring(matcher.start(), matcher.end());
            root.add(new CharSeparation(word).handleRequest());
        }
        matcher =  Pattern.compile("([-.!?,:;]+)").matcher(lexem);
        while (matcher.find()){
            punctuation += lexem.substring(matcher.start(), matcher.end());
            root.add(new LeafMark(punctuation));
        }
        return root;
    }
}
