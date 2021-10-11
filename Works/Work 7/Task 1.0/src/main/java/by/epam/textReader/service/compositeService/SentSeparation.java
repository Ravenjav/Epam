package by.epam.textReader.service.compositeService;

import by.epam.textReader.entity.Component;
import by.epam.textReader.entity.Composite;
import by.epam.textReader.service.compositeService.BaseInterface;
import by.epam.textReader.service.compositeService.LexemSeparation;

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
