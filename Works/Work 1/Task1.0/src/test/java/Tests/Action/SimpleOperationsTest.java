package Tests.Action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static By.Epam.Traning.Service.SimpleOperations.*;

public class SimpleOperationsTest {

    @DataProvider(name = "dataForSum")
    public Object[][] createDataForSum(){
        return new Object[][]{
                {new double[]{1, 1}, 2},
                {new double[]{0, 1}, 1},
                {new double[]{1, 0}, 1},
                {new double[]{0, 0}, 0},
                {new double[]{-500, -100}, -600},
                {new double[]{-1000, -13600}, -14600}
        };
    }

    @DataProvider(name = "dataForSumWithExc")
    public Object[][] createDataForSumWithExc(){
        return new Object[][]{
                {new double[]{Double.MAX_VALUE, Double.MAX_VALUE}},
                {new double[]{7.997e307, 9.985e307}},
                {new double[]{- Double.MAX_VALUE, - Double.MAX_VALUE}},
        };
    }

    @DataProvider(name = "dataForSub")
    public Object[][] createDataForSub(){
        return new Object[][]{
                {new double[]{1, 1}, 0},
                {new double[]{0, 1}, -1},
                {new double[]{1, 0}, 1},
                {new double[]{0, 0}, 0},
                {new double[]{-500, -100}, -400},
                {new double[]{-1000, -13600}, 12600}
        };
    }

    @DataProvider(name = "dataForSubWithExc")
    public Object[][] createDataForSubWithExc(){
        return new Object[][]{
                {new double[]{Double.MAX_VALUE, - Double.MAX_VALUE}},
                {new double[]{7.997e307, - 9.985e307}},
                {new double[]{ - Double.MAX_VALUE, Double.MAX_VALUE}},
        };
    }

    @DataProvider(name = "dataForMult")
    public Object[][] createDataForMult(){
        return new Object[][]{
                {new double[]{3, 5}, 15},
                {new double[]{0, 1}, 0},
                {new double[]{1, 0}, 0},
                {new double[]{0, 0}, 0},
                {new double[]{-500, -100}, 50000},
                {new double[]{-1000, 13600}, -13600000}
        };
    }

    @DataProvider(name = "dataForMultWithExc")
    public Object[][] createDataForMultWithExc(){
        return new Object[][]{
                {new double[]{ Double.MAX_VALUE, - Double.MAX_VALUE}},
                {new double[]{ 7.997e307, 9.985e307}},
                {new double[]{ Double.MAX_VALUE, Double.MAX_VALUE}},
        };
    }

    @DataProvider(name = "dataForDiv")
    public Object[][] createDataForDiv(){
        return new Object[][]{
                {new double[]{15, 5}, 3},
                {new double[]{0, 1}, 0},
                {new double[]{1, 1}, 1},
                {new double[]{12, 3}, 4},
                {new double[]{-500, -100}, 5},
                {new double[]{-1000, 10}, -100}
        };
    }

    @DataProvider(name = "dataForDivtWithExc")
    public Object[][] createDataForDivtWithExc(){
        return new Object[][]{
                {new double[]{ Double.MAX_VALUE, 0.1}},
                {new double[]{ Double.MAX_VALUE, - 0.1}},
        };
    }

    @DataProvider(name = "dataForDivWith0")
    public Object[][] createDataForDivWith0(){
        return new Object[][]{
                {new double[]{1, 0}},
                {new double[]{100, 0}},
                {new double[]{-100, 0}},
        };
    }


    @Test(description = "Positive scenario of the sum", dataProvider = "dataForSum")
    public void testSum(double xy[], double c) {
        double actual = sum(xy[0], xy[1]);
        double expected = c;
        assertEquals(actual, expected, 0.00001);
    }

    @Test(description = "Negative scenario of the sum", dataProvider = "dataForSumWithExc",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "type overflow")
    public void testSumWithExc(double xy[]) {
        sum(xy[0], xy[1]);
    }



    @Test(description = "Positive scenario of the sub", dataProvider = "dataForSub")
    public void testSub(double xy[], double c) {
        double actual = sub(xy[0], xy[1]);
        double expected = c;
        assertEquals(actual, expected, 0.00001);
    }

    @Test(description = "Negative scenario of the sub", dataProvider = "dataForSubWithExc",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "type overflow")
    public void testSubWithExc(double xy[]) {
        sub(xy[0], xy[1]);
    }



    @Test(description = "Positive scenario of the mult", dataProvider = "dataForMult")
    public void testMult(double xy[], double c) {
        double actual = mult(xy[0], xy[1]);
        double expected = c;
        assertEquals(actual, expected, 0.00001);
    }

    @Test(description = "Negative scenario of the mult", dataProvider = "dataForMultWithExc",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "type overflow")
    public void testMultWithExc(double xy[]) {
        mult(xy[0], xy[1]);
    }



    @Test(description = "Positive scenario of the div", dataProvider = "dataForDiv")
    public void testDiv(double xy[], double c) {
        double actual = div(xy[0], xy[1]);
        double expected = c;
        assertEquals(actual, expected, 0.00001);
    }

    @Test(description = "Negative scenario of the mult", dataProvider = "dataForDivtWithExc",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "type overflow")
    public void testDivtWithExc(double xy[]) {
        div(xy[0], xy[1]);
    }

    @Test(description = "Negative scenario of the div", dataProvider = "dataForDivWith0",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Cannot div by zero")
    public void testDivWith0(double xy[]) {
        div(xy[0],xy[1]);
    }
}
