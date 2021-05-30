package Test.Action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static By.Epam.Traning.Service.SimpleIf.simpleIf;
import static org.testng.Assert.assertEquals;

public class TestSimpleIf {
    @DataProvider(name = "dataForSimpleIf")
    public Object[][] createDataForSimpleIf(){
        return new Object[][]{
                {new int[]{17,  24}, 24},
                {new int[]{-85, 90}, 90},
                {new int[]{1000, -1000}, 1000},
                {new int[]{1, 1}, 0},
                {new int[]{0, 0}, 0}
        };
    }

    @Test(description = "Positive scenario of the simpleIf", dataProvider = "dataForSimpleIf")
    public void testSimpleIf(int xy[], int c) {
        int actual = simpleIf(xy[0], xy[1]);
        int expected = c;
        assertEquals(actual, expected);
    }
}
