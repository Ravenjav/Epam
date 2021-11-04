package by.epamtraning.autoshop.action.factories;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.action.visitor.TryLogin;

public class TryLoginActionFactory implements ActionFactory{
    public Action createAction(){
        return new TryLogin();
    }
}
