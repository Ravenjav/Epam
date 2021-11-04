package by.epamtraning.autoshop.action.factories;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.action.all.Ru;

public class RuActionFactory implements ActionFactory{
    public Action createAction(){
        return new Ru();
    }
}
