package by.epam.traning.service;

public class ServiceFactory {
    private static final ServiceFactory factory = new ServiceFactory();
    private final Sort sort = new Sort();
    private final Find find = new Find();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){return factory;}

    public Sort getSort(){
        return sort;
    }

    public Find getFind(){return find;}
}
