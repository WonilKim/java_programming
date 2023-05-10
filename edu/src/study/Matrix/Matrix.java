package study.Matrix;

import java.util.ArrayList;
import java.util.Random;

public class Matrix <T> {

    private int rows;
    private int cols;

    // private T[][] data;

    private ArrayList<T> data;

    private final Class<T> type;

    public Class<T> getMyType() {
        return this.type;
    }

    public Matrix(int row, int col, Class<T> type) {
        this.rows = row;
        this.cols = col;

        data = new ArrayList<T>();

        this.type = type;

        System.out.println(this.type);


        // setData();
    }

    private void setData() {
        Random rand = new Random(System.currentTimeMillis());

        for (int i = 0; i < this.rows * this.cols; i++) { // 행x열의 개수
            if(this.type == Integer.class) {
                // data.add((T)rand.nextInt(100));
            }

            // data.add(rand.nextInt(100));
        }
    }

    protected void showData() {

        // for (int i = 0; i < this.rows; i++) { // 행의 개수
        //     for (int j = 0; j < this.cols; j++) { // 열의 개수
        //         System.out.print(this.data[i][j] + "\t");
        //     }
        //     System.out.println();
        // }
    }

}
