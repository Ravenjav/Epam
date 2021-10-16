package by.epam.textreader.service.compositeService;

import by.epam.textreader.entity.Component;
import by.epam.textreader.entity.Composite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentSeparation implements BaseInterface {
    String par;
    public SentSeparation(String text){
        this.par = text;
    }

    public Component handleRequest(){
        Matcher matcher =  Pattern.compile("([A-Z].+?[.!?]+)").matcher(par);
        String sentence;
        Component root  = new Composite();
        while (matcher.find()){
            sentence = par.substring(matcher.start(), matcher.end());
            root.add(new LexemSeparation(sentence).handleRequest());
        }
        return root;
    }
}
