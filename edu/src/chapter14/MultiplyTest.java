package chapter14;

@FunctionalInterface
interface Multiply {
    double getValue();
    //double getValue2();
}

@FunctionalInterface
interface Verify {
    Boolean check(int n);
}


public class MultiplyTest {
    public static void main(String[] args) {
        Multiply m;
        m = () -> 3.14 * 2;
        System.out.println("m = " + m);

        Verify v = (n) -> (n % 2) == 0;
        System.out.println("v = " + v.check(9));

    }
}
