package by.epam.xmlParsingTask.entity;

public class Flower extends Plant{
    private String soil;
    private Flower_Visual_Param visual_param;
    private String multiplying;

    public class Flower_Visual_Param{
        private String steam_color;
        private String leaf_color;
        private double aver_size;

        private Flower_Visual_Param(){
            super();
        }

        public String getSteam_color() {
            return steam_color;
        }

        public void setSteam_color(String steam_color) {
            this.steam_color = steam_color;
        }

        public String getLeaf_color() {
            return leaf_color;
        }

        public void setLeaf_color(String leaf_color) {
            this.leaf_color = leaf_color;
        }

        public double getAver_size() {
            return aver_size;
        }

        public void setAver_size(double aver_size) {
            this.aver_size = aver_size;
        }

        @Override
        public String toString() {
            return "Flower_Visual_Param{" +
                    "steam_color='" + steam_color + '\'' +
                    ", leaf_color='" + leaf_color + '\'' +
                    ", aver_size=" + aver_size +
                    '}';
        }
    }

    public Flower (){
        soil = "";
        visual_param = new Flower_Visual_Param();
        multiplying = "";
    }

    public String getSoil() {
        return soil;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public Flower_Visual_Param getVisual_param() {
        return visual_param;
    }

    public void Flower_setVisual_param(Flower_Visual_Param visual_param) {
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
        return "Flower{" +
                "soil='" + soil + '\'' +
                ", visual_param=" + visual_param +
                ", multiplying='" + multiplying + '\'' +
                "} " + super.toString();
    }
}
