package mission;

import java.util.Scanner;

public class CashExchange {

	public static void main(String[] args) {
		
		int money = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 가격을 입력하세요.");
		money = sc.nextInt();
		int temp = money;
		
		int bill50000 = 0;
		int bill10000 = 0;
		int bill5000 = 0;
		int bill1000 = 0;
		
		bill50000 = (int)(temp / 50000);
		temp = temp % 50000;
		
		bill10000 = (int)(temp / 10000);
		temp = temp % 10000;

		bill5000 = (int)(temp / 5000);
		temp = temp % 5000;
		
		bill1000 = (int)(temp / 1000);
		temp = temp % 1000;
		
		System.out.println("-".repeat(50));
		System.out.println("50000원권 * " + bill50000);
		System.out.println("10000원권 * " + bill10000);
		System.out.println("5000원권 * " + bill5000);
		System.out.println("1000원권 * " + bill1000);
		System.out.println("할인 금액 = " + temp);
		
		sc.close();
	}
}
