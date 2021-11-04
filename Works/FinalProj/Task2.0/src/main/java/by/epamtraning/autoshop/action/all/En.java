package by.epamtraning.autoshop.action.all;

import by.epamtraning.autoshop.action.Action;

public class En extends Action {
    public void use(){
        getTextManager().setEnglish();
        //getRequest().getSession()
        this.setForward(new Forward(getRequest().getSession().getAttribute("lastPage").toString(), true));
    }
}
