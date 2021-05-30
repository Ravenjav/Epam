package Test.Action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static By.Epam.Traning.Service.FindBiggestNumber.findBiggestNumber;
import static org.testng.Assert.assertEquals;

public class TestFindBiggestNumber {
    @DataProvider(name = "dataForFindBiggestNumber")
    public Object[][] createDataForFindBiggestNumber(){
        return new Object[][]{
                {9583, 9},
                {3331, 3},
                {9455, 9},
                {0, 0},
                {542, 5}
        };
    }

    @Test(description = "Positive scenario of the findBiggestNumber", dataProvider = "dataForFindBiggestNumber")
    public void TestfindBiggestNumber(int t, int c) {
        int actual = findBiggestNumber(t);
        int expected = c;
        assertEquals(actual, expected);
    }
}
