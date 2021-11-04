package by.epamtraning.autoshop.action.factories;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.action.visitor.Registration;

public class RegistrationActionFactory implements ActionFactory{
    public Action createAction(){
        return new Registration();
    }
}
