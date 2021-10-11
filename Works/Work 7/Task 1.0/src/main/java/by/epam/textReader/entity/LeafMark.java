package by.epam.textReader.entity;

public class LeafMark implements Component{
    String symbol;

    public LeafMark(String symbol){
        this.symbol = symbol;
    }

    public void add(Component component){}

    public String out(int lvl){
        return symbol;
    }
}
