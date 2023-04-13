package chapter06;

public class Member {
	private String name;
	private int age;

	public Member() {
		System.out.println("Member() ������ ����");
	}

	public Member(String name) {
		System.out.print("Member(String) ������ ���� : ");
		System.out.println(name);
	}

	public Member(String name, int age) {
		System.out.print("Member(String, int) ������ ���� : ");
		System.out.println(name + " : " + age);
	}

	public void setName(String name) {
	}

	public static void main(String[] args) {
		System.out.println("main() �޼��� ����");
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
	}
}