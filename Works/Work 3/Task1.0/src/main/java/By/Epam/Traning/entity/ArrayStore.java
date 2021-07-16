package By.Epam.Traning.entity;

import java.util.ArrayList;

public class ArrayStore {
    private static final ArrayStore instance = new ArrayStore();
    private ArrayList<Array> store;

    ArrayStore (){
        store = new ArrayList<>();
    }

    public static ArrayStore getInstance(){
        return instance;
    }

    public void replacement(int id, Array el){
        store.set(id, el);
    }

    public void add(Array el){
        store.add(el);
    }

    public Array get(int id){
        return store.get(id);
    }

    public int size(){
        return store.size();
    }
}
