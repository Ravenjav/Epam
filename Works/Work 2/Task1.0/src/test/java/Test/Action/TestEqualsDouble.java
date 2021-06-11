package Test.Action;

import By.Epam.Traning.Service.EqualsDouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestEqualsDouble {
    @DataProvider(name = "dataForEqualsDouble")
    public Object[][] createDataForEqualsDouble(){
        return new Object[][]{
                {new double[]{1.7,  2.4}, 7},
                {new double[]{-8.5, 9.0}, 7},
                {new double[]{1000, -1000}, 8},
                {new double[]{0, 0}, 8}
        };
    }

    @Test(description = "Positive scenario of the EqualsDouble", dataProvider = "dataForEqualsDouble")
    public void testEqualsDouble(double xy[], double c) {
        EqualsDouble eD = new EqualsDouble();
        double actual = eD.equalsDouble(xy[0], xy[1]);
        double expected = c;
        assertEquals(actual, expected);
    }
}
