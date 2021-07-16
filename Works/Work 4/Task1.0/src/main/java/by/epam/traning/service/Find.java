package by.epam.traning.service;

import by.epam.traning.entity.Voucher;
import by.epam.traning.entity.VouchersStore;

public class Find {
    public void find(Voucher id){
        VouchersStore mas = VouchersStore.getInstance();
        for (int i = 0; i < mas.size(); i++){
            if (id.getType() != 'Z' && id.getType() != mas.get(i).getType()){
                System.out.println(id.getType() + " " + mas.get(i).getType());
                mas.remove(i);
                i--;
            }
            if (id.getTransport() != 'Z' && id.getTransport() != mas.get(i).getTransport()) {
                System.out.println(id.getTransport() + " " + mas.get(i).getTransport());
                mas.remove(i);
                i--;
            }
            if (id.getEating() != -1 && id.getEating() != mas.get(i).getEating()) {
                System.out.println(id.getEating() + " " + mas.get(i).getEating());
                mas.remove(i);
                i--;
            }
            if (id.getDays() != -1 && id.getDays() != mas.get(i).getDays()) {
                System.out.println(id.getDays() + " " + mas.get(i).getDays());
                mas.remove(i);
                i--;
            }
        }
    }
}
