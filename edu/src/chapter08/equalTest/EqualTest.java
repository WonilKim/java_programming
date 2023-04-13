package chapter08.equalTest;

public class EqualTest {
    public static void main(String[] args) {
        String s1 = new String("abcd");
        String s2 = new String("abcd");

        if(s1 == s2){
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        if(s1.equals(s2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
