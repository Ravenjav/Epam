package by.epam.textreader.entity;

public class LeafSymbol implements Component{
    char symbol;

    public LeafSymbol(char symbol){
        this.symbol = symbol;
    }

    public void add(Component component){}

    public String out(int lvl){
        String s = "";
        s += symbol;
        return s;
    }
}
