package Test.Action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.InputMismatchException;

import static By.Epam.Traning.Service.Equals3Double.equals3Double;
import static org.testng.Assert.assertEquals;

public class TestEquals3Double {
    @DataProvider(name = "dataForEquals3Double")
    public Object[][] createDataForEquals3Double(){
        return new Object[][]{
                {new double[]{1.7, 2.4, 6.8}, false},
                {new double[]{8.5, 8.5, 8.5}, true},
                {new double[]{8.5, 8, 8.5}, false},
                {new double[]{9, 9, 9}, true}
        };
    }

    @DataProvider(name = "dataForEquals3DoubleWithExc")
    public Object[][] createDataForEquals3DoubleWithExc(){
        return new Object[][]{
                {new double[]{-1.7, 2.4, 6.8}},
                {new double[]{8.5, -8.5, 8.5}},
                {new double[]{8.5, 8, -8.5}},
                {new double[]{-9, -9, -9}}
        };
    }

    @Test(description = "Positive scenario of the Equals3Double", dataProvider = "dataForEquals3Double")
    public void testEquals3Double(double xy[], boolean c) {
        boolean actual = equals3Double(xy[0], xy[1], xy[2]);
        boolean expected = c;
        assertEquals(actual, expected);
    }

    @Test(description = "Negative scenario of the Equals3Double", dataProvider = "dataForEquals3DoubleWithExc",
            expectedExceptions = InputMismatchException.class,
            expectedExceptionsMessageRegExp = "side length can not be 0 or negative")
    public void testEquals3DoubleWithExc(double xy[]) {
        equals3Double(xy[0], xy[1], xy[2]);
    }
}
