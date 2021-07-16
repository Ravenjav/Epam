package By.Epam.Traning.entity;

import java.util.Arrays;

public class Matrix  {
    private int[][] matrix;

    public Matrix(){
        matrix = null;
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getElement(int n, int m) {
        return matrix[n][m];
    }

    public void setElement(int n, int m, int value) {
        matrix[n][m] = value;
    }

    public int length() {
        return matrix.length;
    }

    public int length_dop(int str){ return matrix[str].length;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        int length = matrix.length();
        int length2;
        for (int i = 0; i < length; i++) {
            if (matrix.length_dop(i) != this.matrix[i].length)
                return false;
            length2 = matrix.length_dop(i);
            for (int j = 0; j < length2; j++) {
                if (matrix.getElement(i, j) != this.matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public int hashCode() {
        return Arrays.hashCode(matrix);
    }

    public void swap(int left_n, int left_m, int rigth_n, int right_m) {
        int tmp = matrix[left_n][left_m];
        matrix[left_n][left_m] = matrix[rigth_n][right_m];
        matrix[rigth_n][right_m]= tmp;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < matrix.length; i++)
            out += Arrays.toString(matrix[i]) + '\n';
        return out;
    }
}
