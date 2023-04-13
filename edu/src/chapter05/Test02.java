package chapter05;

public class Test02 {

	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		test("������", 98, 85, 88);
		test("��Ǫ��", 90, 95, 92);
		test("���ϴ�", 80, 98, 95);
	}
}