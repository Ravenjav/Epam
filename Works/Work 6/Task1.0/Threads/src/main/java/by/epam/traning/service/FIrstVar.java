package by.epam.traning.service;

import by.epam.traning.entity.Matrix;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FIrstVar extends Thread{

    private int num;
    private int nach;
    private int oper;
    private Lock lock = new ReentrantLock();
    Matrix mas;

    public FIrstVar(Matrix mas, int num, int nach, int oper){
        this.mas = mas;
        this.num = num;
        this.nach = nach;
        this.oper = oper;
    }

    public void run() {
        for (int i = nach; i < (nach + oper); i++){
            lock.lock();
            try {
                mas.setel(i, i, num);
            }finally {
                lock.unlock();
            }
        }
    }

    public Matrix getMas() {
        return mas;
    }
}
