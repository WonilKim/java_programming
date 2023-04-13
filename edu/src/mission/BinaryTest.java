package mission;

import java.util.Scanner;

public class BinaryTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("10진수를 입력하세요.");
        int num = sc.nextInt();
        //int num = 11;

        int temp = num;

        int[] quotient = new int[100];
        int[] remainder = new int[100];
        int i=0;
        System.out.println("input value = " + temp);
        while(temp > 0) {
            quotient[i] = temp / 2;
            remainder[i] = temp % 2;
            temp = quotient[i];

            System.out.println("quotient[i] = " + quotient[i]);
            System.out.println("remainder[i] = " + remainder[i]);
            i++;

        }

        int count = i;
        System.out.println("count = " + count);

        String str = "";
        for(int j=0; j<count; j++) {
            str += remainder[count - 1 - j];
        }

        System.out.println("str = " + str);

        sc.close();
    }
}