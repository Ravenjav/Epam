package by.epam.textreader.service.compositeService;

import by.epam.textreader.entity.Component;
import by.epam.textreader.entity.Composite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParSeparation implements BaseInterface {
    String text;
    public ParSeparation(String text){
        this.text = text;
    }

    public Component handleRequest(){
        Matcher matcher =  Pattern.compile("[A-Z].+?[\\r\\n]").matcher(text);
        String par;
        Component root  = new Composite();
        while (matcher.find()){
            par = text.substring(matcher.start(), matcher.end());
            root.add(new SentSeparation(par).handleRequest());
        }
        return root;
    }
}
