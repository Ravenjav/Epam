package Test.Action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static By.Epam.Traning.Service.SimpleFor.multForAToN;
import static org.testng.Assert.assertEquals;

public class TestSimpleFor {
    @DataProvider(name = "dataForMultForAToN")
    public Object[][] createDataForMultForAToN(){
        return new Object[][]{
                {new int[]{1,  1}, 1},
                {new int[]{1, 2}, 2},
        };
    }

    @Test(description = "Positive scenario of the multForAToN", dataProvider = "dataForMultForAToN")
    public void testMultForAToN(int an[], int c) {
        int actual = multForAToN(an[0], an[1]);
        int expected = c;
        assertEquals(actual, expected);
    }
}
