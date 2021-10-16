package by.epam.xmlParsingTask.sirvice.parsers.sax;

public enum FlowerEnum {
    Plants("plants"),
    Flower("flower"),
    Name("name"),
    Origin("origin"),
    Soil("soil"),
    Multiplying("multiplying"),

    Cactus("cactus"),


    Growing_Types("growing_types"),
    Temperature("temperature"),
    Lighting("lighting"),
    Watering("watering"),

    Visual_param("visual_parameters"),
    Steam_color("stem_color"),
    Leaf_color("leaf_color"),
    Average_size("average_size");


    private String value;
    private FlowerEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
