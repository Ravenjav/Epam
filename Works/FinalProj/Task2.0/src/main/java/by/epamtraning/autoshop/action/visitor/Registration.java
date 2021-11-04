package by.epamtraning.autoshop.action.visitor;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.entity.jb.WebLanguage;

public class Registration extends Action {
    public void use(){
        this.getForward().addAttribute("language", getTextManager().getString("Login.language"));
        this.getForward().addAttribute("languageEn", getTextManager().getString("Login.languageEN"));
        this.getForward().addAttribute("languageRu", getTextManager().getString("Login.languageRU"));
        this.getForward().addAttribute("languageNow", getTextManager().getCountry());
        this.getForward().addAttribute("webLang", new WebLanguage());
        getRequest().getSession().setAttribute("lastPage",getRequest().getRequestURL());
        getRequest().setAttribute("info", getForward().getAttributes());
    }
}
