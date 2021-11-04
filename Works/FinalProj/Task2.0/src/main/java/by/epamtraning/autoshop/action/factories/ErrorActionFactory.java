package by.epamtraning.autoshop.action.factories;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.action.all.Error;

public class ErrorActionFactory implements ActionFactory{
    public Action createAction(){
        return new Error();
    }
}
