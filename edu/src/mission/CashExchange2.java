package mission;

import java.util.Scanner;

public class CashExchange2 {
	public static void main(String[] args) {
		
		int money = 0;		
		Scanner sc = new Scanner(System.in);	
		System.out.println("상품 가격을 입력하세요.");
		money = sc.nextInt();
		
		// for loop
		System.out.println("-".repeat(50));
		int[] bills = new int[] {50000, 10000, 5000, 1000};
		int tempMoney = money;
		int[] billCounts = new int[bills.length];
		
		for(int i=0; i<bills.length; i++) {
			//bill50000 = (int)(temp / 50000);
			//temp = temp % 50000;
			
			billCounts[i] = (int)(tempMoney / bills[i]);
			tempMoney = tempMoney % bills[i];
			
			System.out.println(bills[i] + "원권 * " + billCounts[i]);
		}
		System.out.println("할인 금액 = " + tempMoney);
		sc.close();

	}
}
