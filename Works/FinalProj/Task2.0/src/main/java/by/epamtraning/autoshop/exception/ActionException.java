package by.epamtraning.autoshop.exception;

public class ActionException extends Exception {
    private static final long serialVersionUID = 1L;

    public ActionException(){
        super();
    }

    public ActionException(String massage){
        super(massage);
    }

    public ActionException(Exception e){
        super(e);
    }

    public ActionException(String massage, Exception e){
        super(massage, e);
    }
}
