package by.epam.xmlParsingTask.sirvice.parsers.doom;

import by.epam.xmlParsingTask.entity.Flower;
import by.epam.xmlParsingTask.entity.Growing_Types;
import by.epam.xmlParsingTask.entity.Plant;
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

public class FlowerDoomBuilder {
    private DocumentBuilder documentBuilder;
    private Set<Flower> flowers;
    public FlowerDoomBuilder(){
        this.flowers = new HashSet<Flower>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            documentBuilder = factory.newDocumentBuilder();
        }catch (ParserConfigurationException e){
            System.out.println("Ошибка конфигурации парсера");
        }
    }
    public Set<Flower> getFlowers(){
        return flowers;
    }

    public void buildSetFlowers(String fileName){
        Document doc = null;
        try{
            doc = documentBuilder.parse(fileName);
            Element root = doc.getDocumentElement();
            NodeList flowerList = root.getElementsByTagName("flower");
            for (int i = 0; i < flowerList.getLength(); i++){
                Element flowerElement = (Element) flowerList.item(i);
                Flower flower = buildFlower(flowerElement);
                flowers.add(flower);
            }
        }catch(IOException e){
            System.err.println("I/O" + e);
        }catch(SAXException e){
            System.err.println("Parsing failure" + e);
        }
    }

    private Flower buildFlower(Element flowerEl){
        Flower flower = new Flower();
        flower.setDate(flowerEl.getAttribute("date"));
        flower.setName(getElTextCont(flowerEl, "name"));
        flower.setOrigin(getElTextCont(flowerEl, "origin"));

        Growing_Types growing_types = new Growing_Types();
        Element growingEl = (Element) flowerEl.getElementsByTagName("growing_types").item(0);
        growing_types.setTemperature(Double.parseDouble(getElTextCont(growingEl, "temperature")));
        growing_types.setLighting(getElTextCont(growingEl, "lighting"));
        growing_types.setWatering(Integer.parseInt(getElTextCont(growingEl, "watering")));
        flower.setGrowing_types(growing_types);

        flower.setSoil(getElTextCont(flowerEl, "soil"));

        Flower.Flower_Visual_Param visual_param = flower.getVisual_param();
        Element visualEl = (Element) flowerEl.getElementsByTagName("visual_parameters").item(0);
        visual_param.setSteam_color(getElTextCont(visualEl, "stem_color"));
        visual_param.setLeaf_color(getElTextCont(visualEl, "leaf_color"));
        visual_param.setAver_size(Double.parseDouble(getElTextCont(visualEl, "average_size")));

        flower.setMultiplying(getElTextCont(flowerEl, "multiplying"));

        return flower;
    }

    private static String getElTextCont(Element el, String elName){
        NodeList nlist = el.getElementsByTagName(elName);
        Node node = nlist.item(0);
        String text = node.getTextContent();
        return text;
    }
}
