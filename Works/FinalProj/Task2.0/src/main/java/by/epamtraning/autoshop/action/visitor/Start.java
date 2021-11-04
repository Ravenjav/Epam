package by.epamtraning.autoshop.action.visitor;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.entity.jb.WebLanguage;

public class Start extends Action {

    public Start() {
        super();
    }

    public void use(){
        this.setForward(new Forward("/WEB-INF/jsp/all/start.jsp", false));
        this.getForward().addAttribute("login", getTextManager().getString("Login.login"));
        this.getForward().addAttribute("registration", getTextManager().getString("Login.registration"));
        this.getForward().addAttribute("continue", getTextManager().getString("Login.continue"));
        this.getForward().addAttribute("welcomeMes", getTextManager().getString("Login.welcomeMes"));
        this.getForward().addAttribute("language", getTextManager().getString("Login.language"));
        this.getForward().addAttribute("languageEn", getTextManager().getString("Login.languageEN"));
        this.getForward().addAttribute("languageRu", getTextManager().getString("Login.languageRU"));
        this.getForward().addAttribute("languageNow", getTextManager().getCountry());
        this.getForward().addAttribute("webLang", new WebLanguage());
        getRequest().getSession().setAttribute("lastPage",getRequest().getRequestURL());
        getRequest().getSession().setAttribute("Back",getRequest().getRequestURL());
        //System.out.println(getRequest().getSession().getAttribute("Back"));
        getRequest().setAttribute("info", getForward().getAttributes());
    }
}
