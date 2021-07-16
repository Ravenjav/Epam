package By.Epam.Traning.control.command.systemComands;

import By.Epam.Traning.control.command.Commands;
import By.Epam.Traning.entity.ArrayStore;

public class ShowMas implements Commands{

    public String execute(){
        return ArrayStore.getInstance().get(0).toString();
    }
}
