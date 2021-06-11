package Test.Action;

import By.Epam.Traning.Service.Factorial;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.InputMismatchException;

import static org.testng.Assert.assertEquals;

public class TestFactorial {
    @DataProvider(name = "dataForFactorial")
    public Object[][] createDataForFactorial(){
        return new Object[][]{
                {2, 2},
                {3, 6},
                {1, 1},
                {0, 1},
        };
    }

    @DataProvider(name = "dataForFactorialWithExc")
    public Object[][] createDataForFactorialWithExc(){
        return new Object[][]{
                {150},
                {500},
                {300},
                {25},
        };
    }

    @DataProvider(name = "dataForFactorialWithExc0")
    public Object[][] createDataForFactorialWithExc0(){
        return new Object[][]{
                {-15},
                {-500},
                {-300},
                {-20},
        };
    }

    @Test(description = "Positive scenario of the factorial", dataProvider = "dataForFactorial")
    public void testFactorial(int t, int c) {
        Factorial f= new Factorial();
        int actual = f.factorial(t);
        int expected = c;
        assertEquals(actual, expected);
    }

    @Test(description = "Negative scenario of the factorial", dataProvider = "dataForFactorialWithExc",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "type overflow")
    public void testFactorialWithExc(int t) {
        Factorial f= new Factorial();
        int actual = f.factorial(t);
    }

    @Test(description = "Negative scenario of the factorial", dataProvider = "dataForFactorialWithExc0",
            expectedExceptions = InputMismatchException.class,
            expectedExceptionsMessageRegExp = "negative value can not be in")
    public void testFactorialWithExc0(int t) {
        Factorial f= new Factorial();
        int actual = f.factorial(t);
    }
}
