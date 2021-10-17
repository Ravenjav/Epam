package by.epam.traning.entity;

public class BusyState implements State{
    public boolean use(){
        return false;
    }

    public boolean stope(){
        return true;
    }
}
