package Test.Action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static By.Epam.Traning.Service.Factorial.factorial;
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

    @Test(description = "Positive scenario of the factorial", dataProvider = "dataForFactorial")
    public void testFactorial(int t, int c) {
        int actual = factorial(t);
        int expected = c;
        assertEquals(actual, expected);
    }
}
