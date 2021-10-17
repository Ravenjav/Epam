package by.epam.traning.entity;

import java.util.ArrayList;

public class Matrix {
    private State state;
    private ArrayList<ArrayList<Integer>> matrix;

    public Matrix(ArrayList<ArrayList<Integer>> mas){
        matrix = mas;
        state = new FreeState();
    }

    public void setMatrix(ArrayList<ArrayList<Integer>> matrix){
        this.matrix = matrix;
    }

    public void setel(int x, int y, int ind){
        ArrayList<Integer> mas = matrix.get(x);
        mas.set(y, ind);
        matrix.set(x, mas);
    }

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

    public void out(){
        for (int i = 0; i < matrix.size(); i++){
            for (int j = 0; j < matrix.get(i).size(); j++){
                System.out.print(matrix.get(i).get(j));
            }
            System.out.println();
        }
    }
}
