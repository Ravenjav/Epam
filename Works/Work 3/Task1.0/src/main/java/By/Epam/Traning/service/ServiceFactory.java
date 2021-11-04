package By.Epam.Traning.service;

import By.Epam.Traning.service.masSort.*;
import By.Epam.Traning.service.matOperations.*;

public class    ServiceFactory {
    private static final ServiceFactory factory = new ServiceFactory();
    private final Sort bubble = new BubbleSort();
    private final Sort chose = new ChoseSort();
    private final Sort insert = new InsertSort();
    private final Sort merger = new MergerSort();
    private final Sort shake = new ShakeSort();
    private final Sort shel = new ShelSort();
    private final Sort hash = new HashSort();
    private final Operations sum  = new Sum();
    private final Operations sub = new Sub();
    private final Operations mult = new Mult();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return factory;
    }

    public Sort getBubble(){
        return bubble;
    }

    public Sort getChose() {
        return chose;
    }

    public Sort getInsert() {
        return insert;
    }

    public Sort getMerger() {
        return merger;
    }

    public Sort getShake() {
        return shake;
    }

    public Sort getShel() {
        return shel;
    }

    public Sort getHash(){ return hash;}

    public Operations getSum() {
        return sum;
    }

    public Operations getSub() {
        return sub;
    }

    public Operations getMult() {
        return mult;
    }
}
