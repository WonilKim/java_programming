package study;

public class Test {

    /**
     * 두 정수를 더한 결과를 출력해 주는 함수.
     *
     * @param a : 덧셈의 첫 번째 정수 ({@code int}) 값.
     * @param b : 덧셈의 두 번째 정수 ({@code int}) 값.
     * @return a 와 b 를 더한 결과값.
     */
    public static int sum(int a, int b) {
        // a 와 b 를 파라미터로 받아서 더한 후 반환.
        return a + b;

    }

    public static void main(String[] args) {

        int a = 10;
        int b = 22;

        double d1 = 99.0d;
        double d2 = 100.1d;

        float f = sum((float)d1, (float)d2);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //int test = 99999999999;
        long l = 99999999999l;

        float f = 1;
        System.out.println("f = " + f);

        int x = 13;
        int y = 45;

        int z = sum(x, y);

        System.out.println("z = " + z);

    }

    public static float sum(float x, float y) {
        return x + y;
    }
}
