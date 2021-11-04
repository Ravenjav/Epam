package by.epamtraning.autoshop.service;

import by.epamtraning.autoshop.service.visitor.LoginVisitor;

public final class ServiceFactory {
    public static final ServiceFactory instance = new ServiceFactory();

    public ServiceFactory(){}

    public ServiceFactory getInstance(){
        return instance;
    }

    public LoginVisitor getLoginVisitor(){
        return new LoginVisitor();
    }
}
