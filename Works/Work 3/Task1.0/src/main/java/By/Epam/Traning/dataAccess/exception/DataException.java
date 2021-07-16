package By.Epam.Traning.dataAccess.exception;

public class DataException extends Exception{
    private static final long serialVersionUID = 1L;

    public DataException(){
        super();
    }

    public DataException(String massage){
        super(massage);
    }

    public DataException(Exception e){
        super(e);
    }

    public DataException(String massage, Exception e){
        super(massage, e);
    }
}
