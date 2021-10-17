package by.epam.circle.service.valid;

import by.epam.circle.entity.Cube;

import static java.lang.Math.pow;

public class CubeVolume {
    public int volume(Cube cube){
        return (int) pow(cube.getX(),3);
    }
}
