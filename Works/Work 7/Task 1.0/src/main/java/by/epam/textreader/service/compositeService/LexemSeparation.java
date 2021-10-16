package by.epam.textreader.service.compositeService;

import by.epam.textreader.entity.Component;
import by.epam.textreader.entity.Composite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemSeparation implements BaseInterface {
    String sentence;
    public LexemSeparation(String text){
        this.sentence = text;
    }

    public Component handleRequest(){
        //System.out.println(sentence + "LOL");
        Matcher matcher =  Pattern.compile("([^-.!?,:;\\s].+?[-.!?,:;]+)").matcher(sentence);
        String lexem, punctuation;
        Component root  = new Composite();
        while (matcher.find()){
            lexem = sentence.substring(matcher.start(), matcher.end());
            //System.out.println(lexem);
            root.add(new WordSeparation(lexem).handleRequest());
        }
        return root;
    }
}
