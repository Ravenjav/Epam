package by.epam.traning.service;

import by.epam.traning.entity.Matrix;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class ThirdVar extends Thread{

    private int num;
    private int nach;
    private int oper;
    private CyclicBarrier barrier = new CyclicBarrier(4);
    Matrix mas;

    public ThirdVar(Matrix mas, int num, int nach, int oper){
        this.mas = mas;
        this.num = num;
        this.nach = nach;
        this.oper = oper;
    }

    public void run() {
        try {
            barrier.await();
        }catch (BrokenBarrierException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for (int i = nach; i < (nach + oper); i++){
            mas.setel(i, i, num);
        }
    }

    public Matrix getMas() {
        return mas;
    }
}
