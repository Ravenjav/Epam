package by.epam.traning.service;

import by.epam.traning.entity.Matrix;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class FourthVar {
    private int num;
    private int nach;
    private int oper;
    private CountDownLatch latch = new CountDownLatch(4);

    Matrix mas;

    public void FourtVar(Matrix mas, int num, int nach, int oper){
        this.mas = mas;
        this.num = num;
        this.nach = nach;
        this.oper = oper;
    }

    public void run() {
        try {
            latch.await();
            latch.countDown();
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
