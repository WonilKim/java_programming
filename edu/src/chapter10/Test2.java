package chapter10;

import java.util.ArrayList;

class Student {
    int sid;
    String name;

    Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Object arr[] = new Object[10];
        String s = "java";
        Integer i = 123;
        arr[0] = s; // arr 는 String 의 부모인 Object 타입 배열이므로 String s 대입 가능
        arr[1] = i; // arr 는 Integer 의 부모인 Object 타입 배열이므로 Integer i 대입 가능
        int l = arr.length;
        int len = arr[0].length(); // 오류발생 "The method length() is undefined for the type Object"
        // arr[0] 에 s 가 들어있고, s 는 String 이다.
        int ll = s.length();
        // String 타입에는 length() 가 있지만 
        // Object 타입 배열에 들어가 있는 s 는 부모인 Object 타입으로 변환되어 있으므로
        // arr[0] 은 Object 타입이며 Object 타입에는 length() 가 정의되어 있지 않다.

        ArrayList lst = new ArrayList();
        lst.add(s);
        lst.add(i);
        lst.get(0).toString();

        //
        ArrayList<Student> list = new ArrayList<Student>();

        Student ss = new Student(11, "Hong");
        list.add(ss);

    }
}
