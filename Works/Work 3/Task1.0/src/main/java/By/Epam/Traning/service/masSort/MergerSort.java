package By.Epam.Traning.service.masSort;
import By.Epam.Traning.entity.Array;
import By.Epam.Traning.service.Sort;
import By.Epam.Traning.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Arrays;

public class MergerSort implements Sort {

    private static final Logger sortLogger = (Logger) LogManager.getLogger(InsertSort.class);

    private int [] a;

    private void SortUnsorted(int a[], int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public Array sort(Array mas) throws ServiceException{
        try {
            chekMas(mas);
        }
        catch (ServiceException e){
            throw new ServiceException(e);
        }
        this.a = mas.getMas();
        SortUnsorted(a, 0, mas.length() - 1);
        Array out = new Array(a);
        sortLogger.info("Sorting completed successfully");
        return out;
    }

}