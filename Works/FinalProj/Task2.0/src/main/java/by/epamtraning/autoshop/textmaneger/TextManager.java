package by.epamtraning.autoshop.textmaneger;

public class TextManager {
    private final static TextManager ref = new TextManager();
    private static Lang lang = Lang.EN;

    private TextManager() {
    }

    public static TextManager getInstance() {
        return ref;
    }

    public String getString(String key) {
        return lang.getString(key);
    }

    public String getCountry() {
        return lang.getReg();
    }

    public void setEnglish() {
        lang = Lang.EN;
    }

    public void setRussian() {
        lang = Lang.RU;
    }
}
