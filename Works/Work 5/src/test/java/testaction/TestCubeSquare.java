package testaction;

import by.epam.circle.entity.Cube;
import by.epam.circle.service.valid.CubeSquare;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class TestCubeSquare {
    @Test
    public void testCubeSquare(){
      Cube cube = new Cube(7, 7, 7, 1, 2, 1);
      int expected = 294;
      assertEquals(new CubeSquare().square(cube), expected);
    }
}
