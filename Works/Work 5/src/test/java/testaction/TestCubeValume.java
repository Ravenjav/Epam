package testaction;

import by.epam.circle.entity.Cube;
import by.epam.circle.service.valid.CubeSquare;
import by.epam.circle.service.valid.CubeVolume;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCubeValume {
    @Test
    public void testCubeSquare(){
        Cube cube = new Cube(7, 7, 7, 1, 2, 1);
        int expected = 343;
        assertEquals(new CubeVolume().volume(cube), expected);
    }
}
