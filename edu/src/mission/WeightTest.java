package mission;

import java.util.Scanner;

public class WeightTest {
    public static void main(String[] args) {
        /*
         * 2g, 3g, 5g 의 추가 각각 10개씩 있을때, 10~100 사이의 임의의 값을
         * 입력 받고, 추의 합이 입력 받은 값이 되는 경우를 찾아서 출력하세요.
         * 단, 각각의 추는 1개 이상은 사용되어야 합니다.
         */

        int num = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        num = sc.nextInt();

        // 각각의 추는 반드시 1개 이상 사용
        int weight5g = 1;
        int weight3g = 1; 
        int weight2g = 1;

        // 1개씩 미리 사용된 추들의 무게합 차감. (5 + 3 + 2)
        int temp = num - (5 + 3 + 2);

        // 5g 추의 갯수와 나머지 확인
        weight5g += temp / 5;
        temp = temp % 5; 

        // 나머지가 1인 경우 5g 추 하나를 빼고 나머지에 5를 더함
        if(temp == 1) {
            temp += 5;
            weight5g--;
        }

        if(temp % 3 == 0) {
            // 나머지가 3으로 나누어 떨어지면 3g 추 사용
            weight3g += temp / 3;
            temp = temp % 3; 
        } else {
            // 나머지가 2으로 나누어 떨어지면 2g 추 사용
            weight2g += temp / 2;
            temp = temp % 2; 
        }

        System.out.println("입력 값 = " + num);
        System.out.println("weight5g = " + weight5g + ", " + (weight5g * 5));
        System.out.println("weight3g = " + weight3g + ", " + (weight3g * 3));
        System.out.println("weight2g = " + weight2g + ", " + (weight2g * 2));
        System.out.println("나머지 = " + temp);

        // 11 입력시 2g 3g 5g 을 1개씩 사용할 수 없음.

    }
}
