package chapter09;

public class Test01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		Class c = obj1.getClass();
		System.out.println(c.getName());

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3.toString());

		System.out.println(obj1);
		System.out.println(obj2.getClass());	
		System.out.println(obj3.getClass().getName());

		//
		MyObject obj4 = new MyObject();
		System.out.println(obj4);
		MyObject obj5 = new MyObject();
		if (obj4.equals(obj5)) {
			System.out.println("동일한 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}

		if (obj4 == obj5) {
			System.out.println("동일한 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}

		//
		String s1 = new String("abcd");
        String s2 = new String("abcd");

        if(s1 == s2){
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        if(s1.equals(s2)){
            System.out.println("s1.equals(s2) = true");
        } else {
            System.out.println("s1.equals(s2) = false");
        }


	}
}