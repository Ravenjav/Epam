package by.epam.traning.control;

import by.epam.traning.entity.Voucher;
import by.epam.traning.service.ServiceFactory;
import by.epam.traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger mainLogger = (Logger) LogManager.getLogger(Main.class);

    public static void main(String[] args){
        TextManager textManager = TextManager.getInstance();
        System.out.println("Default language is english. Want to change on Russian?" + "\n"
                + "1: Yes" + "\n"
                + "2: No");
        Scanner in = new Scanner(System.in);
        int lang = in.nextInt();
        if (lang == 1)
            textManager.setRussian();
        Controller controller = new Controller();
        System.out.println(controller.executeTask("READ_VOUCHER"));
        System.out.println(textManager.getString("Main.ChoseType")  + "\n"
                + "1: " + textManager.getString("Main.Yes") + "\n"
                + "2: " + textManager.getString("Main.No"));
        int com = in.nextInt();
        char type, transport;
        int eating, days;
        if (com == 1){
            System.out.println("1: " + textManager.getString("Main.Rest") + "\n"
            + "2: " + textManager.getString("Main.Excursions") + '\n'
            + "3: " + textManager.getString("Main.Revitalization") + '\n'
            + "4: " + textManager.getString("Main.Shoping") + '\n'
            + "5: " + textManager.getString("Main.Cruise") + '\n');
            com = in.nextInt();
            switch (com){
                case 1: {
                    type = 'R';
                    break;
                }
                case 2:{
                    type = 'E';
                    break;
                }
                case 3:{
                    type = 'T';
                    break;
                }
                case 4:{
                    type = 'S';
                    break;
                }
                case 5:{
                    type = 'C';
                    break;
                }
                default:{
                    type = 'Z';
                }
            }

        }
        else{
            type = 'Z';
        }
        System.out.println(textManager.getString("Main.ChoseTransport") + "\n"
                + "1: " + textManager.getString("Main.Yes") + "\n"
                + "2: " + textManager.getString("Main.No"));
        com = in.nextInt();
        if (com == 1){
            System.out.println("1: " + textManager.getString("Main.Ship") + "\n"
                    + "2: " + textManager.getString("Main.Plane") + "\n"
                    + "3: " + textManager.getString("Main.Bus"));
            com = in.nextInt();
            switch (com){
                case 1: {
                    transport = 'S';
                    break;
                }
                case 2:{
                    transport = 'P';
                    break;
                }
                case 3:{
                    transport = 'B';
                    break;
                }
                default:{
                    transport = 'Z';
                }
            }
        }
        else{
            transport = 'Z';
        }
        System.out.println(textManager.getString("Main.ChoseEating") + "\n"
                + "1: " + textManager.getString("Main.Yes") + "\n"
                + "2: " + textManager.getString("Main.No"));
        com = in.nextInt();
        if (com == 1){
            System.out.println("1: 3" + "\n"
                    + "2: 2" + "\n"
                    + "3: 0");
            com = in.nextInt();
            switch (com){
                case 1: {
                    eating = 3;
                    break;
                }
                case 2:{
                    eating = 2;
                    break;
                }
                case 3:{
                    eating = 0;
                    break;
                }
                default:{
                    eating = -1;
                }
            }
        }
        else{
            eating = -1;
        }
        System.out.println(textManager.getString("Main.ChoseDays") + "\n"
                + "1: " + textManager.getString("Main.Yes") + "\n"
                + "2: " + textManager.getString("Main.No"));
        com = in.nextInt();
        if (com == 1)
            days = in.nextInt();
        else{
            days = -1;
        }
        ServiceFactory.getInstance().getFind().find(new Voucher(type, transport, eating, days));
        controller.executeTask("SHOW_VOUCHER");
    }
}
