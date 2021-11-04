package by.epamtraning.autoshop.action.all;

import by.epamtraning.autoshop.action.Action;

public class Ru extends Action {
    public void use(){
        getTextManager().setEnglish();
        this.setForward(new Forward(getRequest().getSession().getAttribute("lastPage").toString(), true));
    }
}
