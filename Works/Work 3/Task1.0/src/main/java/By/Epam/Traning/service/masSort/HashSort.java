package By.Epam.Traning.service.masSort;

import By.Epam.Traning.entity.Array;
import By.Epam.Traning.service.Sort;
import By.Epam.Traning.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Arrays;
import java.util.Random;

public class HashSort implements Sort {

    private static final Logger sortLogger = (Logger) LogManager.getLogger(HashSort.class);

    // Размер массива исходных данных
    static int SOURCELEN = 1000000; //1000000
    int source[] = new int[SOURCELEN];

    // Размер блока для хэширующей сортировки
    static int SORTBLOCK = 500; //500
    static int k = 3;

    // Временный массив
    static int TMPLEN = (SOURCELEN < SORTBLOCK * k) ? SORTBLOCK * k : SOURCELEN;
    int tmp[] = new int[TMPLEN];

    int minValue = 0;
    int maxValue = 0;
    double hashKoef = 0;

    // Поиск минимального и максимального значений плюс вычисление коэффициента для хэш-функции
    public void findMinMax(int startIndex, int endIndex) {
        int i;
        minValue = source[startIndex];
        maxValue = source[startIndex];
        for(i=startIndex+1; i<=endIndex; i++) {
            if( source[i] > maxValue) {
                maxValue = source[i];
            }
            if( source[i] < minValue) {
                minValue = source[i];
            }
        }
        hashKoef = ((double)(k-1)*0.9)*((double)(endIndex-startIndex)/((double)maxValue-(double)minValue));
        System.out.println(hashKoef);
    }

    // Склеивание двух смежных отсортированных частей массива
    public void stickParts(int startIndex, int mediana, int endIndex) {
        int i=startIndex;
        int j=mediana+1;
        int k=0;
        while(i<=mediana && j<=endIndex) {
            if(source[i]<source[j]) {
                tmp[k] = source[i];
                i++;
            } else {
                tmp[k] = source[j];
                j++;
            }
            k++;
        }

        if( i>mediana ) {
            while(j<=endIndex) {
                tmp[k] = source[j];
                j++;
                k++;
            }
        }
        if(j>endIndex) {
            while(i<=mediana) {
                tmp[k] = source[i];
                i++;
                k++;
            }
        }

        System.arraycopy(tmp, 0, source, startIndex, endIndex-startIndex+1);
    }

    // Сдвиг вправо во временном массиве для разрешения коллизий
    boolean shiftRight(int index) {

        int endpos = index;
        while( tmp[endpos] != 0) {
            endpos++;
            if(endpos == TMPLEN) return false;
        }

        while(endpos != index ) {
            tmp[endpos] = tmp[endpos-1];
            endpos--;
        }

        tmp[endpos] = 0;

        return true;
    }

    // хэш-функция для хэширующей сортировки
    public int hash(int value) {
        return (int)(((double)value - (double)minValue)*hashKoef);
    }

    // вставка значений во временный массив с разрешением коллизий
    public void insertValue(int index, int value) {
        int _index = index;
        while(tmp[_index] != 0 && tmp[_index] <= value) { _index++; }
        if( tmp[_index] != 0) {
            shiftRight(_index);
        }
        tmp[_index] = value;
    }

    // копирование отсортированных данных из временного массива в исходный
    public void extract(int startIndex, int endIndex) {
        int j=startIndex;
        for(int i=0; i<(SORTBLOCK*k); i++) {
            if(tmp[i] != 0) {
                source[j] = tmp[i];
                j++;
            }
        }
    }

    public void clearTMP() {

        if( tmp.length < SORTBLOCK*k) {
            Arrays.fill(tmp, 0);
        } else {
            Arrays.fill(tmp, 0, SORTBLOCK*k, 0);
        }
    }

    // Хэширующая сортировка
    public void hashingSort(int startIndex, int endIndex) {

        // 1. Поиск минимального и максимального значения с вычислением хэширующего коэффициента
        findMinMax(startIndex, endIndex);

        // 2. Очистка временного массива
        clearTMP();

        // 3. Вставка во временный массив с использованием хэш-функции
        for(int i=startIndex; i<=endIndex; i++) {
            insertValue(hash(source[i]), source[i]);
        }

        // 4. Перемещение отсортированных данных из временного массива в исходный
        extract(startIndex, endIndex);
    }

    // Рекурсивный спуск с дихотомией до уровня блока хэширующей сортировки
    public void sortPart(int startIndex, int endIndex) {
        if( (endIndex - startIndex) <= SORTBLOCK ) {
            hashingSort(startIndex, endIndex);
            return;
        }

        int mediana = startIndex + (endIndex - startIndex) / 2;
        sortPart(startIndex, mediana);
        sortPart(mediana+1, endIndex);
        stickParts(startIndex, mediana, endIndex);
    }

    public Array sort(Array mas) throws ServiceException{
        try {
            chekMas(mas);
        }
        catch (ServiceException e){
            throw new ServiceException(e);
        }
        source = mas.getMas();
        SOURCELEN = mas.length();
        sortPart(0, SOURCELEN-1);
        Array out = new Array(source);
        sortLogger.info("Sorting completed successfully");
        return out;
    }

}