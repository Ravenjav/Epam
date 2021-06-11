package Test.Action;

import By.Epam.Traning.Service.FindBiggestNumber;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.InputMismatchException;

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

    @DataProvider(name = "dataForFindBiggestNumberWithExc")
    public Object[][] createDataForFindBiggestNumberWithExc(){
        return new Object[][]{
                {10155},
                {123},
                {1},
                {-100},
                {-15000}
        };
    }

    @Test(description = "Positive scenario of the findBiggestNumber", dataProvider = "dataForFindBiggestNumberWithExc",
            expectedExceptions = InputMismatchException.class,
            expectedExceptionsMessageRegExp = "the password must have four digits")
    public void TestfindBiggestNumberWithExc(int t) {
        FindBiggestNumber find = new FindBiggestNumber();
        find.findBiggestNumber(t);
    }
}
