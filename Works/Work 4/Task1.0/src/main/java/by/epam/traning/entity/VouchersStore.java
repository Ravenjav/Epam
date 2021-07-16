package by.epam.traning.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class VouchersStore {
    private static final VouchersStore instance = new VouchersStore();
    private ArrayList<Voucher> vouchers;

    public VouchersStore(){
        vouchers = new ArrayList<Voucher>();
    }

    public VouchersStore(ArrayList<Voucher> startMas){
        vouchers = startMas;
    }

    public static VouchersStore getInstance(){return instance;}

    public Voucher get(int id){
        return vouchers.get(id);
    }

    public int size(){
        return vouchers.size();
    }

    public void remove(int id){
        vouchers.remove(id);
    }

    public void add(Voucher el){
        vouchers.add(el);
    }

    public void swap(int x, int y){
        Collections.swap(vouchers, x, y);
    }

    public void out(){
        for (int i = 0; i < vouchers.size(); i++){
            System.out.println(vouchers.get(i).toString());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VouchersStore that = (VouchersStore) o;
        return Objects.equals(vouchers, that.vouchers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vouchers);
    }

    @Override
    public String toString() {
        String out = "";
        System.out.println(vouchers.size());
        for (int i = 0; i < vouchers.size(); i++){
            out += vouchers.get(i).toString();
        }
        return out;
    }
}
