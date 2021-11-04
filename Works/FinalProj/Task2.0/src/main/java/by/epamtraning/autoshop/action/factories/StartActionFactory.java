package by.epamtraning.autoshop.action.factories;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.action.visitor.Start;

public class StartActionFactory implements ActionFactory{
    public Action createAction(){
        return new Start();
    }
}
