package by.epam.xmlParsingTask.entity;

public class Cactus extends Plant{
    private String soil;
    private Cactus_Visual_Param visual_param;
    private String multiplying;

    public class Cactus_Visual_Param{
        private String color;
        private double aver_size;

        Cactus_Visual_Param(){
            super();
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getAver_size() {
            return aver_size;
        }

        public void setAver_size(double aver_size) {
            this.aver_size = aver_size;
        }

        @Override
        public String toString() {
            return "Cactus_Visual_Param{" +
                    "color='" + color + '\'' +
                    ", aver_size=" + aver_size +
                    '}';
        }
    }

    public Cactus(){
        visual_param = new Cactus_Visual_Param();
    }

    public String getSoil() {
        return soil;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public Cactus_Visual_Param getVisual_param() {
        return visual_param;
    }

    public void setVisual_param(Cactus_Visual_Param visual_param) {
        this.visual_param = visual_param;
    }

    public String getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "soil='" + soil + '\'' +
                ", visual_param=" + visual_param +
                ", multiplying='" + multiplying + '\'' +
                '}';
    }
}
