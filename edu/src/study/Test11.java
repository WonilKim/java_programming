package study;

public class Test11 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = new int[][] { {11, 12, 13}, {14, 15, 16}, {17, 18, 19}};

        int[][] matrix3 = new int[3][3];

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matrix3[i][j] + "\t");
            }
            System.out.print("\n");
        }
       
        int[][] matrix4 = AddMatrix(matrix1, matrix2);

    }

    private static int[][] AddMatrix(int[][] m1, int[][] m2) {


    }
}
