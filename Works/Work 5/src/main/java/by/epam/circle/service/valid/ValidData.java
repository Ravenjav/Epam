package by.epam.circle.service.valid;

import by.epam.circle.entity.Cube;

public class ValidData {

    private Cube cube;

    public boolean checkCube(String line){
        if (line.length() < 10)
            return false;
        else {
            int x, y, z, xt, yt, zt;
            try {
                x = (int) line.charAt(0);
                y = (int) line.charAt(2);
                z = (int) line.charAt(4);
                xt = (int) line.charAt(6);
                yt = (int) line.charAt(8);
                zt = (int) line.charAt(10);
            }catch (java.lang.ClassCastException e){
                return false;
            }
            cube = new Cube(x, y, z, xt, yt, zt);
            return true;
        }
    }

    public Cube getCube() {
        return cube;
    }
}
