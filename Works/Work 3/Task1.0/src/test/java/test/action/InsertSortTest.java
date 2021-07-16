package test.action;

import By.Epam.Traning.entity.Array;
import By.Epam.Traning.service.exception.ServiceException;
import By.Epam.Traning.service.masSort.InsertSort;
import By.Epam.Traning.service.masSort.MergerSort;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InsertSortTest {@Test
public void testPosSortInsert() throws ServiceException {
    Array mas = new Array(new int[] {10, 7, 14, 46, 100, -98, 98, 99, 1, 0});
    Array expected = new Array(new int[] {-98, 0, 1, 7, 10, 14, 46, 98, 99, 100});

    InsertSort sort = new InsertSort();
    assertEquals(sort.sort(mas), expected);
}
}
