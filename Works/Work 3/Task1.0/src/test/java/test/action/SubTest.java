package test.action;

import By.Epam.Traning.entity.Matrix;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.service.matOperations.Sub;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SubTest {
    @Test
    public void testPosSortInsert() throws ServiceException {
        Matrix mas = new Matrix(new int[][]{new int[]{2, 3, 4}, new int[]{2, 3, 4}});
        Matrix mas2 = new Matrix(new int[][]{new int[]{2, 3, 4}, new int[]{2, 3, 4}});
        Matrix expected = new Matrix(new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}});

        Sub sub = new Sub();
        assertEquals(sub.use(mas, mas2), expected);
    }
}
