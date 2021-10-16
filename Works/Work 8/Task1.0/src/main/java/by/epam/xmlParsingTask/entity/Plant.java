package by.epam.xmlParsingTask.entity;

import java.util.Date;

public abstract class Plant {
    private String name;
    private String origin;
    private Growing_Types growing_types;
    private String date;

    Plant(){
        name = "";
        origin = "";
        date = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Growing_Types getGrowing_types() {
        return growing_types;
    }

    public void setGrowing_types(Growing_Types growing_types) {
        this.growing_types = growing_types;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", growing_types=" + growing_types.toString() +
                ", date='" + date + '\'' +
                '}';
    }
}
