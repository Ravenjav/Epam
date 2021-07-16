package by.epam.traning.control.comand.comands;

import by.epam.traning.control.comand.Commands;
import by.epam.traning.entity.Voucher;
import by.epam.traning.entity.VouchersStore;
import by.epam.traning.textManeger.TextManager;

public class ShowVoucher implements Commands{

    TextManager textManager = TextManager.getInstance();

    public String execute() {
        VouchersStore mas = VouchersStore.getInstance();
        Voucher el;
        char type, transport;
        for (int i = 0; i < mas.size(); i++) {
            el = mas.get(i);
            type = el.getType();
            switch (type) {
                case 'R': {
                    System.out.print(textManager.getString("Main.Rest") + ' ');
                    break;
                }
                case 'E': {
                    System.out.print(textManager.getString("Main.Excursions") + ' ');
                    break;
                }
                case 'T': {
                    System.out.print(textManager.getString("Main.Revitalization") + ' ');
                    break;
                }
                case 'S': {
                    System.out.print(textManager.getString("Main.Shoping") + ' ');
                    break;
                }
                case 'C': {
                    System.out.print(textManager.getString("Main.Cruise") + ' ');
                    break;
                }
            }
            transport = el.getTransport();
            switch (transport) {
                case 'S': {
                    System.out.print(textManager.getString("Main.Ship") + ' ');
                    break;
                }
                case 'P': {
                    System.out.print(textManager.getString("Main.Plane") + ' ');
                    break;
                }
                case 'B': {
                    System.out.print(textManager.getString("Main.Bus") + ' ');
                    break;
                }
            }
            System.out.println(el.getEating() + " " + el.getDays());
        }
        return textManager.getString("ShowVouchers.Success");
    }
}
