package test.action;

import By.Epam.Traning.entity.Matrix;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.service.matOperations.Mult;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultTest {
    @Test
    public void testPosSortInsert() throws ServiceException {
        Matrix mas = new Matrix(new int[][]{new int[]{3, -1, 2}, new int[]{4, 2, 0}, new int[]{-5, 6, 1}});
        Matrix mas2 = new Matrix(new int[][]{new int[]{8}, new int[]{7}, new int[]{2}});
        Matrix expected = new Matrix(new int[][]{new int[]{21}, new int[]{46}, new int[]{4}});

        Mult mult = new Mult();
        assertEquals(mult.use(mas, mas2), expected);
    }
}
