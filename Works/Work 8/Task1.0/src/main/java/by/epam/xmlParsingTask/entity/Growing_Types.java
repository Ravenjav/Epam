package by.epam.xmlParsingTask.entity;

public class Growing_Types {
    private double temperature;
    private String lighting;
    private int watering;

    public Growing_Types() {
        super();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public int getWatering() {
        return watering;
    }

    public void setWatering(int watering) {
        this.watering = watering;
    }

    @Override
    public String toString() {
        return "Growing_Types{" +
                "temperature=" + temperature +
                ", lighting='" + lighting + '\'' +
                ", watering=" + watering +
                '}';
    }
}
