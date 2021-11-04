package by.epamtraning.autoshop.textmaneger;

import java.util.Locale;
import java.util.ResourceBundle;

public enum Lang {
    EN(ResourceBundle.getBundle("langs.lang", new Locale("En", "US"))),
    RU(ResourceBundle.getBundle("langs.lang", new Locale("Ru", "BY"))),
    DEFAULT(ResourceBundle.getBundle("langs.lang", Locale.getDefault()));
    private ResourceBundle bundle;

    Lang(ResourceBundle bundle){
        this.bundle = bundle;
    }

    public String getString(String ind){
        return bundle.getString(ind);
    }

    public String getReg(){
        if (bundle == Lang.EN.bundle)
            return "En";
        else
            return "Ru";
    }
}
