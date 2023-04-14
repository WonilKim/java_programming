package chapter09;

public class Test02 {

	public static void main(String[] args) {

		String s1 = new String("java");
		String s2 = "java";

		String s3 = new String("java");
		String s4 = "java";

		if (s1 == s2) {
			System.out.println("s1 과 s2 는 동일 객체.");
		} else {
			System.out.println("s1 과 s2 는 다른 객체.");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 과 s2 는 동일 문자열을 가짐.");
		} else {
			System.out.println("s1 과 s2 는 다른 문자열을 가짐.");
		}

		int a = 111;
		int b = 111;

		if (a == b) {
			System.out.println("a 과 b 는 같은 값.");
		} else {
			System.out.println("a 과 b 는 다른 값.");
		}

		//// int 형은 equals 함수가 없음.
		// if (a.equals(b)) {
		// 	System.out.println("a 과 b 는 동일 문자열을 가짐.");
		// } else {
		// 	System.out.println("a 과 b 는 다른 문자열을 가짐.");
		// }

		if (s1 == s3) {
			System.out.println("s1 과 s3 는 동일 객체.");
		} else {
			System.out.println("s1 과 s3 는 다른 객체.");
		}
		if (s2 == s4) {
			System.out.println("s2 과 s4 는 동일 객체.");
		} else {
			System.out.println("s2 과 s4 는 다른 객체.");
		}
		if (s1.equals(s3)) {
			System.out.println("s1 과 s3 는 동일 문자열을 가짐.");
		} else {
			System.out.println("s1 과 s3 는 다른 문자열을 가짐.");
		}
		if (s2.equals(s4)) {
			System.out.println("s2 과 s4 는 동일 문자열을 가짐.");
		} else {
			System.out.println("s2 과 s4 는 다른 문자열을 가짐.");
		}
		String s5 = "JAVA";

		if (s1.equals(s5)) {
			System.out.println("s1 과 s5 는 동일 문자열을 가짐.");
		} else {
			System.out.println("s1 과 s5 는 다른 문자열을 가짐.");
		}

		if (s1.equalsIgnoreCase(s5)) {
			System.out.println("s1 과 s5 는 동일 문자열을 가짐.");
		} else {
			System.out.println("s1 과 s5 는 다른 문자열을 가짐.");
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}