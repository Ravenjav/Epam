package By.Epam.Traning.textManeger;

import java.util.Locale;
import java.util.ResourceBundle;

public enum Lang {

    EN(ResourceBundle.getBundle("langs.text", new Locale("en", "EN"))),
    RU(ResourceBundle.getBundle("langs.text", new Locale("ru", "BY"))),
    DEFAULT(ResourceBundle.getBundle("langs.text", Locale.getDefault()));
    private ResourceBundle bundle;

    Lang(ResourceBundle bundle){
        this.bundle = bundle;
    }

    public String getString(String ind){
        return bundle.getString(ind);
    }

    public String getReg(){
        return bundle.getLocale().getDisplayLanguage();
    }
}
