package by.epamtraning.autoshop.action.factories;

import by.epamtraning.autoshop.action.Action;
import by.epamtraning.autoshop.action.visitor.Login;

public class LoginActionFactory implements ActionFactory {
    public Action createAction(){
        return new Login();
    }
}
