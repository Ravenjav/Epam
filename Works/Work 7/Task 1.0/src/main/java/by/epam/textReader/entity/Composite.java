package by.epam.textReader.entity;

import java.util.ArrayList;
import java.util.Collections;

public class Composite implements Component{
    private ArrayList<Component> components;

    public Composite(){
        components = new ArrayList<Component>();
    }

    public void add(Component component){
        components.add(component);
    }

    public String out(int lvl){
        lvl++;
        String out = "";
        String preout;
        for(Component component: components) {
            preout = component.out(lvl);
            if (component instanceof LeafMark && !preout.equals("-"))
                out = out.substring(0, out.length() - 2);
            out += preout;
        }
        if (lvl == 2)
            return ("\t" + out + "\n");
        if (lvl == 4 || lvl == 5)
            return (out + " ");
        return out;
    }

    public Component getChild(int id){
        return components.get(id);
    }

    public int getSize(){ return components.size();}

    public void swap(int id1, int id2){
        Collections.swap(components, id1, id2);
        return;
    }

    public void set(int id, Component component){
        components.set(id, component);
    }
}
