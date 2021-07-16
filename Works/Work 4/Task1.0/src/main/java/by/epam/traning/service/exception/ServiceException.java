package by.epam.traning.service.exception;

public class ServiceException extends Exception{
    private static final long serialVersionUID = 1L;

    public ServiceException(){
        super();
    }

    public ServiceException(String massage){
        super(massage);
    }

    public ServiceException(Exception e){
        super(e);
    }

    public ServiceException(String massage, Exception e){
        super(massage, e);
    }
}
