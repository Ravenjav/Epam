package Test.Action;

import By.Epam.Traning.Service.TemperatureAnalysis;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestTemperatureAnalysis {
    @DataProvider(name = "dataForTemperatureAnalysis")
    public Object[][] createDataForTemperatureAnalysis(){
        return new Object[][]{
                {89.4, true},
                {60, false},
                {61.1, true},
                {0, false},
                {-5, false}
        };
    }

    @Test(description = "Positive scenario of the temperatureAnalysis", dataProvider = "dataForTemperatureAnalysis")
    public void testTemperatureAnalysis(double t, boolean c) {
        TemperatureAnalysis tA = new TemperatureAnalysis();
        boolean actual = tA.temperatureAnalysis(t);
        boolean expected = c;
        assertEquals(actual, expected);
    }
}
