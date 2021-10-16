package by.epam.xmlParsingTask.sirvice.parsers.sax;

import by.epam.xmlParsingTask.entity.Flower;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.Set;

public class FlowerSaxBuilder {
    private Set<Flower> flowers;
    private FlowerHandler fh;
    private XMLReader reader;
    public FlowerSaxBuilder(){
        fh = new FlowerHandler();
        try{
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(fh);
        }catch (SAXException e){
            System.err.println("Sax er" + e);
        }
    }

    public Set<Flower> getFlowers(){
        return flowers;
    }

    public void buildFlowers(String fileName){
        try{
            reader.parse(fileName);
        }catch (SAXException e){
            System.out.println("Sax pars exc" + e);
        }catch (IOException e){
            System.out.println("IO exc" + e);
        }
        //flowers = fh.getFlower();
    }
}
