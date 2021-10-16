package by.epam.xmlParsingTask.sirvice.parsers.sax;

import by.epam.xmlParsingTask.entity.Flower;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class FlowerHandler extends DefaultHandler {
    private Set<Flower> flowers;
    private Flower current = null;
    private FlowerEnum currentEnum = null;
    private EnumSet<FlowerEnum> withText;

    public FlowerHandler(){
        flowers = new HashSet<Flower>();
        withText = EnumSet.range(FlowerEnum.Name, FlowerEnum.Multiplying);
    }
    public Set<Flower> getFlowers(){
        return flowers;
    }

    public void startElement(String uri, String localName, String qName, Attributes attr){
        if ("flower".equals(localName)){
            current = new Flower();
            current.setDate(attr.getValue(0));
        }
        else{

        }
    }
}
