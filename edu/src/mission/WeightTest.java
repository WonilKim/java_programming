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
        sc.close();

        // 각각의 추는 반드시 1개 이상 사용
        int count5g = 1;
        int count3g = 1; 
        int count2g = 1;

        // 1개씩 미리 사용된 추들의 무게합 차감. (5 + 3 + 2)
        int remainder = num - (5 + 3 + 2);

        // 사용되는 추의 개수를 최소화 하기 위해 5g 추 부터 사용.
        // 5g 추의 갯수와 나머지 확인
        count5g += remainder / 5;
        remainder = remainder % 5; 

        // 나올 수 있는 나머지 값 = 0, 1, 2, 3, 4
        // 나머지가 1인 경우 2g 과 3g 추를 사용할 수 없기 때문에
        // 5g 추 하나를 빼고 나머지에 5를 더해 6으로 만들어줌.
        if(remainder == 1) {
            remainder += 5;
            count5g--;
        }

        if(remainder % 3 == 0) {
            // 나머지가 3으로 나누어 떨어지면 3g 추 사용
            count3g += remainder / 3;
            remainder = remainder % 3; 
        } else {
            // 나머지가 2으로 나누어 떨어지면 2g 추 사용
            count2g += remainder / 2;
            remainder = remainder % 2; 
        }

        // 결과 출력
        System.out.println("weight5g = " + count5g + "개, 무게의 합 = " + (count5g * 5) + "g");
        System.out.println("weight3g = " + count3g + "개, 무게의 합 = " + (count3g * 3) + "g");
        System.out.println("weight2g = " + count2g + "개, 무게의 합 = " + (count2g * 2) + "g");
        System.out.println("입력 받은 값 = " + num);
        System.out.println("사용한 추의 총 무게 = " + (count5g * 5 + count3g * 3 + count2g * 2));
        System.out.println("나머지 = " + remainder);
        System.out.println("사용한 추의 총 개수 = " + (count5g + count3g + count2g));

        // 11 입력시 2g 3g 5g 을 1개씩 사용할 수 없음.

    }
}
