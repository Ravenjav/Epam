package By.Epam.Traning.entity;

import java.util.ArrayList;

public class MatrixStore {
    private static final MatrixStore instance = new MatrixStore();
    private ArrayList<Matrix> store;

    MatrixStore (){
        store = new ArrayList<>();
    }

    public static MatrixStore getInstance(){
        return instance;
    }

    public void replacement(int id, Matrix el){
        store.set(id, el);
    }

    public void add(Matrix el){
        store.add(el);
    }

    public Matrix get(int id){
        return store.get(id);
    }

    public int size(){
        return store.size();
    }
}
