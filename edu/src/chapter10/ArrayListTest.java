package chapter10;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("서울");
        list.add("부산");
        list.add("창원");
        list.add("경기");
        list.add("울산");
        list.add("인천");

        // System.out.println(list.toString());

        System.out.println("-".repeat(50));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.add(3, "밀양");

        System.out.println("-".repeat(50));
        for (String s : list) {
            System.out.println(s);
        }

        list.remove(2);

        System.out.println("-".repeat(50));
        for (String s : list) {
            System.out.println(s);
        }

        // List 의 toString()
        System.out.println("-".repeat(50));
        System.out.println(list.toString());

    }
}
