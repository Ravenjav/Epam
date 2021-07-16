package test.action;

import By.Epam.Traning.entity.Matrix;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.service.matOperations.Sum;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumTest {
    @Test
    public void testPosSortInsert() throws ServiceException {
        Matrix mas = new Matrix(new int[][]{new int[]{2, 3, 4}, new int[]{2, 3, 4}});
        Matrix mas2 = new Matrix(new int[][]{new int[]{2, 3, 4}, new int[]{2, 3, 4}});
        Matrix expected = new Matrix(new int[][]{new int[]{4, 6, 8}, new int[]{4, 6, 8}});

        Sum sum = new Sum();
        assertEquals(sum.use(mas, mas2), expected);
    }
}
