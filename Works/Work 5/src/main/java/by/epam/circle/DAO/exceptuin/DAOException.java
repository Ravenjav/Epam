package by.epam.circle.DAO.exceptuin;

public class DAOException extends Exception{
    private static final long serialVersionUID = 1L;

    public DAOException(){
        super();
    }

    public DAOException(String massage){
        super(massage);
    }

    public DAOException(Exception e){
        super(e);
    }

    public DAOException(String massage, Exception e){
        super(massage, e);
    }
}
