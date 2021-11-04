package by.epamtraning.autoshop.entity.jb;

import java.io.Serializable;

public class WebLanguage implements Serializable {
    String language;
    public WebLanguage(){}

    public WebLanguage(String lang){
        language = lang;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean equalsString(String s1, String s2){
        return s1.equals(s2);
    }
}
