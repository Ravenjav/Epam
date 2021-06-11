package Test.Action;

import By.Epam.Traning.Service.SimpleFor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class TestSimpleFor {

    @DataProvider(name = "dataForSimpleFor")
    public Object[][] createDataForSimpleFor(){
        return new Object[][]{
                {new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))},
        };
    }

    @DataProvider(name = "dataForSumFor")
    public Object[][] createDataForSumFor(){
        return new Object[][]{
                {338350},
        };
    }

    @DataProvider(name = "dataForMultForAToN")
    public Object[][] createDataForMultForAToN(){
        return new Object[][]{
                {1, 1, 1},
                {1, 2, 2},
        };
    }

    @DataProvider(name = "dataForMultForAToNWithExc")
    public Object[][] createDataForMultForAToNWithExc(){
        return new Object[][]{
                {Double.MAX_VALUE, 4},
                {Double.MAX_VALUE, 2},
                {Double.MAX_VALUE, 100000},
        };
    }

    @Test(description = "Positive scenario of the simpleFor", dataProvider = "dataForSimpleFor")
    public void testSimpleFor(ArrayList<Integer> c) {
        SimpleFor sF = new SimpleFor();
        ArrayList<Integer> actual = sF.simpleFor();
        ArrayList<Integer> expected = c;
        assertEquals(actual, expected);
    }

    @Test(description = "Positive scenario of the sumFor", dataProvider = "dataForSumFor")
    public void testSimpleFor(int c) {
        SimpleFor sF = new SimpleFor();
        int actual = sF.sumFor();
        int expected = c;
        assertEquals(actual, expected);
    }

    @Test(description = "Positive scenario of the multForAToN", dataProvider = "dataForMultForAToN")
    public void testMultForAToN(double a, int n, double c) {
        SimpleFor sF = new SimpleFor();
        double actual = sF.multForAToN(a, n);
        double expected = c;
        assertEquals(actual, expected, 0.00001);
    }

    @Test(description = "Negative scenario of the multForAToN", dataProvider = "dataForMultForAToNWithExc",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "type overflow")
    public void testMultForAToNWithExc(double a, int n) {
        SimpleFor sF = new SimpleFor();
        sF.multForAToN(a, n);
    }
}
