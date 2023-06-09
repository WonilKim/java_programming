package Tetris;

import java.util.Random;
import java.util.Scanner;

public class TetrisMain implements Runnable {

    static private Block b;

    public static void main(String[] args) {

        Thread cmd = new Thread(new TetrisMain());
        cmd.start();

        while (true) {

            String[] arrColor = new String[] { "white", "Blue", "Red", "Green", "Orange" };
            String[] arrShape = new String[] { "ㄱ", "ㄴ", "ㄹ", "ㅁ", "ㅣ" };

            Random rand = new Random(System.currentTimeMillis());

            int r1 = rand.nextInt(5);
            int r2 = rand.nextInt(5);
            // System.out.println("r1 = " + r1);
            // System.out.println("r2 = " + r2);

            // 블럭 만들기
            b = new Block(arrColor[r1], arrShape[r2]);

            // 블럭 떨어트리기
            b.Drop();

        }

    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (true) {
            String c = sc.nextLine();
            switch (c) {
                case "a":
                    b.MoveLeft();
                    break;
                case "d":
                    b.MoveRight();
                    break;
                case "s":
                    b.Acc();
                    break;
                case "w":
                    b.Rotate();
                    break;
                case "x":
                    exit = true;
                    break;
            }

            if (exit == true) {
                break;
            }
        }
        sc.close();
    }

}
