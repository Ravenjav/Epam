package by.epam.traning.service;

import by.epam.traning.entity.Matrix;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SecondVar extends Thread{

    private int num;
    private int nach;
    private int oper;
    private final Semaphore semaphore = new Semaphore(1, true);
    Matrix mas;

    public SecondVar(Matrix mas, int num, int nach, int oper){
        this.mas = mas;
        this.num = num;
        this.nach = nach;
        this.oper = oper;
    }

    public void run() {
        for (int i = nach; i < (nach + oper); i++){
            try {
                semaphore.acquire();
                mas.setel(i, i, num);
            }catch (InterruptedException e) { }
            finally {
                semaphore.release();
            }
        }
    }

    public Matrix getMas() {
        return mas;
    }
}
