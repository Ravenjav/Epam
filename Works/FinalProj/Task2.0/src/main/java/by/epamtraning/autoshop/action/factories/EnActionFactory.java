package by.epamtraning.autoshop.action.factories;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.action.all.En;

public class EnActionFactory implements ActionFactory{
    public Action createAction(){
        return new En();
    }
}
