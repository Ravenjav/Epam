package By.Epam.Traning.control.command.systemComands;

import By.Epam.Traning.control.command.Commands;
import By.Epam.Traning.entity.MatrixStore;

public class ShowMatrix implements Commands {
    public String execute(){
        return MatrixStore.getInstance().get(2).toString();
    }
}
