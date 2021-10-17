package by.epam.circle.service.valid;

import by.epam.circle.entity.Cube;

import static java.lang.Math.pow;

public class CubeSquare {
    public int square(Cube cube){
        return ((int) pow(cube.getX(),2) * 6) ;
    }
}
