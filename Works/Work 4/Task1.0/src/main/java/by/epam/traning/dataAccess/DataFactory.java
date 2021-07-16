package by.epam.traning.dataAccess;

public class DataFactory {
    private static final DataFactory factory = new DataFactory();
    private final DAO mas = new FileReader();

    private DataFactory(){}

    public static DataFactory getInstance(){
        return factory;
    }

    public DAO getDAO(){
        return mas;
    }
}
