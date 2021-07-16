package By.Epam.Traning.entity;

import java.util.Arrays;

public class Array {
    private int[] mas;

    public Array(){
        mas = null;
    }

    public Array(int[] mas) {
        this.mas = mas;
    }

    public int[] getMas() {
        return mas;
    }

    public int getElement(int ind) {
        return mas[ind];
    }

    public void setElement(int ind, int value) {
        mas[ind] = value;
    }

    public int length() {
        return mas.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        int length = array.length();
        for (int i = 0; i < length; i++) {
            if(array.getElement(i) != mas[i]) {
                return false;
            }
        }
        return true;
    }

    public void swap(int left, int rigth) {
        int tmp = mas[left];
        mas[left] = mas[rigth];
        mas[rigth] = tmp;
    }

    @Override
    public String toString() {
        return "Array{" +
                "mas=" +Arrays.toString(mas) +
                '}';
    }
}
