package test.action;
import by.epam.traning.entity.Voucher;
import by.epam.traning.entity.VouchersStore;
import by.epam.traning.service.Sort;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class SortTest {
    @Test
    public void testPosTypeSort(){
        ArrayList<Voucher> startMas = new ArrayList<>();
        startMas.add(new Voucher('R', 'P', 2, 10));
        startMas.add(new Voucher('E', 'L', 3, 4));
        startMas.add(new Voucher('T', 'B', 3, 5));
        startMas.add(new Voucher('S', 'B', 5, 7));
        startMas.add(new Voucher('C', 'L', 0, 12));
        VouchersStore mas = new VouchersStore(startMas);

        ArrayList<Voucher> startExpectes = new ArrayList<>();
        startExpectes.add(new Voucher('C', 'L', 0, 12));
        startExpectes.add(new Voucher('E', 'L', 3, 4));
        startExpectes.add(new Voucher('R', 'P', 2, 10));
        startExpectes.add(new Voucher('S', 'B', 5, 7));
        startExpectes.add(new Voucher('T', 'B', 3, 5));
        VouchersStore expected = new VouchersStore(startExpectes);

        Sort sort = new Sort();
        assertEquals(sort.sort(mas, 1), expected);
    }

    @Test
    public void testPosTransportSort(){
        ArrayList<Voucher> startMas = new ArrayList<>();
        startMas.add(new Voucher('R', 'P', 2, 10));
        startMas.add(new Voucher('E', 'L', 3, 4));
        startMas.add(new Voucher('T', 'B', 3, 5));
        startMas.add(new Voucher('S', 'B', 5, 7));
        startMas.add(new Voucher('C', 'L', 0, 12));
        VouchersStore mas = new VouchersStore(startMas);

        ArrayList<Voucher> startExpectes = new ArrayList<>();
        startExpectes.add(new Voucher('T', 'B', 3, 5));
        startExpectes.add(new Voucher('S', 'B', 5, 7));
        startExpectes.add(new Voucher('E', 'L', 3, 4));
        startExpectes.add(new Voucher('C', 'L', 0, 12));
        startExpectes.add(new Voucher('R', 'P', 2, 10));
        VouchersStore expected = new VouchersStore(startExpectes);

        Sort sort = new Sort();
        assertEquals(sort.sort(mas, 2), expected);
    }

    @Test
    public void testPosEatingSort(){
        ArrayList<Voucher> startMas = new ArrayList<>();
        startMas.add(new Voucher('R', 'P', 2, 10));
        startMas.add(new Voucher('E', 'L', 3, 4));
        startMas.add(new Voucher('T', 'B', 3, 5));
        startMas.add(new Voucher('S', 'B', 5, 7));
        startMas.add(new Voucher('C', 'L', 0, 12));
        VouchersStore mas = new VouchersStore(startMas);

        ArrayList<Voucher> startExpectes = new ArrayList<>();
        startExpectes.add(new Voucher('C', 'L', 0, 12));
        startExpectes.add(new Voucher('R', 'P', 2, 10));
        startExpectes.add(new Voucher('E', 'L', 3, 4));
        startExpectes.add(new Voucher('T', 'B', 3, 5));
        startExpectes.add(new Voucher('S', 'B', 5, 7));
        VouchersStore expected = new VouchersStore(startExpectes);

        Sort sort = new Sort();
        assertEquals(sort.sort(mas, 3), expected);
    }

    @Test
    public void testPosDaysSort(){
        ArrayList<Voucher> startMas = new ArrayList<>();
        startMas.add(new Voucher('R', 'P', 2, 10));
        startMas.add(new Voucher('E', 'L', 3, 4));
        startMas.add(new Voucher('T', 'B', 3, 5));
        startMas.add(new Voucher('S', 'B', 5, 7));
        startMas.add(new Voucher('C', 'L', 0, 12));
        VouchersStore mas = new VouchersStore(startMas);

        ArrayList<Voucher> startExpectes = new ArrayList<>();
        startExpectes.add(new Voucher('E', 'L', 3, 4));
        startExpectes.add(new Voucher('T', 'B', 3, 5));
        startExpectes.add(new Voucher('S', 'B', 5, 7));
        startExpectes.add(new Voucher('R', 'P', 2, 10));
        startExpectes.add(new Voucher('C', 'L', 0, 12));
        VouchersStore expected = new VouchersStore(startExpectes);

        Sort sort = new Sort();
        assertEquals(sort.sort(mas, 4), expected);
    }
}

