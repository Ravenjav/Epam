package by.epam.traning.control;

import by.epam.traning.entity.Matrix;
import by.epam.traning.service.FIrstVar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<ArrayList<Integer>> mas = new ArrayList<ArrayList<Integer>>();
        int n = 12;
        for (int i = 0; i < n; i++){
            ArrayList<Integer> mas0 = new ArrayList<>();
            for(int j = 0; j < n; j++){
                mas0.add(0);
            }
            mas.add(mas0);
        }
        Matrix mas1 = new Matrix(mas);
        int m = 4, o = n / m;
        for (int i = 0; i < m; i++){
            FIrstVar thread = new FIrstVar(mas1, i + 1, i * o, o);
            thread.start();
            mas1 = thread.getMas();
        }
        Thread.sleep(100);
        mas1.out();
        System.out.println();

        Matrix mas2 = new Matrix(mas);
        for (int i = 0; i < m; i++){
            FIrstVar thread = new FIrstVar(mas2, i + 1, i * o, o);
            thread.start();
            mas1 = thread.getMas();
        }
        Thread.sleep(100);
        mas2.out();
        System.out.println();

        Matrix mas3 = new Matrix(mas);
        for (int i = 0; i < m; i++){
            FIrstVar thread = new FIrstVar(mas3, i + 1, i * o, o);
            thread.start();
            mas1 = thread.getMas();
        }
        mas3.out();
        System.out.println();

        Matrix mas4 = new Matrix(mas);
        for (int i = 0; i < m; i++){
            FIrstVar thread = new FIrstVar(mas4, i + 1, i * o, o);
            thread.start();
            mas1 = thread.getMas();
        }
        mas4.out();
        System.out.println();
    }
}
