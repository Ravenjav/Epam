package by.epamtraning.autoshop.action.visitor;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.entity.jb.WebLanguage;

public class Login extends Action{

    public Login() {
        super();
    }

    public void use(){
        this.setForward(new Forward("/WEB-INF/jsp/visitor/login.jsp", false));
        this.getForward().addAttribute("Login", getTextManager().getString("Login.Login"));
        this.getForward().addAttribute("Password", getTextManager().getString("Login.Password"));
        this.getForward().addAttribute("Back", getTextManager().getString("Login.Back"));
        this.getForward().addAttribute("language", getTextManager().getString("Login.language"));
        this.getForward().addAttribute("languageEn", getTextManager().getString("Login.languageEN"));
        this.getForward().addAttribute("languageRu", getTextManager().getString("Login.languageRU"));
        this.getForward().addAttribute("languageNow", getTextManager().getCountry());
        this.getForward().addAttribute("webLang", new WebLanguage());
        getRequest().getSession().setAttribute("lastPage",getRequest().getRequestURL());
        getRequest().setAttribute("info", getForward().getAttributes());
    }

}
