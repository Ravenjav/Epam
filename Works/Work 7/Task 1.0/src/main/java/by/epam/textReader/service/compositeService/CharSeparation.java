package by.epam.textReader.service.compositeService;

import by.epam.textReader.entity.Component;
import by.epam.textReader.entity.Composite;
import by.epam.textReader.entity.LeafSymbol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharSeparation {
    String word;
    public CharSeparation(String text){
        this.word = text;
    }

    public Component handleRequest(){
        Matcher matcher =  Pattern.compile("(.+?)").matcher(word);
        char symbol ;
        Component root  = new Composite();
        while (matcher.find()){
            symbol = word.substring(matcher.start(), matcher.end()).charAt(0);
            //System.out.println(symbol);
            root.add(new LeafSymbol(symbol));
        }
        return root;
    }
}
