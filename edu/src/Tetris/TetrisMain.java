package Tetris;

import java.util.Random;
import java.util.Scanner;

public class TetrisMain implements Runnable {

    static Block b;

    public static void main(String[] args) {

        Thread cmd = new Thread(new TetrisMain());
        cmd.start();

        String[] arrColor = new String[] { "white", "blue", "red", "green", "orange" };
        String[] arrShape = new String[] { "ㄱ", "ㄴ", "ㄹ", "ㅁ", "ㅣ" };

        Random r = new Random(System.currentTimeMillis());

        while (true) {
            int ci = r.nextInt(5);
            int si = r.nextInt(5);

            // 새 블럭 만들기
            b = new Block(arrColor[ci], arrShape[si]);
            System.out.println("- 새 블럭 생성 -");

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
                    b.MoveDown();
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