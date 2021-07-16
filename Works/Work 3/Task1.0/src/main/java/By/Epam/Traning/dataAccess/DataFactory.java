package By.Epam.Traning.dataAccess;

public class DataFactory {
    private static final DataFactory factory = new DataFactory();
    private final MasDAO mas = new MasFileReader();
    private final MatDAO mat = new MatFileReader();

    private DataFactory(){}

    public static DataFactory getInstance(){
        return factory;
    }

    public MasDAO getMasDAO(){
        return mas;
    }

    public MatDAO getMatDAO() {
        return mat;
    }
}
