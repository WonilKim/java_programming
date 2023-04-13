package chapter07;

public class StringAlignTest {
	public static void main(String[] args) {
		
		String s = "abc";
		int i = 12345;
		double d = 123.456d;
		
		System.out.println("-".repeat(10));
		System.out.println(String.format("%10s", s) + ":" + "%10s");
		System.out.println(String.format("%-10s", s) + ":" + "%-10s");
		System.out.println(String.format("%10d", i) + ":" + "%10d");
		System.out.println(String.format("%-10d", i) + ":" + "%-10d");
		System.out.println(String.format("%10.2f", d) + ":" + "%10f");
		System.out.println(String.format("%-10.2f", d) + ":" + "%-10f");
	}
}
