package mission;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(getFactorial(5));

        getCommonDivisorMultiple(12, 18);
    }

    public static int getFactorial(int value) {

        int result = 1;
        for (int i = value; i > 0; i--) {
            result *= i;
        }

        return result;
    }

    public static void getCommonDivisorMultiple(int a, int b) {

        int min = 0;
        int max = 0;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        int commonDivisor = 0;
        int commonMultiple = 0;

        while (true) {
            int rem = max % min;
            if (rem == 0) {
                commonDivisor = min;
                commonMultiple = a * b / commonDivisor;

                break;
            } else {
                max = min;
                min = rem;
            }
        }

        System.out.println("commonDivisor = " + commonDivisor);
        System.out.println("commonMultiple = " + commonMultiple);

    }
}
