package By.Epam.Traning.textManeger;

public class TextManager {
    private static TextManager ref = new TextManager();
    private static Lang lang = Lang.DEFAULT;

    private TextManager(){ }

    public static TextManager getInstance(){
        return ref;
    }

    public String getString(String key) {
        return lang.getString(key);
    }

    public String getCountry() {
        return lang.getReg();
    }
//TODO one mat
    public void setEnglish() {
        lang = Lang.EN;
    }

    public void setRussian() {
        lang = Lang.RU;
    }
}
