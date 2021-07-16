package by.epam.traning.control.comand.comands;

import by.epam.traning.control.comand.Commands;
import by.epam.traning.entity.VouchersStore;
import by.epam.traning.service.ServiceFactory;
import by.epam.traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;

public class UseSort implements Commands {
    private static final Logger CommandLogger = (Logger) LogManager.getLogger(UseSort.class);
    TextManager textManager = TextManager.getInstance();

    public String execute(){
        System.out.println(textManager.getString("UseSort.ChoseSort") + "\n"
                + "1: " + textManager.getString("UseSort.Type") + "\n"
                + "2: " + textManager.getString("UseSort.Transport") + "\n"
                + "3: " + textManager.getString("UseSort.Eating") + "\n"
                + "4: " + textManager.getString("UseSort.Days"));
        Scanner in = new Scanner(System.in);
        int command = in.nextInt();
        ServiceFactory.getInstance().getSort().sort(VouchersStore.getInstance(), command);
        return textManager.getString("UseSort.SuccessSorting");
    }

}
