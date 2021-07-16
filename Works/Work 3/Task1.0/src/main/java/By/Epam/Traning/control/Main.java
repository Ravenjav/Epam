package By.Epam.Traning.control;

import By.Epam.Traning.textManeger.TextManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;
//TODO
public class Main {

    private static final Logger mainLogger = (Logger) LogManager.getLogger(Controller.class);

    public static void main(String[] args) {
        TextManager textManager = TextManager.getInstance();
        System.out.println("Default language is english. Want to change on Russian?" + "\n"
        + "1: Yes" + "\n"
        + "2: No");
        Scanner in = new Scanner(System.in);
        int lang = in.nextInt();
        if (lang == 1)
            textManager.setRussian();
        Controller controller = new Controller();
        System.out.println(textManager.getString("Main.TypeWorking") + "\n"
                + "1: " + textManager.getString("Main.Array") +  "\n"
                + "2: " + textManager.getString("Main.Matrix"));
        int type = in.nextInt();
        switch (type){
            case 1:{
                System.out.println(controller.executeTask("READ_MAS"));
                System.out.println(textManager.getString("Main.TypeSorting") + "\n"
                + "1: " + textManager.getString("Main.BubbleSort") + "\n"
                + "2: " + textManager.getString("Main.ChoseSort") + "\n"
                + "3: " + textManager.getString("Main.HashSort") + "\n"
                + "4: " + textManager.getString("Main.InsertSort") + "\n"
                + "5: " + textManager.getString("Main.MergerSort") + "\n"
                + "6: " + textManager.getString("Main.ShakeSort") + "\n"
                + "7: " + textManager.getString("Main.ShelSort"));
                int sort = in.nextInt();
                switch (sort){
                    case 1:{
                        System.out.println(controller.executeTask("BUBBLE_SORT"));
                        break;
                    }
                    case 2:{
                        System.out.println(controller.executeTask("CHOSE_SORT"));
                        break;
                    }
                    case 3:{
                        System.out.println(controller.executeTask("HASH_SORT"));
                        break;
                    }
                    case 4:{
                        System.out.println(controller.executeTask("INSERT_SORT"));
                        break;
                    }
                    case 5:{
                        System.out.println(controller.executeTask("MERGER_SORT"));
                        break;
                    }
                    case 6:{
                        System.out.println(controller.executeTask("SHAKE_SORT"));
                        break;
                    }
                    case 7:{
                        System.out.println(controller.executeTask("SHEL_SORT"));
                        break;
                    }
                    default:{
                        System.out.println(textManager.getString("soft.WrongFormatException"));
                    }
                }
                System.out.println(textManager.getString("Main.ShowMas") + "\n"
                + "1: " + textManager.getString("Main.Yes") + "\n"
                + "2: " + textManager.getString("Main.No"));
                int answer = in.nextInt();
                if (answer == 1){
                    System.out.println(controller.executeTask("SHOW_MAS"));
                }
                break;
            }
            case 2:{
                System.out.println(controller.executeTask("READ_MAT"));
                System.out.println(textManager.getString("Main.TypeOperation") + "\n"
                + "1: " + textManager.getString("Main.Sum") + "\n"
                + "2: " + textManager.getString("Main.Sub") + "\n"
                + "3: " + textManager.getString("Main.Mult"));
                int operation = in.nextInt();
                switch (operation){
                    case 1:{
                        System.out.println(controller.executeTask("SUM"));
                        break;
                    }
                    case 2:{
                        System.out.println(controller.executeTask("SUB"));
                        break;
                    }
                    case 3:{
                        System.out.println(controller.executeTask("MULT"));
                        break;
                    }
                    default:{
                        System.out.println(textManager.getString("soft.WrongFormatException"));
                    }
                }
                System.out.println(textManager.getString("Main.ShowMas") + "\n"
                        + "1: " + textManager.getString("Main.Yes") + "\n"
                        + "2: " + textManager.getString("Main.No"));
                int answer = in.nextInt();
                if (answer == 1){
                    System.out.println(controller.executeTask("SHOW_MAT"));
                }
                break;
            }
            default:{
                System.out.println(textManager.getString("soft.WrongFormatException"));
            }
        }
    }
}