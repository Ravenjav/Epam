package by.epam.xmlParsingTask.sirvice.parsers.doom;

import by.epam.xmlParsingTask.entity.Cactus;
import by.epam.xmlParsingTask.entity.Flower;
import by.epam.xmlParsingTask.entity.Growing_Types;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CactusDoomBuilder {
    private DocumentBuilder documentBuilder;
    private Set<Cactus> cacti;
    public CactusDoomBuilder(){
        this.cacti = new HashSet<Cactus>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            documentBuilder = factory.newDocumentBuilder();
        }catch (ParserConfigurationException e){
            System.out.println("Ошибка конфигурации парсера");
        }
    }
    public Set<Cactus> getCacti(){
        return cacti;
    }

    public void buildSetCactus(String fileName){
        Document doc = null;
        try{
            doc = documentBuilder.parse(fileName);
            Element root = doc.getDocumentElement();
            NodeList cactusList = root.getElementsByTagName("cactus");
            for (int i = 0; i < cactusList.getLength(); i++){
                Element cactusElement = (Element) cactusList.item(i);
                Cactus cactus = buildCactus(cactusElement);
                cacti.add(cactus);
            }
        }catch(IOException e){
            System.err.println("I/O" + e);
        }catch(SAXException e){
            System.err.println("Parsing failure" + e);
        }
    }

    private Cactus buildCactus(Element cactusEl){
        Cactus cactus = new Cactus();
        cactus.setDate(cactusEl.getAttribute("date"));
        cactus.setName(getElTextCont(cactusEl, "name"));
        cactus.setOrigin(getElTextCont(cactusEl, "origin"));

        Growing_Types growing_types = new Growing_Types();
        Element growingEl = (Element) cactusEl.getElementsByTagName("growing_types").item(0);
        growing_types.setTemperature(Double.parseDouble(getElTextCont(growingEl, "temperature")));
        growing_types.setLighting(getElTextCont(growingEl, "lighting"));
        growing_types.setWatering(Integer.parseInt(getElTextCont(growingEl, "watering")));
        cactus.setGrowing_types(growing_types);

        cactus.setSoil(getElTextCont(cactusEl, "soil"));

        Cactus.Cactus_Visual_Param visual_param = cactus.getVisual_param();
        Element visualEl = (Element) cactusEl.getElementsByTagName("visual_parameters").item(0);
        visual_param.setColor(getElTextCont(visualEl, "color"));
        visual_param.setAver_size(Double.parseDouble(getElTextCont(visualEl, "aver_size")));

        cactus.setMultiplying(getElTextCont(cactusEl, "multiplying"));

        return cactus;
    }

    private static String getElTextCont(Element el, String elName){
        NodeList nlist = el.getElementsByTagName(elName);
        Node node = nlist.item(0);
        String text = node.getTextContent();
        return text;
    }
}
