package Test.Action;

import By.Epam.Traning.Service.AccessLevel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static By.Epam.Traning.Service.AccessLevel.accessLevel;
import static org.testng.Assert.assertEquals;

public class TestAccessLevel {
    @DataProvider(name = "dataForAccessLevel")
    public Object[][] createDataForAccessLevel(){
        return new Object[][]{
                {9583, 'A'},
                {3331, 'B'},
                {9455, 'C'},
                {0, 'Z'},
                {5342, 'Z'}
        };
    }

    @Test(description = "Positive scenario of the accessLevel", dataProvider = "dataForAccessLevel")
    public void testAccessLevel(int t, char c) {
        AccessLevel aL = new AccessLevel();
        int actual = aL.accessLevel(t);
        int expected = c;
        assertEquals(actual, expected);
    }
}
